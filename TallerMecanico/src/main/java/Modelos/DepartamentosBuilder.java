package Modelos;

import java.util.List;

public class DepartamentosBuilder {

	// crear un departamento de Chapa & Pintura
	public static ChapaPintura crearChapaPintura(int id, List<Trabajador> trabajadores, String ciudad) {
		ChapaPintura chapaPintura = null;
		if (trabajadores.size() < 3) {
			chapaPintura = new ChapaPintura(id, trabajadores, ciudad);
		}

		return chapaPintura;

	}

	// crear un departamento de Mecanicos
	public static Mecanica crearMecanica(int id, List<Trabajador> trabajadores, String ciudad) {
		Mecanica mecanica = null;
		if (trabajadores.size() < 3) {
			mecanica = new Mecanica(id, trabajadores, ciudad);
		}

		return mecanica;

	}

	// crear un departamento de ventas
	public static Ventas crearVentas(int id, List<Trabajador> trabajadores, String ciudad) {
		Ventas ventas = null;
		if (trabajadores.size() < 2) {
			ventas = new Ventas(id, trabajadores, ciudad);
		}

		return ventas;

	}
}
