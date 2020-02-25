package damjav.apliker.services.impl;


import damjav.apliker.entities.Advertisement;
import damjav.apliker.repositories.AdvertisementRepository;
import damjav.apliker.services.AdvertisementService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DefaultAdvertisementService implements AdvertisementService {

    private final AdvertisementRepository advertisementRepository;

    public DefaultAdvertisementService(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

    @Override
    public void addAdvertisement(Advertisement advertisement) {
        advertisementRepository.save(advertisement);
    }

    @Override
    public List<Advertisement> findAllAdsByDate() {
        return advertisementRepository.findAllAdsByDate();
    }

    @Override
    public Integer showCountAllAds() {
        return advertisementRepository.showCountAllAds();
    }

    @Override
    public void deleteAdvertisement(Long id) {
        advertisementRepository.deleteAdvertisementById(id);
    }


}
