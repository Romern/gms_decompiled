package p000;

/* renamed from: buor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buor extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buor f154576d;

    /* renamed from: e */
    private static volatile bxxk f154577e;

    /* renamed from: a */
    public bxtx f154578a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f154579b = bxtx.f164797b;

    /* renamed from: c */
    public String f154580c = "";

    static {
        buor buor = new buor();
        f154576d = buor;
        bxvk.m124024a(buor.class, buor);
    }

    private buor() {
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
            return bxvk.m124022a(f154576d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buor();
        } else {
            if (i2 == 4) {
                return new bxvd(f154576d);
            }
            if (i2 == 5) {
                return f154576d;
            }
            bxxk bxxk = f154577e;
            if (bxxk == null) {
                synchronized (buor.class) {
                    bxxk = f154577e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154576d);
                        f154577e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
