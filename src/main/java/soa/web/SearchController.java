package soa.web;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class SearchController {

	@Autowired
	  private ProducerTemplate producerTemplate;

	@RequestMapping("/")
    public String index() {
        return "index";
    }


    @RequestMapping(value="/search")
    @ResponseBody
    public Object search(@RequestParam("q") String q) {
        int i = q.toLowerCase().indexOf(" max:");
        HashMap<String, Object> m =  new HashMap<String, Object>();
        if(i >= 0){
            String q1 = q.substring(0, i);
            String q2 = q.substring(i+5,q.length());
            m.put("CamelTwitterKeywords",q1);
            m.put("CamelTwitterCount",q2);
        }else{
            m.put("CamelTwitterKeywords",q);
        }
        return producerTemplate.requestBodyAndHeaders("direct:search", "", m);
    }
}