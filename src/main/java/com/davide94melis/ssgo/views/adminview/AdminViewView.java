package com.davide94melis.ssgo.views.adminview;

import com.davide94melis.ssgo.views.BaseView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.MultiSelectComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import jakarta.annotation.security.RolesAllowed;

import java.util.ArrayList;
import java.util.List;

@PageTitle("Admin View")
@Menu(icon = "line-awesome/svg/user-lock-solid.svg", order = 9)
@Route(value = "admin-view")
@RolesAllowed("ADMIN")
public class AdminViewView extends BaseView {

    public AdminViewView() {
        H3 h3 = new H3();
        FormLayout formLayout2Col = new FormLayout();
        MultiSelectComboBox multiSelectComboBox = new MultiSelectComboBox();
        Button buttonPrimary = new Button();
        Hr hr = new Hr();
        FormLayout formLayout2Col2 = new FormLayout();
        MultiSelectComboBox multiSelectComboBox2 = new MultiSelectComboBox();
        Button buttonPrimary2 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h3.setText("Strumenti");
        h3.setWidth("max-content");
        formLayout2Col.setWidth("100%");
        multiSelectComboBox.setLabel("Disabilita bici");
        multiSelectComboBox.setWidth("min-content");
        setMultiSelectComboBoxSampleData(multiSelectComboBox);
        buttonPrimary.setText("Disabilita bici selezionate");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        formLayout2Col2.setWidth("100%");
        multiSelectComboBox2.setLabel("Abilita bici");
        multiSelectComboBox2.setWidth("min-content");
        setMultiSelectComboBoxSampleData(multiSelectComboBox2);
        buttonPrimary2.setText("Abilita bici selezionate");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h3);
        getContent().add(formLayout2Col);
        formLayout2Col.add(multiSelectComboBox);
        formLayout2Col.add(buttonPrimary);
        getContent().add(hr);
        getContent().add(formLayout2Col2);
        formLayout2Col2.add(multiSelectComboBox2);
        formLayout2Col2.add(buttonPrimary2);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setMultiSelectComboBoxSampleData(MultiSelectComboBox multiSelectComboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        multiSelectComboBox.setItems(sampleItems);
        multiSelectComboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
