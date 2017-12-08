package com.awb.app.base.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class ParentTag extends SimpleTagSupport {

    private String name;

    public ParentTag() {
        super();
    }

    @Override
    public void doTag() throws JspException, IOException {
        String varName="__yes__safe__jsp__override__"+name;

        JspFragment jspFragment=this.getJspBody();
        PageContext pageContext= (PageContext) getJspContext();

//        JspFragment jspFragment2= (JspFragment) pageContext.getRequest().getAttribute(varName);
       /* if(jspFragment2==null){
            StringWriter sw=new StringWriter();
            jspFragment.invoke(sw);
            pageContext.getOut().write(sw.getBuffer().toString());
            return;
        }*/
        if(jspFragment==null){
            return;
        }
        pageContext.getRequest().setAttribute(varName,jspFragment);

       /* StringWriter sw=new StringWriter();
        jspFragment.invoke(sw);
        pageContext.getOut().write(sw.getBuffer().toString());*/
    }

    @Override
    public void setParent(JspTag parent) {
        super.setParent(parent);
    }

    @Override
    public JspTag getParent() {
        return super.getParent();
    }

    @Override
    public void setJspContext(JspContext pc) {
        super.setJspContext(pc);
    }

    @Override
    protected JspContext getJspContext() {
        return super.getJspContext();
    }

    @Override
    public void setJspBody(JspFragment jspBody) {
        super.setJspBody(jspBody);
    }

    @Override
    protected JspFragment getJspBody() {
        return super.getJspBody();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
