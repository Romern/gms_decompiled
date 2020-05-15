package p000;

import java.util.Comparator;

/* renamed from: arwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arwl implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        asbk asbk = (asbk) obj;
        asbk asbk2 = (asbk) obj2;
        int i = asbk.f88668d;
        int i2 = asbk2.f88668d;
        if (i > i2) {
            return -1;
        }
        if (i != i2) {
            return 1;
        }
        int i3 = asbk.f88666b;
        int i4 = asbk2.f88666b;
        if (i3 <= i4) {
            return i3 != i4 ? 1 : 0;
        }
        return -1;
    }
}
