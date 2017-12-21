package claps.patientpath;

import claps.persistence.EventDAO;
import claps.persistence.PathConnect;
import claps.persistence.UserDAO;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ClassResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.MenuBar.MenuItem;

@SuppressWarnings("serial")
public class Kalender extends HorizontalLayout implements View {
	
	//Label title;
	//Button logout;
	
	public Kalender() {
		//setSizeFull();
		//setSpacing(true);
		//layout.setWidth("400px");
		
		HorizontalLayout sample;
		HorizontalLayout sample2;
		
      //Horizontal
        sample = new HorizontalLayout();
        sample.addStyleName("outlined");
        sample.setSpacing(false);
        sample.setMargin(false);
        sample.setSizeFull();
 
        //Label label1 = new Label("Logo1");
        //Label label2 = new Label("Logo2");
		
        //sample.addComponent(label1);
        //sample.addComponent(label2);
		
		//Under construction
		Label labelHeader = new Label("Stammdaten");
		Label labelKalender = new Label("Kalender");
		
		//Button backButton = new Button("", new Button.ClickListener() {
		Button backButton = new Button(""); //{

			/*public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo(Home.DASHBOARD);*/

			//}
		
		//backButton.setIcon(new ClassResource("/PatientPath_Logo.png"));
		//backButton.setHeight("1000%");
		//backButton.setWidth("10%");
		
		//sample = new Image();
        //sample.setSource(new ThemeResource("../runo/icons/64/document.png"));
		
		
		///////////////
		//Button backButton = new Image("", new Button.ClickListener() {
				Image imageLogo = new Image();
				
				imageLogo.setSource(new ClassResource("/PatientPath_Logo.png"));
				imageLogo.setHeight("250px");
				//imageLogo.setWidth("%");
		
		////////////////
		
				addComponent(imageLogo);
			addComponent(labelHeader);
			addComponent(labelKalender);
			addComponent(sample);
			addComponent(backButton);
		
		//MenuBar
		MenuBar uebersichtMenu = new MenuBar();
		uebersichtMenu.setWidth(500.0f, Unit.PERCENTAGE);
			MenuItem uebersicht = uebersichtMenu.addItem("Übersicht", null, null);
			    MenuItem kalender = uebersicht.addItem("Kalender", null, null);
			    MenuItem akteure = uebersicht.addItem("Akteure", null, null);
				MenuItem logout = uebersicht.addItem("Logout", null, null);			
				
				//Horizontal
		        sample2 = new HorizontalLayout();
		        sample2.addStyleName("outlined");
		        sample2.setSpacing(false);
		        sample2.setMargin(false);
		        sample2.setSizeFull();
		 
		        //Label label3 = new Label("Logo3");
		        //Label label4 = new Label("Logo4");
				
		        //sample2.addComponent(label3);
		        //sample2.addComponent(label4);
		        addComponent(sample2);
			
		
		//Label kalenderLabel = new Label("Kalender");
		//TextField username = new TextField("Username");
		//TextField password = new TextField("Password");
		
		//addComponent(label);
		addComponent(uebersichtMenu);
		//addComponent(uebersichtMenu2);
		/*addComponent(username);
		addComponent(password);
		addComponent(loginButton());
		addComponent(selection);
		addComponent(myGrid());
		
		
	}

	//Test Notification
	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Welcome! Please log in.");
	}
	
	private Button loginButton() {
		Button button = new Button("Übersicht", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UserDAO user = new UserDAO();
				user.findAllUser();
				getUI().getNavigator().navigateTo(MyUI.HOME);
			}
		});
		return button;
	}

	MenuBar.Command mycommand = new MenuBar.Command() {
	    public void menuSelected(MenuItem selectedItem) {
	        selection.setValue("Ordered a " +
	                           selectedItem.getText() +
	                           " from menu.");
	    }
	};
	
	final Label selection = new Label("-");
	
	
private Grid<claps.persistence.Event> myGrid() {
		
		EventDAO eventDAO = new EventDAO();
		
		Grid<claps.persistence.Event> myGrid = new Grid();
		myGrid.setSelectionMode(SelectionMode.NONE);
		myGrid.addColumn(claps.persistence.Event::getEventName).setCaption("Name");
		myGrid.addColumn(claps.persistence.Event::getEventDateTime).setCaption("Date");
		myGrid.setItems(eventDAO.findAllEvent());

		return myGrid;*/
	}
	
}