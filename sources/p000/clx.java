package p000;

/* renamed from: clx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class clx extends cmb {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final float mo3966a(int i, int i2, int i3, int i4) {
        return Math.min(1.0f, cmb.f7040a.mo3966a(i, i2, i3, i4));
    }

    /* renamed from: b */
    public final int mo3967b(int i, int i2, int i3, int i4) {
        if (mo3966a(i, i2, i3, i4) != 1.0f) {
            return cmb.f7040a.mo3967b(i, i2, i3, i4);
        }
        return 2;
    }
}
