package com.davide94melis.ssgo.views.register2;

import com.davide94melis.ssgo.views.BaseView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

import java.util.Arrays;
import java.util.List;

@PageTitle("Step 2")
@Route(value = "address-form")
@AnonymousAllowed
public class Register2View extends BaseView {

    private TextField addressTextField;
    private TextField zipCodeTextField;
    private TextField cityTextField;
    private Select<String> selectState;
    private Button buttonSave;
    private Button buttonBack;

    public Register2View() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        addressTextField = new TextField();
        FormLayout formLayout2Col = new FormLayout();
        zipCodeTextField = new TextField();
        cityTextField = new TextField();
        selectState = new Select<>();
        HorizontalLayout layoutRow = new HorizontalLayout();
        buttonSave = new Button();
        buttonBack = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        h3.setText("Indirizzo");
        h3.setWidth("min-content");
        addressTextField.setLabel("Via e numero civico *");
        addressTextField.setWidth("100%");
        formLayout2Col.setWidth("100%");
        zipCodeTextField.setLabel("CAP (o ZIP Code) *");
        zipCodeTextField.setWidth("min-content");
        cityTextField.setLabel("Città *");
        cityTextField.setWidth("min-content");
        selectState.setLabel("Paese *");
        selectState.setWidth("min-content");
        setSelectSampleData(selectState);
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        buttonSave.setText("Salva");
        buttonSave.setWidth("min-content");
        buttonSave.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSave.addClickListener(event -> validateAndSave());
        buttonBack.setText("Indietro");
        buttonBack.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(addressTextField);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(zipCodeTextField);
        formLayout2Col.add(cityTextField);
        formLayout2Col.add(selectState);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonSave);
        layoutRow.add(buttonBack);
    }

    private void validateAndSave() {
        if (isValidForm()) {
            // Implement your save functionality here
            Notification.show("Attendi qualche secondo. Ti stiamo registrando...", 3000, Notification.Position.MIDDLE);
        } else {
            Notification.show("Per favore, compila tutti i campi obbligatori correttamente.", 3000, Notification.Position.MIDDLE);
        }
    }

    private boolean isValidForm() {
        return !addressTextField.isEmpty()
                && !zipCodeTextField.isEmpty()
                && !cityTextField.isEmpty()
                && selectState.getValue() != null;
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setSelectSampleData(Select<String> select) {
        List<String> countries = Arrays.asList(
                "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria",
                "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan",
                "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia",
                "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo (Congo-Brazzaville)", "Costa Rica",
                "Croatia", "Cuba", "Cyprus", "Czechia (Czech Republic)", "Democratic Republic of the Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador",
                "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini (fmr. Swaziland)", "Ethiopia", "Fiji", "Finland", "France",
                "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau",
                "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland",
                "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan",
                "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar",
                "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia",
                "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (formerly Burma)", "Namibia", "Nauru", "Nepal",
                "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "North Macedonia", "Norway", "Oman", "Pakistan",
                "Palau", "Palestine State", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar",
                "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia",
                "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa",
                "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Tajikistan",
                "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu",
                "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States of America", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela",
                "Vietnam", "Yemen", "Zambia", "Zimbabwe"
        );
        countries.sort(String::compareTo);
        select.setItems(countries);
    }
}
