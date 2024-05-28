package dvm.service.controller.card;

public class CardCheck {

    public boolean checkCard(String cardNum, int price) {

        if(cardNum=="abcd"&&price<=10000) return true;
        else return false;
    }
}
