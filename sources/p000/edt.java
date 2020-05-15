package p000;

/* renamed from: edt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class edt {
    /* renamed from: a */
    public static int m10183a(bxco bxco) {
        if (bxco == bxco.DETECTED_BEACON) {
            return 0;
        }
        if (bxco != bxco.USER_LOCATION) {
            return !doi.m8940d(bxco.f162973bD) ? 1 : 3;
        }
        return 2;
    }
}
