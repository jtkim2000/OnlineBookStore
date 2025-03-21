package onlinebookstore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="OutOfStockOrder_table")
public class OutOfStockOrder {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long orderId;
        private Long bookId;
        private Long customerId;
        private Date orderDt;


        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }
        public Long getBookId() {
            return bookId;
        }

        public void setBookId(Long bookId) {
            this.bookId = bookId;
        }
        public Long getCustomerId() {
            return customerId;
        }

        public void setCustomerId(Long customerId) {
            this.customerId = customerId;
        }
        public Date getOrderDt() {
            return orderDt;
        }

        public void setOrderDt(Date orderDt) {
            this.orderDt = orderDt;
        }

}
