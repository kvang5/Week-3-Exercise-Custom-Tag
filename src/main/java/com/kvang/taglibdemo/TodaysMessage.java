package com.kvang.taglibdemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kvang on 9/17/17.
 */
public class TodaysMessage extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {

        // Get today's date
        Date date = new Date();

        // Format Date
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");

        super.doTag();
        JspWriter out = getJspContext().getOut();

        // Compare date to different holiday dates to output different messages
        if (dateFormat.format(date).equals("2017/10/31")) {
            out.println("Happy Halloween!");
        } else if (dateFormat.format(date).equals("2017/11/23")) {
            out.println("Happy Thanksgiving!");
        } else if (dateFormat.format(date).equals("2017/12/25")) {
            out.println("Merry Christmas!");
        } else if (dateFormat.format(date).equals("2017/09/17")) {
            out.println("Testing to make sure today's date works!");
        } else {
            out.println("Happy " + simpleDateFormat.format(date) + "! Today's date is " + dateFormat.format(date));
        }
    }
}
