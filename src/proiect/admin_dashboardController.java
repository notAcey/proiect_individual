package proiect;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class admin_dashboardController {

    @FXML
    private Button alocareOre_btnAdd;

    @FXML
    private Button alocareOre_btnClear;

    @FXML
    private Button alocareOre_btnDelete;

    @FXML
    private Button alocareOre_btnUpdate;

    @FXML
    private ComboBox<?> alocareOre_combo_materie;

    @FXML
    private ComboBox<?> alocareOre_combo_profesor;

    @FXML
    private AnchorPane alocareOre_form;

    @FXML
    private TextField alocareOre_searchBox;

    @FXML
    private TableView<?> alocareOre_tableView;

    @FXML
    private TableColumn<?, ?> alocareOre_tableView_materie;

    @FXML
    private TableColumn<?, ?> alocareOre_tableView_profesor;

    @FXML
    private TableColumn<?, ?> alocareOre_tableView_semestru;

    @FXML
    private TextField alocareOre_txb_semestru;

    @FXML
    private Button btn_close;

    @FXML
    private Button btn_editAlocareCursuri;

    @FXML
    private Button btn_editUsers;

    @FXML
    private Button btn_fac_spec;

    @FXML
    private Button btn_home;

    @FXML
    private Button btn_materie;

    @FXML
    private Button btn_minimize;

    @FXML
    private Button btn_prof;

    @FXML
    private Button btn_signOut;

    @FXML
    private Button btn_student;

    @FXML
    private Button facultate_btnAdd;

    @FXML
    private Button facultate_btnClear;

    @FXML
    private Button facultate_btnDelete;

    @FXML
    private Button facultate_btnUpdate;

    @FXML
    private TableView<dateFacultate> facultate_tableView;

    @FXML
    private TableColumn<dateFacultate, String> facultate_tableView_id;

    @FXML
    private TableColumn<dateFacultate, String> facultate_tableView_numeFac;

    @FXML
    private TextField facultate_txb_nume;

    @FXML
    private AnchorPane home_form;

    @FXML
    private Label home_totalAdmins;

    @FXML
    private LineChart<?, ?> home_totalCoursesChart;

    @FXML
    private LineChart<?, ?> home_totalFacChart;

    @FXML
    private Label home_totalProfs;

    @FXML
    private BarChart<?, ?> home_totalStudChart;

    @FXML
    private Label home_totalStudents;

    @FXML
    private AnchorPane main_form;

    @FXML
    private AnchorPane materie_form;

    @FXML
    private Button materii_btnAdd;

    @FXML
    private Button materii_btnClear;

    @FXML
    private Button materii_btnDelete;

    @FXML
    private Button materii_btnUpdate;

    @FXML
    private TextField materii_searchBox;

    @FXML
    private TableView<dateMaterii> materii_tableView;

    @FXML
    private TableColumn<dateMaterii, String> materii_tableView_credite;

    @FXML
    private TableColumn<dateMaterii, String> materii_tableView_id;

    @FXML
    private TableColumn<dateMaterii, String> materii_tableView_id_spec;

    @FXML
    private TableColumn<dateMaterii, String> materii_tableView_nume;

    @FXML
    private TableColumn<dateMaterii, String> materii_tableView_semestru;

    @FXML
    private TableColumn<dateMaterii, String> materii_tableView_statut;

    @FXML
    private TextField materii_txb_credite;

    @FXML
    private TextField materii_txb_nume;

    @FXML
    private TextField materii_txb_semestru;

    @FXML
    private TextField materii_txb_statut;

    @FXML
    private Button profesor_btnAdd;

    @FXML
    private Button profesor_btnClear;

    @FXML
    private Button profesor_btnDelete;

    @FXML
    private Button profesor_btnUpdate;

    @FXML
    private AnchorPane profesor_form;

    @FXML
    private TextField profesor_searchBox;

    @FXML
    private TableView<dateProfesori> profesor_tableView;

    @FXML
    private TableColumn<dateProfesori, String> profesor_tableView_id;

    @FXML
    private TableColumn<dateProfesori, String> profesor_tableView_id_user;

    @FXML
    private TableColumn<dateProfesori, String> profesor_tableView_nume;

    @FXML
    private TableColumn<dateProfesori, String> profesor_tableView_prenume;

    @FXML
    private TextField profesor_txb_nume;

    @FXML
    private TextField profesor_txb_prenume;

    @FXML
    private Button specializare_btnAdd;

    @FXML
    private Button specializare_btnClear;

    @FXML
    private Button specializare_btnDelete;

    @FXML
    private Button specializare_btnUpdate;

    @FXML
    private ComboBox<?> specializare_combo_faculta;

    @FXML
    private AnchorPane specializare_fac_form;

    @FXML
    private TableView<dateSpecializare> specializare_tableView;

    @FXML
    private TableColumn<dateSpecializare, String> specializare_tableView_id;

    @FXML
    private TableColumn<dateSpecializare, String> specializare_tableView_id_facultate;

    @FXML
    private TableColumn<dateSpecializare, String> specializare_tableView_numarBuget;

    @FXML
    private TableColumn<dateSpecializare, String> specializare_tableView_numarTaxa;

    @FXML
    private TableColumn<dateSpecializare, String> specializare_tableView_nume;

    @FXML
    private TextField specializare_txb_buget;

    @FXML
    private TextField specializare_txb_nume;

    @FXML
    private TextField specializare_txb_taxa;

    @FXML
    private AnchorPane student_form;

    @FXML
    private Button studenti_btnAdd;

    @FXML
    private Button studenti_btnClear;

    @FXML
    private Button studenti_btnDelete;

    @FXML
    private Button studenti_btnUpdate;

    @FXML
    private ComboBox<?> studenti_combo_an;

    @FXML
    private ComboBox<?> studenti_combo_grupa;

    @FXML
    private ComboBox<?> studenti_combo_locBuget;

    @FXML
    private ComboBox<?> studenti_combo_sex;

    @FXML
    private ComboBox<?> studenti_combo_subgrupa;

    @FXML
    private DatePicker studenti_dataNastere;

    @FXML
    private TextField studenti_searchBox;

    @FXML
    private TableView<dateStudenti> studenti_tableView;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_cnp;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_dataNasterii;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_grupa;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_idFac;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_idSpec;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_idStud;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_idUtiliz;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_locBuget;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_nume;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_prenume;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_sex;

    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_subgrupa;
    
    @FXML
    private TableColumn<dateStudenti, String> studenti_tableView_an;

    @FXML
    private TextField studenti_txb_cnp;

    @FXML
    private TextField studenti_txb_id_fac;

    @FXML
    private TextField studenti_txb_id_spec;

    @FXML
    private TextField studenti_txb_id_util;

    @FXML
    private TextField studenti_txb_nume;

    @FXML
    private TextField studenti_txb_prenume;

    @FXML
    private AnchorPane user_form;

    @FXML
    private Button users_btnAdd;

    @FXML
    private Button users_btnClear;

    @FXML
    private Button users_btnDelete;

    @FXML
    private Button users_btnUpdate;

    @FXML
    private TextField users_searchBox;

    @FXML
    private TableView<?> users_tableView;

    @FXML
    private TableColumn<?, ?> users_tableView_idUtil;

    @FXML
    private TableColumn<?, ?> users_tableView_password;

    @FXML
    private TableColumn<?, ?> users_tableView_tipUser;

    @FXML
    private TableColumn<?, ?> users_tableView_username;

    @FXML
    private BarChart<?, ?> users_totalUsersChart;

    @FXML
    private TextField users_txb_password;

    @FXML
    private TextField users_txb_tipUtiliz;

    @FXML
    private TextField users_txb_username;
    
    
    private double x = 0;
    private double y = 0;
    
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    
    public ObservableList<dateStudenti> addStudentListData(){
        ObservableList<dateStudenti> listaStudenti = FXCollections.observableArrayList();
    
        String sql = "SELECT * FROM studenti";
    
        connect = database.connectDB();
        
        try{
            dateStudenti id_student;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                id_student = new dateStudenti(result.getString("nume"), result.getString("prenume"), result.getDate("dataNasterii"), result.getString("cnp"),result.getString("sex"), result.getString("loc_bugetat"), result.getString("grupa"), result.getString("subgrupa"));
                listaStudenti.add(id_student);
            }
            
        }catch(Exception e){e.printStackTrace();}
        return listaStudenti;
    }
    
    private ObservableList<dateStudenti> addStudentListD;
    public void addStudentShowListData(){
        addStudentListD = addStudentListData();
        
        studenti_tableView_nume.setCellValueFactory(new PropertyValueFactory<>("nume"));
        studenti_tableView_prenume.setCellValueFactory(new PropertyValueFactory<>("prenume"));
        studenti_tableView_dataNasterii.setCellValueFactory(new PropertyValueFactory<>("dataNasterii"));
        studenti_tableView_cnp.setCellValueFactory(new PropertyValueFactory<>("cnp"));
        studenti_tableView_sex.setCellValueFactory(new PropertyValueFactory<>("sex"));
        studenti_tableView_locBuget.setCellValueFactory(new PropertyValueFactory<>("loc_bugetat"));
        studenti_tableView_grupa.setCellValueFactory(new PropertyValueFactory<>("grupa"));
        studenti_tableView_subgrupa.setCellValueFactory(new PropertyValueFactory<>("subgrupa"));
        
        studenti_tableView.setItems(addStudentListD);
    }
    
    public void addStudentsSelect(){
        dateStudenti studentD = studenti_tableView.getSelectionModel().getSelectedItem();
        int num = studenti_tableView.getSelectionModel().getSelectedIndex();
        if((num - 1) < -1){ return; }
        studenti_txb_nume.setText(String.valueOf(studentD.getNume()));
        studenti_txb_prenume.setText(String.valueOf(studentD.getPrenume()));
        
    }
    
    private final String[] yearList = {"Anul 1", "Anul 2", "Anul 3"};
    
    public void addStudentsYearList(){
        ArrayList<String> listaAn = new ArrayList<>();
        listaAn.addAll(Arrays.asList(yearList));
        
        ObservableList oblist = FXCollections.observableArrayList(listaAn);
        studenti_combo_an.setItems(oblist);
    }
    
    private final String[] genderlist = {"M", "F"};
    
    public void addStudentsGenderList(){
        ArrayList<String> listaSex = new ArrayList<>();
        listaSex.addAll(Arrays.asList(genderlist));
        
        ObservableList oblist = FXCollections.observableArrayList(listaSex);
        studenti_combo_sex.setItems(oblist);
    }
    
    private final String[] groupList = {"1", "2", "3", "4", "5", "6", "7"};
    
    public void addStudentsGroupList(){
        ArrayList<String> listaGrupe = new ArrayList<>();
        listaGrupe.addAll(Arrays.asList(groupList));
        
        ObservableList oblist = FXCollections.observableArrayList(listaGrupe);
        studenti_combo_grupa.setItems(oblist);
    }
    
    private final String[] subgroupList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    
    public void addStudentsSubGroupList(){
        ArrayList<String> listaSubgrupe = new ArrayList<>();
        listaSubgrupe.addAll(Arrays.asList(subgroupList));
        
        ObservableList oblist = FXCollections.observableArrayList(listaSubgrupe);
        studenti_combo_subgrupa.setItems(oblist);
    }
    
    private final String[] listaBuget = {"Da", "Nu"};
    
    public void addStudentsBugetList(){
        ArrayList<String> listBuget = new ArrayList<>();
        listBuget.addAll(Arrays.asList(listaBuget));
        
        ObservableList oblist = FXCollections.observableArrayList(listBuget);
        studenti_combo_locBuget.setItems(oblist);
    }
    
    public void logout(){
        try{
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to log out?");
            
            Optional<ButtonType> option = alert.showAndWait();
            
            if(option.get().equals(ButtonType.OK)){
                
                btn_signOut.getScene().getWindow().hide();
                
                Parent root = FXMLLoader.load(getClass().getResource("login_form.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                root.setOnMousePressed((MouseEvent event) ->{
                    x = event.getSceneX();
                    y = event.getSceneY();
                    stage.setOpacity(.8);
                });

                root.setOnMouseDragged((MouseEvent event) ->{
                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);
                });

                scene.setOnMouseReleased(event -> {
                    stage.setOpacity(1);
                });

                stage.initStyle(StageStyle.TRANSPARENT);

                stage.setScene(scene);
                stage.show();
            }else return;
            
        }catch(Exception e){e.printStackTrace();};
    }

    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void minimize(ActionEvent event) {
        Stage stage = (Stage) main_form.getScene().getWindow();
        stage.setIconified(true);
    }
    
    public void switchForm(ActionEvent event){
        if(event.getSource() == btn_home){
            home_form.setVisible(true);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);
            
            btn_home.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3);");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");
            
        }else if(event.getSource() == btn_student){
            home_form.setVisible(false);
            student_form.setVisible(true);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);
            
            btn_home.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");
            
            addStudentShowListData();
            
        }else if(event.getSource() == btn_prof){
            home_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(true);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);
            
            btn_home.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");
            
        }else if(event.getSource() == btn_materie){
            home_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(true);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);
            
            btn_home.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");
            
        }else if(event.getSource() == btn_fac_spec){
            home_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(true);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(false);
            
            btn_home.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:transparent");
            
        }else if(event.getSource() == btn_editAlocareCursuri){
            home_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(true);
            user_form.setVisible(false);
            
            btn_home.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3)");
            btn_editUsers.setStyle("-fx-background-color:transparent");
            
        }else if(event.getSource() == btn_editUsers){
            home_form.setVisible(false);
            student_form.setVisible(false);
            materie_form.setVisible(false);
            specializare_fac_form.setVisible(false);
            profesor_form.setVisible(false);
            alocareOre_form.setVisible(false);
            user_form.setVisible(true);
            
            btn_home.setStyle("-fx-background-color:transparent");
            btn_student.setStyle("-fx-background-color:transparent");
            btn_prof.setStyle("-fx-background-color:transparent");
            btn_materie.setStyle("-fx-background-color:transparent");
            btn_fac_spec.setStyle("-fx-background-color:transparent");
            btn_editAlocareCursuri.setStyle("-fx-background-color:transparent");
            btn_editUsers.setStyle("-fx-background-color:linear-gradient(to bottom right, #c48ed7, #e49ab3);");
        }
    }
    
    public void initialize(URL location, ResourceBundle resources){
        addStudentShowListData();
        addStudentsYearList();
        addStudentsGenderList();
        addStudentsGroupList();
        addStudentsSubGroupList();
        addStudentsBugetList();
    }
}