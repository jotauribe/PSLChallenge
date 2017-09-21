package co.com.psl.challenges.lcdr.printable;

import java.lang.reflect.Type;
import java.util.Iterator;

/**
 * Created on 20/9/2017
 * By Jota Uribe
 **/
public interface Printable {

    int height();

    int width();

    Iterator getRowIterator();

}
