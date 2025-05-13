package test;


import negocio.*;
import java.time.LocalDate;
import datos.Empleado;


public class TestABM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		DepartamentoABM abmDepartamento = new DepartamentoABM();
		UsuarioABM abmUsuario = new UsuarioABM();
		OrganizacionABM abmOrganizacion= new OrganizacionABM();
		TicketABM abmTicket = new TicketABM();
		RespuestaABM abmRespuesta= new RespuestaABM();
		Empleado empleado = new Empleado("Adminisrador","Administrador",123456,"administrador@gmail.com",LocalDate.now(),null,true, null,true,null);
		
		//System.out.print(empleado.toString());
		try {
			
			//Cargo los departamento
			abmDepartamento.agregarDepartamento("General");
			abmDepartamento.agregarDepartamento("Software");
			abmDepartamento.agregarDepartamento("Hardware");		
			//Cargo organizaciones
			abmOrganizacion.agregar("MCDonald","ArcosDorados S.A","30610252334","Av. Hipólito Yrigoyen 7545","https://maps.app.goo.gl/vHv1zoKu72W68b5v6");
			abmOrganizacion.agregar("Bernal","Bernal S.A","30680252334","Av. Corrientes 7545","https://maps.app.goo.gl/vHv1zoKu72W68b5v6");
			abmOrganizacion.agregar("Gustavo e hijos","GEH S.A","30680252335","Cochabamba 1234","https://maps.app.goo.gl/vHv1zoKu72W68b5v6");
			abmOrganizacion.agregar("Luey","Luey S.A","30880252335","Camino general belrano 8934","https://maps.app.goo.gl/vHv1zoKu72W68b5v6");
			//Cargo Empleaos del sistema de ticket
			abmUsuario.agregarEmpleado(empleado, "Ribem", "123456", "Mariano", "Ribe", 39277077,"marianoaugustoribe@gmail.com",true,abmDepartamento.traerPorArea("General"));
			abmUsuario.agregarEmpleado(empleado, "NicoG", "123456", "Nicolas", "Gutierrez", 35847627,"nicolas64@gmail.com",false,abmDepartamento.traerPorArea("Software"));
			abmUsuario.agregarEmpleado(empleado, "PabloR", "123456", "Pablo", "Romero", 29875189,"pabloRomero@gmail.com",false,abmDepartamento.traerPorArea("Software"));
			abmUsuario.agregarEmpleado(empleado, "CarlosC", "123456", "Carlos", "Carlata", 39282569,"Carlos23@gmail.com",false,abmDepartamento.traerPorArea("Hardware"));
			abmUsuario.agregarEmpleado(empleado, "OscarV", "123456", "Oscar", "Viverti", 39277877,"viverti@gmail.com",false,abmDepartamento.traerPorArea("Hardware"));
			//Cargo Clientes y les asigno su empresa
			abmUsuario.agregarCliente(empleado,"Garciar","1234156","Rosio", "Garcia", 123421567, "rominagarcia@gmail.com", abmOrganizacion.traerPorNombre("MCDonald"));
			abmUsuario.agregarCliente(empleado,"RomeroA","1234156","Agustina", "Romero", 223421567, "Agus1998@gmail.com", abmOrganizacion.traerPorNombre("MCDonald"));
			abmUsuario.agregarCliente(empleado,"AviliaA","1234156","Ariel", "Avilia", 123421587, "ariel@gmail.com", abmOrganizacion.traerPorNombre("MCDonald"));
			//agrego tickets
			abmTicket.agregar(abmUsuario.traerC(6), "No inicia el programa", "buenas tardes, no inicia el programa de facturacion en ningun pv", abmDepartamento.traerPorArea("General"), "Medio");
			abmTicket.agregar(abmUsuario.traerC(6), "No funciona la impresora", "buenas tardes, la impresora fiscal no responde", abmDepartamento.traerPorArea("General"), "Medio");
			abmTicket.agregar(abmUsuario.traerC(7), "Payway", "buenas tardes, queria saber como viene la integracion con payway", abmDepartamento.traerPorArea("General"), "Medio");
			//Reasigno ticket a sus departametnos correspondientes
			abmTicket.actualizarDepartamento(abmTicket.traer(1), abmDepartamento.traerPorArea("Software"));
			abmTicket.actualizarDepartamento(abmTicket.traer(2), abmDepartamento.traerPorArea("Hardware"));
			abmTicket.actualizarDepartamento(abmTicket.traer(3), abmDepartamento.traerPorArea("Software"));
			// les asigno un empleado
			abmTicket.asignarEmpleado(abmTicket.traer(1), abmUsuario.traerE(2));
			abmTicket.asignarEmpleado(abmTicket.traer(2), abmUsuario.traerE(4));
			abmTicket.asignarEmpleado(abmTicket.traer(3), abmUsuario.traerE(3));
			//Respondo los tickets
			abmRespuesta.agregar("Se logro solucionar el problema, el servicio de sql estaba detenido", abmUsuario.traerE(2), abmTicket.traer(1));
			abmRespuesta.agregar("La impresora no respnde, se cordina una visita tecnica  ", abmUsuario.traerE(4), abmTicket.traer(2));
			abmRespuesta.agregar("Seguimos trabajando en la integracion", abmUsuario.traerE(3), abmTicket.traer(3));
			//Cierro tickets
			abmTicket.actualizarEstado(abmTicket.traer(1), "Cerrado");
			System.out.flush();
			// traer  usuarios
			System.out.println("");
			System.out.println("");
			System.out.println(abmUsuario.traerUsuarios());
			//traer lista de empleados por departamento
			System.out.println("");
			System.out.println("");
			 System.out.println(abmUsuario.traerPorDepartamento(abmDepartamento.traerPorArea("Software")));
			//traer lsita de clientes por Organizacion
			 System.out.println("");
			 System.out.println("");
			System.out.println(abmUsuario.traerPorOrganizacion(abmOrganizacion.traerPorNombre("MCDonald")));
			// traer l tickets
			System.out.println("");
			System.out.println("");
			System.out.println(abmTicket.traer());
			// traer Tickets por empelado
			System.out.println("");
			System.out.println("");
			System.out.println(abmTicket.traerPorEmpleado(abmUsuario.traerE(3)));
		}catch (Exception e) {
           System.out.println("Error durante test: " + e.getMessage());
            e.printStackTrace();
        }

	}

}
