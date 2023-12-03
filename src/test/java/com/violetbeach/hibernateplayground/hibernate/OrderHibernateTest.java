package com.violetbeach.hibernateplayground.hibernate;

import com.violetbeach.hibernateplayground.order.Order;
import com.violetbeach.hibernateplayground.support.JpaTestContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OrderHibernateTest extends JpaTestContext {

    /**
     * Lazy 옵션을 사용하려면 ByteCode 향상 플러그인과 enableLazyInitialization 속성 명시
     */
    @Test
    @DisplayName("@Basic의 fetch가 LAZY여도 기본적으로 해당 필드를 EAGER로 가져온다.")
    void lazyField_ItWorksEager() {
        // given
        String title = "Title";
        Order order = Order.builder()
            .title(title)
            .build();

        em.persistAndFlush(order);
        em.clear();

        // when
        em.find(Order.class, order.getId());
    }

}
