/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.freizeitbaltrum.cdi;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PageConfigurator;

/**
 *
 * @author Lars
 */
public class MainLayout extends Div implements RouterLayout, PageConfigurator {

    @Override
    public void configurePage(InitialPageSettings settings) {
        CookieConsent cookie = new CookieConsent("Hallo Cookie", "Klar!", "Info", "https://cookieconsent.insites.com");
        cookie.addToSettings(settings);
    }
}
