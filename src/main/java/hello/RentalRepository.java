
package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "rental", path = "rental")
public interface RentalRepository extends MongoRepository<Rental, String> {

	List<Rental> findByName(@Param("name") String name);

}
