package p000;

import java.util.Comparator;

/* renamed from: bnqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqm {

    /* renamed from: a */
    public final int f131988a;

    /* renamed from: b */
    public final Comparator f131989b;

    /* renamed from: c */
    public final Object[] f131990c;

    /* renamed from: d */
    public int f131991d;

    /* renamed from: e */
    public Object f131992e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, int):void
     arg types: [int, java.lang.String, int]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, int):void */
    public bnqm(Comparator comparator, int i) {
        boolean z;
        bmxy.m108582a(comparator, "comparator");
        this.f131989b = comparator;
        this.f131988a = i;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108591a(z, "k (%s) must be >= 0", i);
        bmxy.m108591a(true, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        long j = (long) i;
        long j2 = j + j;
        int i2 = (int) j2;
        bqbt.m112530a(j2 != ((long) i2) ? false : z2, "checkedMultiply", i, 2);
        this.f131990c = new Object[i2];
        this.f131991d = 0;
        this.f131992e = null;
    }
}
