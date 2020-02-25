package damjav.apliker.services;

import damjav.apliker.entities.Advertisement;

import java.util.List;

public interface AdvertisementService {
    void addAdvertisement(Advertisement advertisement);
    List<Advertisement> findAllAdsByDate();
    Integer showCountAllAds();
    void deleteAdvertisement(Long id);

}
