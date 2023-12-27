package hust.soict.vn.aims.screen;

import java.awt.event.ActionEvent;


import hust.soict.dsai.aims.cart.Cart;
import hust.soict.vn.aims.media.Playable;
import hust.soict.vn.aims.media.media;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController  {
		private Cart cart;
		@FXML
	    private Button btnPlay;

	    @FXML
	    private Button btnRemove;
		@FXML
	    private TableColumn<media, String> colMediaCategory;

	    @FXML
	    private TableColumn<media, Float> colMediaCost;

	    @FXML
	    private TableColumn<media, String> colMediaTitle;

	    @FXML
	    private ToggleGroup filterCategory;

	    @FXML
	    private TableView<media> tblMedia;
	    
	    public CartScreenController(Cart cart) {
	    	super();
	    	this.cart = cart;
	    }
	    @FXML
	    private void initialize() {
	    	colMediaTitle.setCellValueFactory(new PropertyValueFactory<media,String>("title"));
	    	colMediaCategory.setCellValueFactory(new PropertyValueFactory<media, String>("category"));
	    	colMediaCost.setCellValueFactory(new PropertyValueFactory<media, Float>("cost"));
	    	tblMedia.setItems(this.cart.getItemsOrdered());
	    	
	    	btnPlay.setVisible(false);
	    	btnRemove.setVisible(false);
	    	
	    	tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<media>() {
	    		@Override
	    		public void changed(ObservableValue<? extends media> observable , media oldValue, media newValue) {
	    			if(newValue != null) {
	    				updateButtonBar(newValue);
	    			}
	    		}
			});
	    	
	    }
	    public void updateButtonBar(media media) {
    		btnRemove.setVisible(true);
    		if(media instanceof Playable) {
    			btnPlay.setVisible(true);
    		}else {
    			btnPlay.setVisible(false);
    		}
    			
    	}
	    @FXML
	    void btnRemovePressed(ActionEvent event) {
	    	media media = tblMedia.getSelectionModel().getSelectedItem();
	    	cart.removeMedia(media);
	    }
}
