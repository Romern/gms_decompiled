package p000;

/* renamed from: birr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final birr f121451c;

    /* renamed from: f */
    private static volatile bxxk f121452f;

    /* renamed from: a */
    public double f121453a;

    /* renamed from: b */
    public double f121454b;

    /* renamed from: d */
    private int f121455d;

    /* renamed from: e */
    private byte f121456e = 2;

    static {
        birr birr = new birr();
        f121451c = birr;
        bxvk.m124024a(birr.class, birr);
    }

    private birr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121456e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121456e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121451c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new birr();
        } else {
            if (i2 == 4) {
                return new bxvd(f121451c);
            }
            if (i2 == 5) {
                return f121451c;
            }
            bxxk bxxk = f121452f;
            if (bxxk == null) {
                synchronized (birr.class) {
                    bxxk = f121452f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121451c);
                        f121452f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
