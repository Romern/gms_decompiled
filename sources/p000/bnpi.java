package p000;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: bnpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnpi {
    /* renamed from: a */
    public static boolean m110066a(Comparator comparator, Iterable iterable) {
        Object obj;
        bmxy.m108581a(comparator);
        bmxy.m108581a(iterable);
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = bnnt.f131877a;
            }
        } else if (!(iterable instanceof bnph)) {
            return false;
        } else {
            obj = ((bnph) iterable).comparator();
        }
        return comparator.equals(obj);
    }
}
