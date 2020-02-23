package damjav.apliker.repositories;


import damjav.apliker.entities.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {


    List<Advertisement> findByCompanyStartingWith(String companyName);


    @Transactional
    @Query(value = "select * from advertisements order by sent desc", nativeQuery = true)
    List<Advertisement> findAllAdsByDate();

    @Transactional
    @Query(value = "SELECT count(*) from advertisements", nativeQuery = true)
    Integer showCountAllAds();



}
