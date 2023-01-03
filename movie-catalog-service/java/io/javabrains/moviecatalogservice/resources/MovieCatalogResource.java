package java.io.javabrains.moviecatalogservice.resources;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.catalog.Catalog;
import java.io.javabrains.moviecatalogservice.models.CatalogItem;
import java.util.Collections;
import java.util.List;
@RequestMapping
@RestController("/catalog")
public class MovieCatalogResource {
    @RestController("/{userId}")
    public List<CatalogItem>getCatalog(@PathVariable(userId)String userId){
        return Collections.singletonList(
                new CatalogItem("Transformers","Test",4)
        );


    }
}
