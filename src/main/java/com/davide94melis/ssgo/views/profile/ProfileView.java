package com.davide94melis.ssgo.views.profile;

import com.davide94melis.ssgo.security.AuthenticatedUser;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.security.AuthenticationContext;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;
import org.springframework.security.core.userdetails.UserDetails;

@PageTitle("Profile")
@Menu(icon = "line-awesome/svg/user.svg", order = 7)
@Route(value = "profile")
@PermitAll
public class ProfileView extends Composite<VerticalLayout> {

    private final TextField nameField;
    private final TextField surnameField;
    private final TextField phoneField;
    private final DatePicker dateOfBirth;
    private final EmailField emailField;
    private final Button modifyInfoButton;
    private final Button updateInfoButton;
    private final Button buttonSecondary;
    private final HorizontalLayout layoutRow;
    private final VerticalLayout layoutColumn2;
    private final FormLayout formLayout2Col;
    private final AuthenticationContext authenticationContext;
    private final AuthenticatedUser authenticatedUser;


    public ProfileView(AuthenticationContext authenticationContext, AuthenticatedUser authenticatedUser) {
        this.authenticationContext = authenticationContext;
        this.authenticatedUser = authenticatedUser;
        layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        formLayout2Col = new FormLayout();
        nameField = new TextField();
        surnameField = new TextField();
        dateOfBirth = new DatePicker();
        phoneField = new TextField();
        emailField = new EmailField();
        layoutRow = new HorizontalLayout();
        modifyInfoButton = new Button();
        updateInfoButton = new Button();
        buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        h3.setText("Info personali");
        h3.setWidth("100%");
        formLayout2Col.setWidth("100%");
        nameField.setLabel("Nome");
        nameField.setValue(String.valueOf(authenticatedUser.get().orElseThrow().getPerson().getFirstName()));
        nameField.setEnabled(false);
        surnameField.setLabel("Cognome");
        surnameField.setValue(String.valueOf(authenticatedUser.get().orElseThrow().getPerson().getLastName()));
        surnameField.setEnabled(false);
        dateOfBirth.setLabel("Data di nascita");
        dateOfBirth.setValue(authenticatedUser.get().orElseThrow().getPerson().getDateOfBirth());
        dateOfBirth.setEnabled(false);
        phoneField.setLabel("Numero di telefono");
        phoneField.setValue(String.valueOf(authenticatedUser.get().orElseThrow().getPerson().getPhone()));
        phoneField.setEnabled(false);
        emailField.setLabel("Email");
        emailField.setValue(String.valueOf(authenticatedUser.get().orElseThrow().getPerson().getEmail()));
        emailField.setEnabled(false);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        modifyInfoButton.setText("Modifica profilo");
        modifyInfoButton.addClickListener(event -> modifyInfoProfile());
        modifyInfoButton.setWidth("min-content");
        modifyInfoButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        updateInfoButton.setText("Aggiorna informazioni");
        updateInfoButton.setWidth("min-content");
        updateInfoButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Annulla");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(nameField);
        formLayout2Col.add(surnameField);
        formLayout2Col.add(dateOfBirth);
        formLayout2Col.add(phoneField);
        formLayout2Col.add(emailField);
        layoutColumn2.add(layoutRow);
        layoutRow.add(modifyInfoButton);
    }

    public void modifyInfoProfile(){
        layoutRow.remove(modifyInfoButton);
        layoutRow.add(updateInfoButton);
        layoutRow.add(buttonSecondary);
        nameField.setEnabled(true);
        surnameField.setEnabled(true);
        dateOfBirth.setEnabled(true);
        phoneField.setEnabled(true);
        emailField.setEnabled(true);
    }
}
