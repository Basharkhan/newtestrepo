package bd.ac.seu.simpleapp.Design;

import bd.ac.seu.simpleapp.Entity.AttendingEvent;
import bd.ac.seu.simpleapp.Entity.CreatedEvent;
import bd.ac.seu.simpleapp.Service.AttendingEventService;
import bd.ac.seu.simpleapp.Service.EventService;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@SpringUI(path = "/events")
public class VaadinUI extends UI {

    @Autowired
    EventService eventService;
    @Autowired
    AttendingEventService attendingEventService;

    VerticalLayout verticalLayout;
    List<CreatedEvent> hostingEvent;
    List<AttendingEvent> attendingEvent;
    Grid<CreatedEvent> createdEventgrid;
    Grid<AttendingEvent> attendingEventGrid;

    Label label1;
    Label label2;
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        hostingEvent = eventService.getAllEvent();
        attendingEvent = attendingEventService.getAllAttendingEvent();
        System.out.println("Hosting event: " + hostingEvent);
        System.out.println("Attending event: " + attendingEvent);

        verticalLayout = new VerticalLayout();
        this.setContent(verticalLayout);
        FormLayout formLayout = new FormLayout();
        verticalLayout.addComponent(formLayout);

        label1 = new Label("Event you are hosting");
        label1.addStyleName(ValoTheme.LABEL_BOLD);

        verticalLayout.addComponent(label1);


        createdEventgrid = new Grid<>();
        verticalLayout.addComponent(createdEventgrid);
        createdEventgrid.setSizeFull();

        createdEventgrid.setItems(hostingEvent);
        createdEventgrid.addColumn(CreatedEvent::getCreatedEvent).setCaption("Hosting Event");

        label2 = new Label("Event you are attending");
        label2.addStyleName(ValoTheme.LABEL_BOLD);
        verticalLayout.addComponent(label2);

        attendingEventGrid = new Grid<>();
        attendingEventGrid.setSizeFull();
        verticalLayout.addComponent(attendingEventGrid);
        attendingEventGrid.setItems(attendingEvent);
        attendingEventGrid.addColumn(AttendingEvent::getAttendingEvent).setCaption("Attending Event");

    }
}
