package fontys.sem3.school.controller;

import fontys.sem3.school.repository.FakeDataStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountriesController {


    private static final FakeDataStore fakeDataStore=new FakeDataStore();





}
