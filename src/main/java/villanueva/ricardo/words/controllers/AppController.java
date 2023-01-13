package villanueva.ricardo.words.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import villanueva.ricardo.words.models.City;
import villanueva.ricardo.words.models.Country;
import villanueva.ricardo.words.models.Language;
import villanueva.ricardo.words.services.Service;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    Service service;


    @RequestMapping("/home")
    public String home(){
        return "wellcome";
    }

    @RequestMapping("/countries")
    public String countries(Model model){
        List<Country> countries = service.allCountries();
        model.addAttribute("countries", countries);
        return "countries";
    }

    @RequestMapping("/cities/{code}")
    public String cities(@PathVariable String code, Model m){
        List<City> cities = service.citiesByCountry(code);
        m.addAttribute("cities", cities);
        String country = service.countryByCode(code);
        m.addAttribute("country", country);
        return "city";
    }

    @RequestMapping("/languages/{code}")
    public String language(@PathVariable String code, Model m){
        List<Language> languages = service.getLanguageByCountry(code);
        m.addAttribute("languages", languages);
        String country = service.countryByCode(code);
        m.addAttribute("country", country);
        return "language";
    }

    @RequestMapping("language/{lName}")
    public String languageCountries(@PathVariable String lName, Model m){
        List<Country> languageCountrues = service.getCountriesByLanguage(lName);
        m.addAttribute("countries", languageCountrues);
        m.addAttribute("language", lName);
        return "cLanguage";
    }

    @RequestMapping("/insertCity")
    public String insertCity(Model m){
        List<Country> countries = service.allCountries();
        m.addAttribute("countries", countries);
        return "insertCity";
    }

    @PostMapping("/insertCity")
    public String insertCity(String newCity, String country, Model m){
        String countryCode = service.codeByCountry(country);
        service.insertCity(newCity, countryCode);
        List<Country> countries = service.allCountries();
        m.addAttribute("countries", countries);
        return "insertCity";
    }
    @RequestMapping("/deleteCountysByLanguage")
    public String deleteCountriesByLenguage(Model m){
        List<Language> languages = service.getAllLaguages();
        m.addAttribute("lanugages", languages);
        return "deleteCountries";
    }

    @PostMapping("/deleteCountysByLanguage")
    public String deleteCountries(String language, Model m){
        List<String> codes = service.getLanguageCcodes(language);
        service.deleteCities(codes);
        service.deleteLanguages(codes);
        service.deleteCountries(codes);
        List<Language> languages = service.getAllLaguages();
        m.addAttribute("lanugages", languages);
        return "deleteCountries";
    }
}
