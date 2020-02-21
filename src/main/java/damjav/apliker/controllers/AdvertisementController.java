package damjav.apliker.controllers;


import damjav.apliker.entities.Advertisement;
import damjav.apliker.repositories.AdvertisementRepository;
import damjav.apliker.services.AdvertisementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AdvertisementController {

    private final AdvertisementService advertisementService;
    private final AdvertisementRepository advertisementRepository;

    public AdvertisementController(AdvertisementService advertisementService, AdvertisementRepository advertisementRepository) {
        this.advertisementService = advertisementService;
        this.advertisementRepository = advertisementRepository;
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("advertisement") @Valid Advertisement advertisement){
        advertisementService.addAdvertisement(advertisement);
        return "redirect:/";
    }

    @PostMapping("/search")
    public String searchAplication(String companyName, Model model){
        model.addAttribute("ad", advertisementRepository.findAdvertisementByCompany(companyName));
        return "index";
    }


}
