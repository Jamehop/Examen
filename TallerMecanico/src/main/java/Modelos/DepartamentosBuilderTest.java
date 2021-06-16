package Modelos;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Modelos.*;

class DepartamentosBuilderTest {
	Trabajador uno=new Trabajador(1, "Nombre1");
	Trabajador dos=new Trabajador(2, "Nombre2");
	Trabajador tres=new Trabajador(3, "Nombre3");
	Trabajador cuatro=new Trabajador(4, "Nombre4");
	Trabajador cinco=new Trabajador(5, "Nombre5");
	Trabajador seis=new Trabajador(6, "Nombre6");
	Trabajador siete=new Trabajador(7, "Nombre7");

	@Test
	ChapaPintura crearChapaPinturaTest(int id, List<Trabajador> trabajadores, String ciudad) {
		ChapaPintura chapaPintura = null;
		if (trabajadores.size() < 3) {
			chapaPintura = new ChapaPintura(id, trabajadores, ciudad);
		}
		else {
			fail("Error");
		}

		return chapaPintura;

	}
	@Test
	Mecanica crearMecanica(int id, List<Trabajador> trabajadores, String ciudad) {
		Mecanica Mecanica = null;
		if (trabajadores.size() < 3) {
			assertTrue(true);
		}
		else {
			fail("Error");
		}

		return Mecanica;

	}
	@Test
	Ventas crearVentas(int id, List<Trabajador> trabajadores, String ciudad) {
		Ventas Ventas = null;
		if (trabajadores.size() < 3) {
			assertTrue(true);
		}
		else {
			fail("Error");
		}

		return Ventas;

	}
}
