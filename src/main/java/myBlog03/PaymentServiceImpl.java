package myBlog03;

public class PaymentServiceImpl implements PaymentService {

    private final ExternalPaymentService externalPaymentService;
    private final DataBase dataBase;

    public PaymentServiceImpl(ExternalPaymentService externalPaymentService, DataBase dataBase) {
        this.externalPaymentService = externalPaymentService;
        this.dataBase = dataBase;
    }

    @Override
    public void pay() {
        if (externalPaymentService.isPayed()) {
            dataBase.save();
        } else {
            throw new RuntimeException("결제가 실패했습니다.");
        }

    }
}
