/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.freizeitbaltrum.cdi;

import com.vaadin.flow.server.InitialPageSettings;

/**
 *
 * @author Lars
 */
public class CookieConsent {

    private String style = "<link rel=\"stylesheet\" type=\"text/css\" href=\"//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.css\" />";
    private String src = "<script src=\"//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.1.0/cookieconsent.min.js\"></script>";
    private String script = "<script>"
            + "window.addEventListener(\"load\", function(){"
            + "window.cookieconsent.initialise({"
            + "\"palette\": {"
            + "\"popup\": {"
            + "\"background\": \"#000\""
            + "},"
            + "\"button\": {"
            + "\"background\": \"#f1d600\""
            + "}"
            + "},"
            + "\"content\": {"
            + "\"message\": \"[msg]\","
            + "\"dismiss\": \"[dismissMsg]\","
            + "\"link\": \"[linkText]\","
            + "\"href\": \"[link]\""
            + "}"
            + "})});"
            + "</script>";

    private static final String MSG = "This website uses cookies to ensure you get the best experience on our website.";
    private static final String DISMISS_MSG = "Got it!";
    private static final String LINK_TEXT = "Learn more";
    private static final String LINK = "www.my.de/cookie";

    public CookieConsent() {
        this(MSG, DISMISS_MSG, LINK_TEXT, LINK);
    }

    public CookieConsent(String message, String dismissMsg, String linkText, String link) {
        setMessage(message);
        setDismissMsg(dismissMsg);
        setLinkText(linkText);
        setLink(link);
    }

    private void setMessage(String message) {
        script = script.replace("[msg]", message);
    }

    private void setDismissMsg(String dismissMsg) {
        script = script.replace("[dismissMsg]", dismissMsg);
    }

    private void setLinkText(String linkText) {
        script = script.replace("[linkText]", linkText);
    }

    private void setLink(String link) {
        script = script.replace("[link]", link);
    }

    void addToSettings(InitialPageSettings settings) {
        settings.addInlineWithContents(style, InitialPageSettings.WrapMode.NONE);
        settings.addInlineWithContents(src, InitialPageSettings.WrapMode.NONE);
        settings.addInlineWithContents(script, InitialPageSettings.WrapMode.NONE);
    }
}
