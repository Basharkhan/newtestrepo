package bd.ac.seu.simpleapp.Design;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Link;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI(path = "/connected")
public class Index extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout verticalLayout = new VerticalLayout();
        this.setContent(verticalLayout);
        Link link = new Link("Connect To Facebook", new ExternalResource("http://facebook"));
        link.addStyleName(ValoTheme.LINK_LARGE);
        verticalLayout.addComponent(link);
    }
}
