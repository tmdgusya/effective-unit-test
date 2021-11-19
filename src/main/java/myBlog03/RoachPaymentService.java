package myBlog03;

public class RoachPaymentService implements ExternalPaymentService {

    @Override
    public boolean isPayed() {
        return false;
    }

}
