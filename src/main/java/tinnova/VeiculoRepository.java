
package tinnova;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "veiculo", path = "veiculos")
public interface VeiculoRepository extends MongoRepository<Veiculo, String> {

	List<Veiculo> findByVeiculo(@Param("veiculo") String veiculo);

}
