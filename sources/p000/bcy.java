package p000;

import android.graphics.Color;

/* renamed from: bcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcy implements bea {

    /* renamed from: a */
    public static final bcy f3021a = new bcy();

    private bcy() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2999a(bef bef, float f) {
        int n = bef.mo3035n();
        if (n == 1) {
            bef.mo3021a();
        }
        double j = bef.mo3031j();
        double j2 = bef.mo3031j();
        double j3 = bef.mo3031j();
        double j4 = bef.mo3031j();
        if (n == 1) {
            bef.mo3023b();
        }
        if (j <= 1.0d && j2 <= 1.0d && j3 <= 1.0d && j4 <= 1.0d) {
            j *= 255.0d;
            j2 *= 255.0d;
            j3 *= 255.0d;
            j4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) j4, (int) j, (int) j2, (int) j3));
    }
}
