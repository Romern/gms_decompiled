package p000;

import java.util.Comparator;

/* renamed from: aiyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiyf implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        aiye aiye = (aiye) obj;
        aiye aiye2 = (aiye) obj2;
        long j = aiye.f70056d;
        long j2 = aiye2.f70056d;
        return j == j2 ? aiye.f70053a.compareTo(aiye2.f70053a) : (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
