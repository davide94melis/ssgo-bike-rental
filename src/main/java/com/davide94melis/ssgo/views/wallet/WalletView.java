package com.davide94melis.ssgo.views.wallet;

import com.davide94melis.ssgo.components.pricefield.PriceField;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Wallet")
@Menu(icon = "line-awesome/svg/money-check-alt-solid.svg", order = 1)
@Route(value = "wallet")
@RolesAllowed({"ADMIN", "USER"})
public class WalletView extends Composite<VerticalLayout> {

    public WalletView() {
        FormLayout formLayout2Col = new FormLayout();
        H3 h3 = new H3();
        Paragraph textMedium = new Paragraph();
        FormLayout formLayout2Col2 = new FormLayout();
        PriceField price = new PriceField();
        Button buttonPrimary = new Button();
        Hr hr = new Hr();
        RadioButtonGroup radioGroup = new RadioButtonGroup();
        Button buttonPrimary2 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout2Col.setWidth("100%");
        h3.setText("Saldo");
        h3.setWidth("max-content");
        textMedium.setText("0 €");
        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        formLayout2Col2.setWidth("100%");
        price.setLabel("Aggiungi fondi");
        price.setWidth("min-content");
        buttonPrimary.setText("Aggiungi");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        radioGroup.setLabel("Metodo di pagamento");
        radioGroup.setWidth("min-content");
        radioGroup.setItems("Order ID", "Product Name", "Customer", "Status");
        radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        buttonPrimary2.setText("Aggiungi metodo di pagamento");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(formLayout2Col);
        formLayout2Col.add(h3);
        formLayout2Col.add(textMedium);
        getContent().add(formLayout2Col2);
        formLayout2Col2.add(price);
        formLayout2Col2.add(buttonPrimary);
        getContent().add(hr);
        getContent().add(radioGroup);
        getContent().add(buttonPrimary2);
    }
}
