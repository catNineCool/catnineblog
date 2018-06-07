package core.TestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.Date;

@Controller
@Slf4j
public class HelloController {
    @RequestMapping(value = "index")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("name","yang");
        model.addAttribute("age",26);
        model.addAttribute("nowDate",new Date());
        System.out.println("*** 客户端IP地址：" + request.getRemoteAddr());
        System.out.println("*** 取得客户端响应编码：" + response.getCharacterEncoding());
        System.out.println("*** 取得SessionID：" + request.getSession().getId());
        System.out.println("*** 取得真实路径：" + request.getServletContext().getRealPath("/upload/"));
        return "index";
    }
}
