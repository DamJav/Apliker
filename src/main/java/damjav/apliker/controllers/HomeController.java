package damjav.apliker.controllers;


import damjav.apliker.entities.Advertisement;
import damjav.apliker.services.AdvertisementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    private final AdvertisementService advertisementService;

    public HomeController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping
    public String getHomePage(Model model){
            model.addAttribute("advertisement", new Advertisement());
        return "index";
    }

}
