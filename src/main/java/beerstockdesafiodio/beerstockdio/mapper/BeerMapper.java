package beerstockdesafiodio.beerstockdio.mapper;


import beerstockdesafiodio.beerstockdio.dto.BeerDTO;
import beerstockdesafiodio.beerstockdio.enitity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
