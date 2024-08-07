package com.davide94melis.ssgo.views;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;

public abstract class BaseView extends Composite<VerticalLayout> implements AfterNavigationObserver {

    @Override
    public void afterNavigation(AfterNavigationEvent event) {
        // Chiudi il menu se è aperto
        UI.getCurrent().getPage().executeJs(
                "const drawer = document.querySelector('vaadin-app-layout vaadin-drawer-toggle');" +
                        "if (drawer && drawer.parentElement.hasAttribute('drawer-opened')) {" +
                        "    drawer.click();" +
                        "}"
        );
    }
}
