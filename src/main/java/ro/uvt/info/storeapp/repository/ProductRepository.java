package ro.uvt.info.storeapp.repository;

import ro.uvt.info.storeapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

