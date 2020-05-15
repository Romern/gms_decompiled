package p000;

import java.util.Comparator;

/* renamed from: beuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beuj implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        beus beus = (beus) obj;
        beus beus2 = (beus) obj2;
        int compare = Integer.compare(beus2.f112545b, beus.f112545b);
        return compare == 0 ? beus.f112544a.compareTo((Enum) beus2.f112544a) : compare;
    }
}
