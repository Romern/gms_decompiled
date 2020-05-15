package p000;

/* renamed from: ciop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciop extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ciop f191103d;

    /* renamed from: e */
    private static volatile bxxk f191104e;

    /* renamed from: a */
    public int f191105a;

    /* renamed from: b */
    public int f191106b;

    /* renamed from: c */
    public int f191107c = 1;

    static {
        ciop ciop = new ciop();
        f191103d = ciop;
        GeneratedMessageLite.m124024a(ciop.class, ciop);
    }

    private ciop() {
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
            return GeneratedMessageLite.m124022a(f191103d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", cioo.m150670b(), "c"});
        } else if (i2 == 3) {
            return new ciop();
        } else {
            if (i2 == 4) {
                return new bxvd(f191103d);
            }
            if (i2 == 5) {
                return f191103d;
            }
            bxxk bxxk = f191104e;
            if (bxxk == null) {
                synchronized (ciop.class) {
                    bxxk = f191104e;
                    if (bxxk == null) {
                        bxxk = new bxve(f191103d);
                        f191104e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
