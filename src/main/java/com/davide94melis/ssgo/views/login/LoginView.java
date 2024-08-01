package com.davide94melis.ssgo.views.login;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("Login")
@Route(value = "login")
@AnonymousAllowed
public class LoginView extends Composite<VerticalLayout> {

    public LoginView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        layoutColumn2.addClassName("login-view");

        LoginForm loginForm = new LoginForm();
        Paragraph textMedium = new Paragraph("Non sei ancora registrato?");
        Button buttonSecondary = new Button("Registrati ora!");

        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.CENTER);
        getContent().setAlignItems(Alignment.CENTER);

        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, loginForm);

        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");

        buttonSecondary.setWidth("min-content");

        getContent().add(layoutColumn2);
        layoutColumn2.add(loginForm);
        layoutColumn2.add(textMedium);
        layoutColumn2.add(buttonSecondary);
    }
}
