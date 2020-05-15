package p000;

import java.util.Comparator;

/* renamed from: bukg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bukg implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        double d = ((bukh) obj2).f154086d.f154236a;
        double d2 = ((bukh) obj).f154086d.f154236a;
        if (d >= d2) {
            if (d > d2) {
                return 1;
            }
            long doubleToLongBits = Double.doubleToLongBits(d);
            long doubleToLongBits2 = Double.doubleToLongBits(d2);
            if (doubleToLongBits == doubleToLongBits2) {
                return 0;
            }
            if (doubleToLongBits >= doubleToLongBits2) {
                return 1;
            }
        }
        return -1;
    }
}
