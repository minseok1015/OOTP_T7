package dvm.service.controller.item;

import dvm.domain.item.ItemRepository;

public class ItemCheck implements ItemServiceController<Boolean> {

    private ItemRepository itemRepository = ItemRepository.getInstance();

    @Override
    public Boolean process(int itemId, int itemNum) {

        int countItem = itemRepository.countItem(itemId);
        if (countItem < itemNum) return false;
        else return true;
    }
}
