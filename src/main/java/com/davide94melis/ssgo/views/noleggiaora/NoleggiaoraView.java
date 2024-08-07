package com.davide94melis.ssgo.views.noleggiaora;

import com.davide94melis.ssgo.components.avataritem.AvatarItem;
import com.davide94melis.ssgo.components.googlemap.GoogleMap;
import com.davide94melis.ssgo.data.UserRepository;
import com.davide94melis.ssgo.security.AuthenticatedUser;
import com.davide94melis.ssgo.views.BaseView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.spring.security.AuthenticationContext;

@PageTitle("Noleggia ora")
@Menu(icon = "line-awesome/svg/map-marker-alt-solid.svg", order = 0)
@Route(value = "")
@RouteAlias(value = "")
@AnonymousAllowed
public class NoleggiaoraView extends BaseView {

    private final UserRepository userRepository;
    private final AuthenticatedUser authenticatedUser;
    private final AuthenticationContext authenticationContext;

    public NoleggiaoraView(UserRepository userRepository, AuthenticatedUser authenticatedUser, AuthenticationContext authenticationContext) {
        this.userRepository = userRepository;
        this.authenticatedUser = authenticatedUser;
        this.authenticationContext = authenticationContext;

        GoogleMap googleMap = new GoogleMap();
        Button buttonPrimary = new Button();

        // Configura il layout principale
        getContent().setSizeFull();
        getContent().getStyle().set("position", "relative");

        // Imposta le dimensioni e lo stile per la mappa
        googleMap.setSizeFull();
        googleMap.addClassName("google-map-container");

        // Configura il pulsante
        buttonPrimary.setText("Noleggia bici");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary.addClassName("noleggia-bici-button");

        // Aggiungi i componenti al layout principale
        getContent().add(googleMap, buttonPrimary);
    }

/*
    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading(authenticationContext.getAuthenticatedUser(UserDetails.class).get().getUsername());
        avatarItem.setDescription(String.valueOf(authenticatedUser.get().get().getName()));
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
    }*/
}
