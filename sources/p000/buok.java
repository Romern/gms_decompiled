package p000;

/* renamed from: buok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buok extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buok f154541d;

    /* renamed from: e */
    private static volatile bxxk f154542e;

    /* renamed from: a */
    public bxtx f154543a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f154544b = bxtx.f164797b;

    /* renamed from: c */
    public String f154545c = "";

    static {
        buok buok = new buok();
        f154541d = buok;
        bxvk.m124024a(buok.class, buok);
    }

    private buok() {
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
            return bxvk.m124022a(f154541d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buok();
        } else {
            if (i2 == 4) {
                return new bxvd(f154541d);
            }
            if (i2 == 5) {
                return f154541d;
            }
            bxxk bxxk = f154542e;
            if (bxxk == null) {
                synchronized (buok.class) {
                    bxxk = f154542e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154541d);
                        f154542e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}