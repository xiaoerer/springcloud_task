package com.awb.app.base.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

public class SonTag extends SimpleTagSupport {

    private String name;

    public SonTag() {
        super();
    }

    @Override
    public void doTag() throws JspException, IOException {
        String parentStr="__yes__safe__jsp__override__"+name;
       /* //1.得到父标签的引用
        JspTag parent=getParent();
        //2获取父标签的name属性
        ParentTag parentTag = (ParentTag) parent;
        String name=parentTag.getName();
        //3.把name值打印到JSP页面上
        getJspContext().getOut().print("子标签输出name:"+name);*/

        JspFragment jspFragment=this.getJspBody();
        PageContext pageContext= (PageContext) jspFragment.getJspContext();

        JspFragment jspFragment1= (JspFragment) pageContext.getRequest().getAttribute(parentStr);

        if(jspFragment1==null){
            StringWriter sw=new StringWriter();
            jspFragment1.invoke(sw);

            String content=sw.getBuffer().toString();
            pageContext.getOut().write(content);
        }else{
            StringWriter sw2=new StringWriter();
            jspFragment.invoke(sw2);
            String content2=sw2.getBuffer().toString();
            pageContext.getOut().write(content2);
        }

//        JspFragment jspFragment=this.getJspBody();
//        PageContext pageContext= (PageContext) jspFragment.getJspContext();
//        jspFragment.invoke(pageContext.getOut());

//        jspFragment.invoke(null);
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
