package dbmanager;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import com.jfoenix.controls.JFXTextField;

public class Controller {
	
//	Images
	
	
	
//	Side bars buttons
	
	@FXML
	private Button import_mysql_button;
	
	@FXML
	private Button import_excel_button;
	
	@FXML
	private Button import_calc_button;
	
	@FXML
	private Button dbm_button;
	
	@FXML
	private Button import_myfiles_button;
	
	@FXML
	private Button word_button;
	
//	DB Manager windows buttons
	
	@FXML
	private Button import_mysql_button_main;
	
	@FXML
	private Button import_excel_button_main;
	
	@FXML
	private Button import_calc_button_main;
	
	@FXML
	private Button import_word_button_main;
	
	@FXML
	private Button import_writer_button_main;
	
//	When side bars button is pressed
	
	@FXML
	private AnchorPane idmyfiles;
	
	@FXML
	private AnchorPane idcalc;
	
	@FXML
	private AnchorPane idexcel;
	
	@FXML
	private AnchorPane idmysql;
	
	@FXML
	private AnchorPane iddbm;
	
	@FXML
	private AnchorPane idwordfilled;
	
//	Button id
	
	@FXML
	private Button idword;
	
	@FXML
	private Button idcalcimgbutton;
	
	@FXML
	private Button idexcelimgbutton;
	
	@FXML
	private Button idmysqlbutton;
	
	@FXML
	private Button idwordimgbutton;
	
	@FXML
	private Button idwriterimgbutton;
	
//	Main windows
	
	@FXML
	private AnchorPane idexcelwindow;
	
	@FXML
	private AnchorPane iddbmwindow;
	
	@FXML
	private AnchorPane idcalctext;
	
	@FXML
	private AnchorPane idexceltext;
	
	@FXML
	private AnchorPane idmysqltext;
	
	@FXML
	private AnchorPane idwordtext;
	
	@FXML
	private AnchorPane idwritertext;
	
//	Setting up Excel field
	
	@FXML
	private JFXTextField idsetcol;
	
	@FXML
	private JFXTextField idsetrow;
	
//	@FXML
//	public void initialize() {
//		my_files_main_bar.setVisible(false);
//	}
	
//	Action on click
	
	@FXML
	void clickword(ActionEvent event) {
		FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        chooser.getExtensionFilters().add(new ExtensionFilter("Word Files", "*.docx"));
        File myWordFile = chooser.showOpenDialog(iddbm.getScene().getWindow());
	}
	
	@FXML
	void calcimgbuttonchange(ActionEvent event) {
		idcalcimgbutton.setStyle("-fx-border-color:  #92bbba; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idexcelimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idmysqlbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idwordimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idwriterimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idcalctext.setVisible(true);
		idexceltext.setVisible(false);
		idmysqltext.setVisible(false);
		idwordtext.setVisible(false);
		idwritertext.setVisible(false);
	}
	
	@FXML
	void excelimgbuttonchange(ActionEvent event) {
		idexcelimgbutton.setStyle("-fx-border-color:  #92bbba; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idcalcimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idmysqlbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idwordimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idwriterimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idcalctext.setVisible(false);
		idexceltext.setVisible(true);
		idmysqltext.setVisible(false);
		idwordtext.setVisible(false);
		idwritertext.setVisible(false);
	}
	
	@FXML
	void mysqlimgbuttonchange(ActionEvent event) {
		idmysqlbutton.setStyle("-fx-border-color:  #92bbba; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idexcelimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idcalcimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idwordimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idwriterimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idcalctext.setVisible(false);
		idexceltext.setVisible(false);
		idmysqltext.setVisible(true);
		idwordtext.setVisible(false);
		idwritertext.setVisible(false);
	}
	
	@FXML
	void wordimgbuttonchange(ActionEvent event) {
		idwordimgbutton.setStyle("-fx-border-color:  #92bbba; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idexcelimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idcalcimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idmysqlbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idwriterimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idcalctext.setVisible(false);
		idexceltext.setVisible(false);
		idmysqltext.setVisible(false);
		idwordtext.setVisible(true);
		idwritertext.setVisible(false);
	}
	
	@FXML
	void writerimgbuttonchange(ActionEvent event) {
		idwriterimgbutton.setStyle("-fx-border-color:  #92bbba; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idexcelimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idcalcimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idmysqlbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idwordimgbutton.setStyle("-fx-border-color:  #fff; -fx-background-radius:  5em; -fx-border-radius:  5em; -fx-border-width:  3px");
		idcalctext.setVisible(false);
		idexceltext.setVisible(false);
		idmysqltext.setVisible(false);
		idwordtext.setVisible(false);
		idwritertext.setVisible(true);
	}
	
    @FXML
    void clickdbm(ActionEvent event) {
    	System.out.println("Main");
    	idmyfiles.setVisible(false);
    	idcalc.setVisible(false);
    	idexcel.setVisible(false);
    	idmysql.setVisible(false);
    	iddbm.setVisible(true);
    	idexcelwindow.setVisible(false);
    	iddbmwindow.setVisible(true);
    	idwordfilled.setVisible(false);
    }
	
    @FXML
    void clickconnectmysql1(ActionEvent event) {
    	System.out.println("MySQL");
    	idmyfiles.setVisible(false);
    	idcalc.setVisible(false);
    	idexcel.setVisible(false);
    	idmysql.setVisible(true);
    	iddbm.setVisible(false);
    	idexcelwindow.setVisible(false);
    	iddbmwindow.setVisible(false);
    	idwordfilled.setVisible(true);
    }
    
    @FXML
    void clickimportexcel1(ActionEvent event) {
    	System.out.println("Excel");
    	idmyfiles.setVisible(false);
    	idcalc.setVisible(false);
    	idexcel.setVisible(true);
    	idmysql.setVisible(false);
    	iddbm.setVisible(false);
    	FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        chooser.getExtensionFilters().add(new ExtensionFilter("Excel Files", "*.xlsx"));
        File myExcelFile = chooser.showOpenDialog(iddbm.getScene().getWindow());
        idexcelwindow.setVisible(true);
        iddbmwindow.setVisible(false);
        idwordfilled.setVisible(true);
    }

    @FXML
    void clickimportcalc1(ActionEvent event) {
    	System.out.println("Calc");
    	idmyfiles.setVisible(false);
    	idcalc.setVisible(true);
    	idexcel.setVisible(false);
    	idmysql.setVisible(false);
    	iddbm.setVisible(false);
    	FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        chooser.getExtensionFilters().add(new ExtensionFilter("Open Document Spreadsheet", "*.ods"));
        File myCalcFile = chooser.showOpenDialog(iddbm.getScene().getWindow());
        idexcelwindow.setVisible(false);
        iddbmwindow.setVisible(false);
        idwordfilled.setVisible(false);
    }
    
    @FXML
    void clickmyfiles(ActionEvent event) {
    	System.out.println("My Files");
    	idmyfiles.setVisible(true);
    	idcalc.setVisible(false);
    	idexcel.setVisible(false);
    	idmysql.setVisible(false);
    	iddbm.setVisible(false);
    	idexcelwindow.setVisible(false);
    	iddbmwindow.setVisible(false);
    	idwordfilled.setVisible(false);
    }
    
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//    	
//    }
}
