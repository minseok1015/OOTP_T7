package dvm.service.controller.item;

public interface ItemServiceController<T> {

    T process(int itemId, int itemNum);
}
