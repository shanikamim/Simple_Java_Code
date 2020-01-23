
package javafxapplication5;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField name_textfield;
    @FXML
    private DatePicker dob_picker;
    @FXML
    private RadioButton rb_male;
    @FXML
    private Button res_yes;
    @FXML
    private CheckBox cb_java;
    @FXML
    private ListView<String> eq_list;
    @FXML
    private ComboBox<String> loc;
    @FXML
    private RadioButton rb_female;
    @FXML
    private ToggleGroup gender_group;
    @FXML
    private Button res_no;
    @FXML
    private CheckBox cb_c;
    @FXML
    private Button button_reg;
    
    private String name, dob, gender, reservation, tech, 
            education, location;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        eq_list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ArrayList<String> educationData = new ArrayList<>();
        educationData.add("SSC");
        educationData.add("HSC");
        educationData.add("BSc");
        educationData.add("MSc");
        ObservableList<String> data = 
                FXCollections.observableList(educationData);
        eq_list.getItems().addAll(data);
        
        // for Combobox
        ArrayList<String> locationData = new ArrayList<>();
        locationData.add("Dhaka");
        locationData.add("Rajshahi");
        locationData.add("Rangpur");
        ObservableList<String> locData = 
                FXCollections.observableList(locationData);
        loc.getItems().addAll(locData);
    }
    
    public void getGender(ActionEvent e){
        if(rb_male.isSelected()){
            gender = rb_male.getText();
        }else{
            gender = rb_female.getText();
        }
    }
    
    public void getReservationYes(ActionEvent e){
        reservation = res_yes.getText();
    }
    
    public void getReservationNo(ActionEvent e){
        reservation = res_no.getText();
    }
    
    public void getTechnology(ActionEvent e){
        tech = "";
        if(cb_java.isSelected()){
            tech += cb_java.getText()+",";
        }
        
        if(cb_c.isSelected()){
            tech += cb_c.getText();
        }
    }
    
    public void getEducationInformation(MouseEvent e){
        education = "";
        ObservableList<String> educationItem = eq_list.getSelectionModel().getSelectedItems();
        for(String data : educationItem){
            education += data +",";
        }
    }
    
    public void getLocation(ActionEvent e){
        location = loc.getSelectionModel().getSelectedItem();
    }
    
    public void saveData(ActionEvent e){
        name = name_textfield.getText();
        dob = dob_picker.getEditor().getText();
        
        // file save
        String data = "Name: "+name
                +", Date of birth: "+dob
                +", Gender: "+gender
                +", Reservations: "+reservation
                +", Technology Known: "+tech
                +", Educational Qualification: "+education
                +", Location: "+location+"\n";
        FileOperations fo = new FileOperations();
        fo.dataSaveIntoFile(data);
    }
    
}
