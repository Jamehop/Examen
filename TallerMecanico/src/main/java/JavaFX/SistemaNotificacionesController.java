package JavaFX;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

import Dao.DAO;
import Dao.ServicioDepartamentosDAO;
import Modelos.Departamentos;
import Modelos.PeticionesCliente;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class SistemaNotificacionesController implements Initializable{
	CrearDepartamentosController ventana;
	
	 @FXML
	    private Button btnPeticion;

	    @FXML
	    private RadioButton btnAccidente;

	    @FXML
	    private ToggleGroup departamentos;

	    @FXML
	    private RadioButton btnProblemaMecanico;

	    @FXML
	    private RadioButton btnComprador;

	    @FXML
	    private RadioButton btnZaragoza;

	    @FXML
	    private ToggleGroup ciudad;

	    @FXML
	    private RadioButton btnHuesca;

	    @FXML
	    private RadioButton btnTeruel;
    @FXML
    void enviarPeticion() {
    	if (btnAccidente.isSelected()) {

			if (btnZaragoza.isSelected()) {

				ventana.UnidadesActivas.enviarPeticion(PeticionesCliente.COCHE_ACCIDENTADO, btnZaragoza.getText());

			}
			if (btnHuesca.isSelected()) {

				
				ventana.UnidadesActivas.enviarPeticion(PeticionesCliente.COCHE_ACCIDENTADO, btnHuesca.getText());

			}
			if (btnTeruel.isSelected()) {

				
				ventana.UnidadesActivas.enviarPeticion(PeticionesCliente.COCHE_ACCIDENTADO, btnTeruel.getText());

			}

		}
    	if (btnProblemaMecanico.isSelected()) {

			if (btnZaragoza.isSelected()) {

				ventana.UnidadesActivas.enviarPeticion(PeticionesCliente.PROBLEMAS_MECANICOS, btnZaragoza.getText());

			}
			if (btnHuesca.isSelected()) {

				
				ventana.UnidadesActivas.enviarPeticion(PeticionesCliente.PROBLEMAS_MECANICOS, btnHuesca.getText());

			}
			if (btnTeruel.isSelected()) {

				
				ventana.UnidadesActivas.enviarPeticion(PeticionesCliente.PROBLEMAS_MECANICOS, btnTeruel.getText());

			}

		}
    	if (btnComprador.isSelected()) {

			if (btnZaragoza.isSelected()) {

				ventana.UnidadesActivas.enviarPeticion(PeticionesCliente.COMPRADOR, btnZaragoza.getText());

			}
			if (btnHuesca.isSelected()) {

				
				ventana.UnidadesActivas.enviarPeticion(PeticionesCliente.COMPRADOR, btnHuesca.getText());

			}
			if (btnTeruel.isSelected()) {

				
				ventana.UnidadesActivas.enviarPeticion(PeticionesCliente.COMPRADOR, btnTeruel.getText());

			}

		}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
