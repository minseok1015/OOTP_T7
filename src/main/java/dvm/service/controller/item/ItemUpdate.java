package dvm.service.controller.item;

import dvm.domain.item.ItemRepository;

public class ItemUpdate implements ItemServiceController<Void> {

    private ItemRepository itemRepository = ItemRepository.getInstance();

    @Override
    public Void process(int itemId, int itemNum) {

        itemRepository.updateItemStock(itemId, itemNum);
        return null;
    }
}
