package rocks.zipcode.io.comparators;

import java.util.Comparator;
import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator <Item>{
    @Override
    public int compare(Item o1, Item o2) {
      int comp =0;
       comp = o1.getPrice().compareTo(o2.getPrice());



        return comp;
    }
}
