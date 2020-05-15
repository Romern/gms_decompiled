package p000;

import java.util.Comparator;

/* renamed from: bfwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfwm implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bfwf bfwf = (bfwf) obj2;
        long j = ((bfwf) obj).f115483a.f79439b;
        long j2 = Long.MAX_VALUE;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        long j3 = bfwf.f115483a.f79439b;
        if (j3 != -1) {
            j2 = j3;
        }
        if (j != j2) {
            return j >= j2 ? 1 : -1;
        }
        return 0;
    }
}
