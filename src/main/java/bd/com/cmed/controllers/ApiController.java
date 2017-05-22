package bd.com.cmed.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sayemkcn on 5/22/17.
 */
@RestController
@RequestMapping("/api/v3")
public class ApiController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    private String apiDetails(){
        return "New Api for cmed";
    }

}
