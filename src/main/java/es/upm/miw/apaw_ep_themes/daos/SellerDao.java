package es.upm.miw.apaw_ep_themes.daos;

import es.upm.miw.apaw_ep_themes.documents.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SellerDao extends MongoRepository<Seller, String> {
    public List<Seller> findByName(String name);
}