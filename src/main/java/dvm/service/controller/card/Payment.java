package dvm.service.controller.card;

public class Payment {

    private boolean status;

    public void proceedPayment(String cardNum, int price) {
        int change = -1;
        if(cardNum=="abcd") {
            change = 10000-price;
        }
        System.out.println("change = " + change);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
