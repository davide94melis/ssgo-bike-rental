package com.davide94melis.ssgo.views.register1;

import com.davide94melis.ssgo.views.BaseView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Step 1")
//@Menu(icon = "line-awesome/svg/user.svg", order = 4)
@Route(value = "person-form")
@AnonymousAllowed
public class Register1View extends BaseView {

    private TextField nameField;
    private TextField surnameField;
    private DatePicker datePicker;
    private TextField phoneNumberField;
    private EmailField emailField;
    private EmailField emailConfirmField;
    private PasswordField passwordField;
    private PasswordField passwordConfirmField;
    private Button buttonNext;
    private Button buttonBack;

    public Register1View() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        FormLayout formLayout2Col = new FormLayout();
        nameField = new TextField();
        surnameField = new TextField();
        datePicker = new DatePicker();
        phoneNumberField = new TextField();
        emailField = new EmailField();
        emailConfirmField = new EmailField();
        passwordField = new PasswordField();
        passwordConfirmField = new PasswordField();
        HorizontalLayout layoutRow = new HorizontalLayout();
        buttonBack = new Button();
        buttonNext = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        h3.setText("Personal Information");
        h3.setWidth("100%");
        formLayout2Col.setWidth("100%");
        nameField.setLabel("Nome *");
        surnameField.setLabel("Cognome *");
        datePicker.setLabel("Data di nascita *");
        phoneNumberField.setLabel("Numero di telefono *");
        emailField.setLabel("Email *");
        emailConfirmField.setLabel("Conferma email *");
        emailConfirmField.setWidth("min-content");
        passwordField.setLabel("Password *");
        passwordField.setWidth("min-content");
        passwordConfirmField.setLabel("Conferma password *");
        passwordConfirmField.setWidth("min-content");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonBack.setText("Indietro");
        buttonBack.setWidth("min-content");
        buttonNext.setText("Avanti");
        buttonNext.setWidth("min-content");
        buttonNext.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonNext.addClickListener(event -> validateAndNavigate());
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(nameField);
        formLayout2Col.add(surnameField);
        formLayout2Col.add(datePicker);
        formLayout2Col.add(phoneNumberField);
        formLayout2Col.add(emailField);
        formLayout2Col.add(emailConfirmField);
        formLayout2Col.add(passwordField);
        formLayout2Col.add(passwordConfirmField);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonBack);
        layoutRow.add(buttonNext);
    }

    private void validateAndNavigate() {
        if(areEmailsTheSame()){
            if(arePasswordsTheSame()){
                if (isValidForm()) {
                    // Redirect to the next view
                    getUI().ifPresent(ui -> ui.navigate("address-form"));
                } else {
                    Notification.show("Per favore, compila tutti i campi obbligatori correttamente.", 3000, Notification.Position.MIDDLE);
                }
            } else {
                Notification.show("Le password inserite non combaciano.", 3000, Notification.Position.MIDDLE);
            }
        } else {
            Notification.show("Gli indirizzi email inseriti non combaciano.", 3000, Notification.Position.MIDDLE);
        }

    }

    private boolean areEmailsTheSame(){
        return emailField.getValue().equals(emailConfirmField.getValue());
    }

    private boolean arePasswordsTheSame(){
        return passwordField.getValue().equals(passwordConfirmField.getValue());
    }

    private boolean isValidForm() {
        return !nameField.isEmpty()
                && !surnameField.isEmpty()
                && datePicker.getValue() != null
                && !phoneNumberField.isEmpty()
                && !emailField.isEmpty()
                && !emailConfirmField.isEmpty()
                && emailField.getValue().equals(emailConfirmField.getValue())
                && !passwordField.isEmpty()
                && !passwordConfirmField.isEmpty()
                && passwordField.getValue().equals(passwordConfirmField.getValue());
    }
}
