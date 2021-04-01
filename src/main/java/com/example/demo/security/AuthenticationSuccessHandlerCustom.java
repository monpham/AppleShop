package com.example.demo.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Component
public class AuthenticationSuccessHandlerCustom implements AuthenticationSuccessHandler {
    private static final String USER_ROLE = "USER";
    private static final String ADMIN_ROLE = "ADMIN";
    private static final String MANAGER_ROLE = "MANAGER";
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        boolean isAdminRole = false;
        boolean isAccountRole = false;
        boolean isManagerRole = false;

        List<GrantedAuthority> grantedAuthorities = (List<GrantedAuthority>) authentication.getAuthorities();
        for (GrantedAuthority grantedAuthority : grantedAuthorities) {
            if (grantedAuthority.getAuthority().equals(ADMIN_ROLE)) {
                isAdminRole = true;
                break;
            }
            else if (grantedAuthority.getAuthority().equals(MANAGER_ROLE)) {
                    isManagerRole = true;
                    break;

            } else  if (grantedAuthority.getAuthority().equals(USER_ROLE)) {
                isAccountRole = true;
                break;
            }
        }

        if (isAdminRole) {
            redirectStrategy.sendRedirect(httpServletRequest, httpServletResponse, "/admin");
        }
        else   if (isManagerRole) {
            redirectStrategy.sendRedirect(httpServletRequest, httpServletResponse, "/manager");
        }
        else if (isAccountRole) {
            redirectStrategy.sendRedirect(httpServletRequest, httpServletResponse, "/user");

        } else {
            throw new IllegalStateException();
        }
    }

}
