package com.davide94melis.ssgo.components.googlemap;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;

public class GoogleMap extends Div {

    public GoogleMap() {
        setId("google-map");
        setWidth("100%");
        setHeight("400px");
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        UI.getCurrent().getPage().executeJs(
                "if (!window.initMap) {"
                        + "  window.initMap = function() {"
                        + "    const map = new google.maps.Map(document.getElementById('google-map'), {"
                        + "      center: { lat: -34.397, lng: 150.644 },"
                        + "      zoom: 8"
                        + "    });"
                        + "  };"
                        + "}"
                        + "const script = document.createElement('script');"
                        + "script.src = 'https://maps.googleapis.com/maps/api/js?key=AIzaSyD226IdaxQbNTxMB1AAXQhYSsUSzEuDRtI&callback=initMap';"
                        + "script.async = true;"
                        + "script.defer = true;"
                        + "document.head.appendChild(script);"
        );
    }
}
