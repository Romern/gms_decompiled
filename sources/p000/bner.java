package p000;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: bner */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bner {
    /* renamed from: a */
    public static boolean m109180a(Iterable iterable, Comparator comparator) {
        bmxy.m108581a(comparator);
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }
}
