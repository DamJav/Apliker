package damjav.apliker.controllers;


import damjav.apliker.entities.Advertisement;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class AdvertisementController {


    @PostMapping("/add")
    public String add(@ModelAttribute("advertisement") @Valid Advertisement advertisement){
        return null;
    }


}
