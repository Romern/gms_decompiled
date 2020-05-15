package p000;

import java.util.Comparator;

/* renamed from: dys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dys implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bxkj bxkj = (bxkj) obj;
        bxkj bxkj2 = (bxkj) obj2;
        int compareTo = Integer.valueOf(bxkj2.f163758c).compareTo(Integer.valueOf(bxkj.f163758c));
        if (compareTo != 0) {
            return compareTo;
        }
        bxki a = bxki.m122801a(bxkj.f163757b);
        if (a == null) {
            a = bxki.IN_VEHICLE;
        }
        Integer valueOf = Integer.valueOf(a.f163753x);
        bxki a2 = bxki.m122801a(bxkj2.f163757b);
        if (a2 == null) {
            a2 = bxki.IN_VEHICLE;
        }
        return valueOf.compareTo(Integer.valueOf(a2.f163753x));
    }
}
