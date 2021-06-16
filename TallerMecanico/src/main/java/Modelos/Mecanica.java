package Modelos;

import java.util.List;

public class Mecanica extends Departamentos{

	public Mecanica(int id, List<Trabajador> listaTrabajadores, String ciudad) {
		super(id, listaTrabajadores, ciudad);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String llamadaPedido(PeticionesCliente te, String provincia) {
		// TODO Auto-generated method stub
		String texto_peticion = null;
		if(this.ciudad.equals(provincia)
				&&(te.equals(PeticionesCliente.COCHE_ACCIDENTADO))||(te.equals(PeticionesCliente.PROBLEMAS_MECANICOS))) {
			texto_peticion="## Departamento: " + this.id + " de tipo Mecanica en la ciudad de  " + this.ciudad + " ha recibido la notificacion y se dirige alli! " +"\n";
		}
		return texto_peticion;
	}

}
