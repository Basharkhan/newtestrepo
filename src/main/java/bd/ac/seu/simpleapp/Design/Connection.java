package bd.ac.seu.simpleapp.Design;

import bd.ac.seu.simpleapp.Entity.AttendingEvent;
import bd.ac.seu.simpleapp.Entity.CreatedEvent;
import bd.ac.seu.simpleapp.Repository.AttendingEventRepository;
import bd.ac.seu.simpleapp.Repository.EventRepository;
import bd.ac.seu.simpleapp.Service.AttendingEventService;
import bd.ac.seu.simpleapp.Service.EventService;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.Invitation;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Stream;

@SpringUI(path = "/....")
public class Connection extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {


    }
}
