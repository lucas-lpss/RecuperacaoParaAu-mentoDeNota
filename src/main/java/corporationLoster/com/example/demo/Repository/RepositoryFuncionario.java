package corporationLoster.com.example.demo.Repository;

import corporationLoster.com.example.demo.Entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryFuncionario extends JpaRepository<Funcionario,Long  > {
}
