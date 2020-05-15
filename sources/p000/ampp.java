package p000;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: ampp */
final /* synthetic */ class ampp implements Comparator {

    /* renamed from: a */
    static final Comparator f75689a = new ampp();

    private ampp() {
    }

    public final int compare(Object obj, Object obj2) {
        int compareToIgnoreCase;
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        if (pair.first != null && pair2.first != null && (compareToIgnoreCase = ((String) pair.first).compareToIgnoreCase((String) pair2.first)) != 0) {
            return compareToIgnoreCase;
        }
        if (pair.first != null) {
            return 1;
        }
        if (pair2.first != null) {
            return -1;
        }
        return ((Integer) pair.second).intValue() - ((Integer) pair2.second).intValue();
    }
}
