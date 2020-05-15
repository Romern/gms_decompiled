package p000;

import java.util.Comparator;

/* renamed from: dtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dtp implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int a = dtq.m9327a(((dus) obj).f14074a);
        int a2 = dtq.m9327a(((dus) obj2).f14074a);
        if (a >= a2) {
            return a != a2 ? 1 : 0;
        }
        return -1;
    }
}
