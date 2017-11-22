package claps.patientpath;

import claps.patientpath.MyUI;
import claps.persistence.User;
import claps.persistence.UserDAO;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;


@SuppressWarnings("serial")
public class Login extends VerticalLayout implements View {

	public Login() {
		setSizeFull();
		setSpacing(true);
		
		Label label = new Label("Enter your information below to log in.");
		TextField username = new TextField("Username");
		TextField password = new TextField("Password");
		
		addComponent(label);
		addComponent(username);
		addComponent(password);
		addComponent(loginButton());
	}

	@Override
	public void enter(ViewChangeEvent event) {
		Notification.show("Welcome! Please log in.");
	}
	
	private Button loginButton() {
		Button button = new Button("Log In", new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				UserDAO user = new UserDAO();
				user.findAllUser();
				getUI().getNavigator().navigateTo(MyUI.HOME);
			}
		});
		return button;
	}

}
