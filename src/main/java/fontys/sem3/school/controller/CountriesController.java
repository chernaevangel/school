package fontys.sem3.school.controller;

import fontys.sem3.school.repository.FakeDataStore;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountriesController {


    private static final FakeDataStore fakeDataStore=new FakeDataStore();

    @GetMapping("/hello")
    // return only the body, and let Spring boot handle http statuscode
    // and header
    @ResponseBody
    public String SayHello()
    {
        String msg = "Hello, your resources work!";
        return msg;
    }



}
