package p000;

import java.util.Comparator;

/* renamed from: bjti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjti implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int compare;
        bjtj bjtj = (bjtj) obj;
        bjtj bjtj2 = (bjtj) obj2;
        int compare2 = String.CASE_INSENSITIVE_ORDER.compare(bjtj.f123274c, bjtj2.f123274c);
        if (compare2 != 0) {
            return compare2;
        }
        if (bjtj.f123276e == null || bjtj2.f123276e == null || (compare = String.CASE_INSENSITIVE_ORDER.compare(bjtj.f123276e.toString(), bjtj2.f123276e.toString())) == 0) {
            return 0;
        }
        return compare;
    }
}
