package Modelos;

import java.util.List;

public abstract class Departamentos {
	public int id;
	public List<Trabajador> listaTrabajadores;
	public String ciudad;
	public Departamentos(int id, List<Trabajador> listaTrabajadores, String ciudad) {
		super();
		this.id = id;
		this.listaTrabajadores = listaTrabajadores;
		this.ciudad = ciudad;
	}
	//llamada que se enviara a todos los departamentos
	public abstract String llamadaPedido(PeticionesCliente te, String provincia);
	
	
	
}
