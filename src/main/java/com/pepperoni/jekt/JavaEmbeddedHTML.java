package com.pepperoni.jekt;

import de.inetsoftware.jwebassembly.web.dom.HTMLElement;
import de.inetsoftware.jwebassembly.web.dom.Text;

import static com.pepperoni.jekt.EmbeddedJavaScript.script;

public class JavaEmbeddedHTML {

    public static void jeh(String varName, String javaEmbeddedHtml) { // java embedded html
        HTMLElement jeh = Jekt.document.createElement("script");
        Text innerText = Jekt.document.createTextNode("var" + " " + varName + " " + "=" + javaEmbeddedHtml);
        jeh.appendChild( innerText );
        Jekt.document.body().appendChild( jeh );
        script("document.body.innerHTML +=" + " " + varName);
    }
}
