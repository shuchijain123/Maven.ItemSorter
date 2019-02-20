package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.IdComparator;
import java.util.List;
import java.util.Arrays;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter<item> {

    IdComparator ic = new IdComparator();

    Item[] item = new Item[]{};
    public ItemSorter(Item[] Item) {
        this.item = Item;







    }

    public Item[] sort(Comparator<Item> comparator) {

        Arrays.sort(this.item, comparator);

        return item;


    }






    }




