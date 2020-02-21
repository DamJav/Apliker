package damjav.apliker.services;

import damjav.apliker.entities.Advertisement;

public interface AdvertisementService {
    void addAdvertisement(Advertisement advertisement);

    void searchAdvertisement(String companyName);
}
