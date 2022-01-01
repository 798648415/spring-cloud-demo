package com.example.demo.filter;

import com.netflix.zuul.ZuulFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * description:
 *
 * @author WangCheng
 * create in 2020-08-05 17:00
 */
@Component
@Slf4j
public class TestPreZuulFilter1 extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("{} filterType = {} filterOrder = {}", this.toString(), this.filterType(), this.filterOrder());

        /*RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        String token = request.getParameter("token");
        log.info("token = {}", token);

        if (StringUtils.isBlank(token)) {
            HttpServletResponse response = requestContext.getResponse();
            try {
                response.getWriter().print("token is null");
            } catch (IOException e) {
                //e.printStackTrace();
                log.error("程序出错");
            }
        }*/

        return null;
    }
}
