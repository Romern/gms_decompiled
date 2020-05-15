package p000;

import java.util.Comparator;

/* renamed from: bkqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkqs implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bkqt bkqt = (bkqt) obj;
        bkqt bkqt2 = (bkqt) obj2;
        int compareTo = bkqt.mo66263a().compareTo(bkqt2.mo66263a());
        if (compareTo != 0) {
            return compareTo;
        }
        int b = bkqt.mo66265b() - bkqt2.mo66265b();
        if (b != 0) {
            return b;
        }
        if (bkqt.mo66266c() != bkqt2.mo66266c()) {
            return bkqt.mo66266c() ? -1 : 1;
        }
        return 0;
    }
}
