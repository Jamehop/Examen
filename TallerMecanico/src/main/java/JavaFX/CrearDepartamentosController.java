package JavaFX;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import Dao.DAO;
import Dao.ServicioDepartamentosDAO;
import Modelos.ChapaPintura;
import Modelos.Departamentos;
import Modelos.DepartamentosBuilder;
import Modelos.Mecanica;
import Modelos.Trabajador;
import Modelos.Ventas;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class CrearDepartamentosController implements Initializable {
	public static DAO<Departamentos> UnidadesActivas = new ServicioDepartamentosDAO();
	@FXML
	private RadioButton btnCP;

	@FXML
	private ToggleGroup departamentos;

	@FXML
	private RadioButton btnMecanica;

	@FXML
	private RadioButton btnVentas;

	@FXML
	private RadioButton btnZaragoza;

	@FXML
	private ToggleGroup ciudad;

	@FXML
	private RadioButton btnHuesca;

	@FXML
	private RadioButton btnTeruel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	
	@FXML
    void crear() throws Exception {
		Trabajador uno = new Trabajador(1, "Manolo");
		Trabajador dos = new Trabajador(2, "Pepe");
		Trabajador tres = new Trabajador(3, "Benito");
		Trabajador cuatro = new Trabajador(4, "Laura");
		Trabajador cinco = new Trabajador(5, "Victoria");
		Trabajador seis = new Trabajador(6, "Rosa");
		Trabajador siete = new Trabajador(7, "Miguel");

		if(btnCP.isSelected())
		{

			if (btnZaragoza.isSelected()) {
				ChapaPintura cp = DepartamentosBuilder.crearChapaPintura(1, Arrays.asList(seis, siete), "Zaragoza");
				UnidadesActivas.save(cp);
				// System.out.println(g.toString());

			}
			if (btnHuesca.isSelected()) {

				ChapaPintura cp = DepartamentosBuilder.crearChapaPintura(1, Arrays.asList(seis, siete), "Huesca");
				UnidadesActivas.save(cp);
				// System.out.println(g.toString());
			}
			if (btnTeruel.isSelected()) {

				ChapaPintura cp = DepartamentosBuilder.crearChapaPintura(1, Arrays.asList(seis, siete), "Teruel");
				UnidadesActivas.save(cp);
				// System.out.println(g.toString());

			}
			// System.out.println(UnidadesActivas.getAll().toString());

		}
		if(btnMecanica.isSelected())
		{

			if (btnZaragoza.isSelected()) {
				Mecanica cp = DepartamentosBuilder.crearMecanica(1, Arrays.asList(seis, siete), "Zaragoza");
				UnidadesActivas.save(cp);
				// System.out.println(g.toString());

			}
			if (btnHuesca.isSelected()) {

				Mecanica cp = DepartamentosBuilder.crearMecanica(1, Arrays.asList(seis, siete), "Huesca");
				UnidadesActivas.save(cp);
				// System.out.println(g.toString());
			}
			if (btnTeruel.isSelected()) {

				Mecanica cp = DepartamentosBuilder.crearMecanica(1, Arrays.asList(seis, siete), "Teruel");
				UnidadesActivas.save(cp);
				// System.out.println(g.toString());

			}
			// System.out.println(UnidadesActivas.getAll().toString());

		}
		if(btnVentas.isSelected())
		{

			if (btnZaragoza.isSelected()) {
				Ventas cp = DepartamentosBuilder.crearVentas(1, Arrays.asList(seis, siete), "Zaragoza");
				UnidadesActivas.save(cp);
				// System.out.println(g.toString());

			}
			if (btnHuesca.isSelected()) {

				Ventas cp = DepartamentosBuilder.crearVentas(1, Arrays.asList(seis, siete), "Huesca");
				UnidadesActivas.save(cp);
				// System.out.println(g.toString());
			}
			if (btnTeruel.isSelected()) {

				Ventas cp = DepartamentosBuilder.crearVentas(1, Arrays.asList(seis, siete), "Teruel");
				UnidadesActivas.save(cp);
				// System.out.println(g.toString());

			}
			// System.out.println(UnidadesActivas.getAll().toString());

		}
    }
	/*public void irAllamadas() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/recursos/SistemaNotificaciones.fxml"));
		
		Parent root = loader.load();
		
		
		SistemaNotificacionesController controller = loader.getController();
		
		Scene scene = new Scene(root);
		Stage stage = new Stage();

		stage.setScene(scene);
		
		stage.show();
		
		
		Stage myStage = (Stage) this.BtonCrear.getScene().getWindow();
		
		
		myStage.close();
		
	}*/
	
}
