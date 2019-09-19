package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        String style = "<style type='text/css' media='screen'>";
        style += "body { background-color: black; position: fixed; top: 50%; left: 50%; transform: translate(-50%, -50%); color: orange; font-size: 250%; }";
        style += "</style>";
        
        String message = "Have a spooky and safe Halloween from GitLab!";
        // TO DO: add ASCII image of a pumpkin to page        
        String body = "<body>" + message + "</body>";

        return style + body;
    }

}