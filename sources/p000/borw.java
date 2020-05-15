package p000;

/* renamed from: borw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final borw f134518d;

    /* renamed from: e */
    private static volatile bxxk f134519e;

    /* renamed from: a */
    public int f134520a;

    /* renamed from: b */
    public int f134521b;

    /* renamed from: c */
    public boolean f134522c;

    static {
        borw borw = new borw();
        f134518d = borw;
        bxvk.m124024a(borw.class, borw);
    }

    private borw() {
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
            return bxvk.m124022a(f134518d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", boru.f134517a, "c"});
        } else if (i2 == 3) {
            return new borw();
        } else {
            if (i2 == 4) {
                return new bxvd(f134518d);
            }
            if (i2 == 5) {
                return f134518d;
            }
            bxxk bxxk = f134519e;
            if (bxxk == null) {
                synchronized (borw.class) {
                    bxxk = f134519e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134518d);
                        f134519e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
