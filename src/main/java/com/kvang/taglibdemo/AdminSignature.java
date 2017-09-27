package com.kvang.taglibdemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by kvang on 9/18/17.
 */
public class AdminSignature extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        // Add new custom tag for Administrator Signature for ???
        JspWriter out = getJspContext().getOut();
        out.println("Frances Lo");
    }
}
