package src.main.companions;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the my-design.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("my-design")
@HtmlImport("my-design.html")
@Route("mydesign")
public class MyDesign extends PolymerTemplate<MyDesign.MyDesignModel> {

    @Id("vaadinButton")
    private Button vaadinButton;
    @Id("vaadinButton1")
    private Button vaadinButton1;
    @Id("vaadinTextArea")
    private TextArea vaadinTextArea;

    /**
     * Creates a new MyDesign.
     */
    public MyDesign() {
        vaadinButton.addClickListener(event -> {
            Notification.show(vaadinTextArea.getValue(), 1000 * 10,
                    Notification.Position.MIDDLE);
        });
    }

    /**
     * This model binds properties between MyDesign and my-design.html
     */
    public interface MyDesignModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
