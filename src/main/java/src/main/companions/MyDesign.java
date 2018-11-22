package src.main.companions;

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
public class MyDesign extends PolymerTemplate<MyDesign.MyDesignModel> {

    /**
     * Creates a new MyDesign.
     */
    public MyDesign() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between MyDesign and my-design.html
     */
    public interface MyDesignModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
