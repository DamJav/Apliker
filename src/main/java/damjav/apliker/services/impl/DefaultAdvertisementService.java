package damjav.apliker.services.impl;


import damjav.apliker.entities.Advertisement;
import damjav.apliker.services.AdvertisementService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DefaultAdvertisementService implements AdvertisementService {

    @Override
    public void addAdvertisement(Advertisement advertisement) {

    }
}
