package p000;

import java.util.Comparator;

/* renamed from: aawc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aawc implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        abdq abdq = (abdq) obj2;
        bxyl bxyl = ((abdq) obj).f57124c;
        if (bxyl == null) {
            bxyl = bxyl.f165099b;
        }
        Long valueOf = Long.valueOf(bxyl.f165101a);
        bxyl bxyl2 = abdq.f57124c;
        if (bxyl2 == null) {
            bxyl2 = bxyl.f165099b;
        }
        return valueOf.compareTo(Long.valueOf(bxyl2.f165101a));
    }
}
