package com.davide94melis.ssgo.views.noleggiaora;

import com.davide94melis.ssgo.components.avataritem.AvatarItem;
import com.davide94melis.ssgo.components.googlemap.GoogleMap;
import com.davide94melis.ssgo.data.UserRepository;
import com.davide94melis.ssgo.security.AuthenticatedUser;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.spring.security.AuthenticationContext;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import org.springframework.security.core.userdetails.UserDetails;

@PageTitle("Noleggia ora")
@Menu(icon = "line-awesome/svg/map-marker-alt-solid.svg", order = 0)
@Route(value = "")
@RouteAlias(value = "")
@AnonymousAllowed
public class NoleggiaoraView extends Composite<VerticalLayout> {

    private final UserRepository userRepository;
    private final AuthenticatedUser authenticatedUser;
    private final AuthenticationContext authenticationContext;

    public NoleggiaoraView(UserRepository userRepository, AuthenticatedUser authenticatedUser, AuthenticationContext authenticationContext) {
        this.userRepository = userRepository;
        this.authenticatedUser = authenticatedUser;
        this.authenticationContext = authenticationContext;
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Hr hr = new Hr();
        GoogleMap googleMap = new GoogleMap();
        Button buttonPrimary = new Button();
        HorizontalLayout layoutRow = new HorizontalLayout();
        AvatarItem avatarItem = new AvatarItem();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.END);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        buttonPrimary.setText("Noleggia bici");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.END);
        avatarItem.setWidth("min-content");
        /*if(authenticationContext.isAuthenticated()){
            setAvatarItemSampleData(avatarItem);
        }*/
        getContent().add(layoutColumn2);
        layoutColumn2.add(googleMap);
        layoutColumn2.add(hr);
        layoutColumn2.add(buttonPrimary);
        getContent().add(layoutRow);
        layoutRow.add(avatarItem);
    }
/*
    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading(authenticationContext.getAuthenticatedUser(UserDetails.class).get().getUsername());
        avatarItem.setDescription(String.valueOf(authenticatedUser.get().get().getName()));
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
    }*/
}
