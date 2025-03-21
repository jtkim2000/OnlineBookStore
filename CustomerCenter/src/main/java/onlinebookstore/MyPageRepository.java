package onlinebookstore;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MyPageRepository extends CrudRepository<MyPage, Long> {

    List<MyPage> findByOrderId(Long orderId);
    List<MyPage> findByOrderId(Long orderId);

}