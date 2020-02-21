package damjav.apliker.controllers;


import damjav.apliker.entities.Advertisement;
import damjav.apliker.services.AdvertisementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("advertisement") @Valid Advertisement advertisement){
        advertisementService.addAdvertisement(advertisement);
        return "redirect:/";
    }

    @PostMapping("/search")
    public String searchAplication(){

    }


}
