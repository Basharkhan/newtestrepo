package bd.ac.seu.simpleapp.Design;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI(path = "/test")
public class Test extends UI {
    Navigator navigator;
    protected static final String MAINVIEW = "main";
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        getPage().setTitle("Navigation Example");
        navigator = new Navigator(this, this);
    }
}
