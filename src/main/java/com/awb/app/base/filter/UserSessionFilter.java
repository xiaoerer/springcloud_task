package com.awb.app.base.filter;

import com.awb.app.base.BaseConstant;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

public class UserSessionFilter extends AccessControlFilter {

    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject = getSubject(request, response);
        if (subject == null) {
            // 没有登录
            return false;
        }
        HttpSession session = WebUtils.toHttp(request).getSession();
        Object sessionUsername = session.getAttribute(BaseConstant.SESSION_AUTH_LOGIN_USERNAME);
        if (sessionUsername == null) {
            // 你自己的逻辑
        }
        return true;
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return false;
    }
}
