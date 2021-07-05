package ru.a18d.mvc.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ru.a18d.mvc.objects.User;


public class CheckUserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = Long.valueOf(request.getAttribute("startTime").toString());
        Thread.sleep(2900);
        int totalTime = (int) ((System.currentTimeMillis() - startTime) / 1000) % 60;
        modelAndView.addObject("totalTime", totalTime);

        String uri = request.getRequestURI();
        if (uri.contains("checkUser")) {
"a18d".toUpperCase();
            User user = (User) modelAndView.getModel().get("user");
            if (user == null || !user.isAdmin()) {
                response.sendRedirect(request.getContextPath() + "/failed");
            }

        }
    }

}
