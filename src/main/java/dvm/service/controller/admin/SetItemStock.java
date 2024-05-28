package dvm.service.controller.admin;

import dvm.domain.item.ItemRepository;

public class SetItemStock implements AdminServiceController{

    private ItemRepository itemRepository = ItemRepository.getInstance();

    @Override
    public void process(int itemId, int num) {
        itemRepository.updateItemStock(itemId, num);
    }
}
