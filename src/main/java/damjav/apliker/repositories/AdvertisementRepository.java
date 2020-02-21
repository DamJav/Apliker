package damjav.apliker.repositories;


import damjav.apliker.entities.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {


    List<Advertisement> findByCompanyStartingWith(String companyName);


}
