package p000;

/* renamed from: bxaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxaj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxaj f161697d;

    /* renamed from: e */
    public static final bxvj f161698e;

    /* renamed from: h */
    private static volatile bxxk f161699h;

    /* renamed from: a */
    public bxwc f161700a = bxxn.f165040b;

    /* renamed from: b */
    public int f161701b;

    /* renamed from: c */
    public int f161702c;

    /* renamed from: f */
    private int f161703f;

    /* renamed from: g */
    private byte f161704g = 2;

    static {
        bxaj bxaj = new bxaj();
        f161697d = bxaj;
        bxvk.m124024a(bxaj.class, bxaj);
        bwxl bwxl = bwxl.f161383i;
        bxaj bxaj2 = f161697d;
        f161698e = bxvk.m124006a(bwxl, bxaj2, bxaj2, 228982939, bxzf.MESSAGE);
    }

    private bxaj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161704g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161704g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f161697d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000\u0003ဌ\u0001", new Object[]{"f", "a", bwxl.class, "b", bwus.f161065a, "c", bxad.f161680a});
        } else if (i2 == 3) {
            return new bxaj();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f161697d;
            }
            bxxk bxxk = f161699h;
            if (bxxk == null) {
                synchronized (bxaj.class) {
                    bxxk = f161699h;
                    if (bxxk == null) {
                        bxxk = new bxve(f161697d);
                        f161699h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
