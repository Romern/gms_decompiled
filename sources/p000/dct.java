package p000;

/* renamed from: dct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dct extends bxvk implements bxxd {

    /* renamed from: d */
    public static final dct f12880d;

    /* renamed from: e */
    private static volatile bxxk f12881e;

    /* renamed from: a */
    public int f12882a;

    /* renamed from: b */
    public String f12883b = "";

    /* renamed from: c */
    public String f12884c = "";

    static {
        dct dct = new dct();
        f12880d = dct;
        bxvk.m124024a(dct.class, dct);
    }

    private dct() {
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
            return bxvk.m124022a(f12880d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new dct();
        } else {
            if (i2 == 4) {
                return new bxvd(f12880d);
            }
            if (i2 == 5) {
                return f12880d;
            }
            bxxk bxxk = f12881e;
            if (bxxk == null) {
                synchronized (dct.class) {
                    bxxk = f12881e;
                    if (bxxk == null) {
                        bxxk = new bxve(f12880d);
                        f12881e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
