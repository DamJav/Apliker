package damjav.apliker.repositories;


import damjav.apliker.entities.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

    Advertisement findAdvertisementByCompany(String companyName);


}
