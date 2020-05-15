package p000;

/* renamed from: blcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcy extends bxvk implements bxxd {

    /* renamed from: h */
    public static final blcy f125998h;

    /* renamed from: i */
    private static volatile bxxk f125999i;

    /* renamed from: a */
    public int f126000a;

    /* renamed from: b */
    public int f126001b;

    /* renamed from: c */
    public String f126002c = "";

    /* renamed from: d */
    public int f126003d;

    /* renamed from: e */
    public float f126004e;

    /* renamed from: f */
    public String f126005f = "";

    /* renamed from: g */
    public bxwc f126006g = bxxn.f165040b;

    static {
        blcy blcy = new blcy();
        f125998h = blcy;
        bxvk.m124024a(blcy.class, blcy);
    }

    private blcy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f125998h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဈ\u0004\u0006\u001b", new Object[]{"a", "b", blcx.f125997a, "c", "d", "e", "f", "g", blcl.class});
        } else if (i2 == 3) {
            return new blcy();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f125998h;
            }
            bxxk bxxk = f125999i;
            if (bxxk == null) {
                synchronized (blcy.class) {
                    bxxk = f125999i;
                    if (bxxk == null) {
                        bxxk = new bxve(f125998h);
                        f125999i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
