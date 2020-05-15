package p000;

/* renamed from: cbrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbrb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbrb f178099c;

    /* renamed from: e */
    private static volatile bxxk f178100e;

    /* renamed from: a */
    public cbqy f178101a;

    /* renamed from: b */
    public bxbg f178102b;

    /* renamed from: d */
    private byte f178103d = 2;

    static {
        cbrb cbrb = new cbrb();
        f178099c = cbrb;
        bxvk.m124024a(cbrb.class, cbrb);
    }

    private cbrb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f178103d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f178103d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f178099c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\t\u0002Љ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbrb();
        } else {
            if (i2 == 4) {
                return new bxvd(f178099c);
            }
            if (i2 == 5) {
                return f178099c;
            }
            bxxk bxxk = f178100e;
            if (bxxk == null) {
                synchronized (cbrb.class) {
                    bxxk = f178100e;
                    if (bxxk == null) {
                        bxxk = new bxve(f178099c);
                        f178100e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
