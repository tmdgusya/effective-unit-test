package myBlog03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceImplTest {

    @Test
    @DisplayName("외부 결제가 성공하면 데이터 베이스의 Save method 를 호출하는지 확인합니다.")
    void savePaymentHistoryIfExternalPaymentServiceSucceed() {
        //given
        ExternalPaymentService externalPaymentServiceMock = new TestExternalPaymentService();
        TestDataBase testDataBase = new TestDataBase();
        PaymentService paymentService = new PaymentServiceImpl(externalPaymentServiceMock, testDataBase);

        //when
        paymentService.pay();

        //then
        assertTrue(testDataBase.isCalled);
    }

    public class TestExternalPaymentService implements ExternalPaymentService {

        /**
         * Test 를 위해 외부 요인은 반드시 성공시킨다.
         */
        @Override
        public boolean isPayed() {
            return true;
        }
    }

    public class TestDataBase extends DataBase {

        public boolean isCalled = false;

        @Override
        public void save() {
            this.isCalled = true;
        }
    }

}