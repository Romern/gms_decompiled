package p000;

/* renamed from: buey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buey extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final buey f153665e;

    /* renamed from: f */
    private static volatile bxxk f153666f;

    /* renamed from: a */
    public int f153667a;

    /* renamed from: b */
    public int f153668b;

    /* renamed from: c */
    public bxwc f153669c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f153670d = bxvm.f164965b;

    static {
        buey buey = new buey();
        f153665e = buey;
        GeneratedMessageLite.m124024a(buey.class, buey);
    }

    private buey() {
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
            return GeneratedMessageLite.m124022a(f153665e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001d", new Object[]{"a", "b", buex.f153664a, "c", bues.class, "d"});
        } else if (i2 == 3) {
            return new buey();
        } else {
            if (i2 == 4) {
                return new buew();
            }
            if (i2 == 5) {
                return f153665e;
            }
            bxxk bxxk = f153666f;
            if (bxxk == null) {
                synchronized (buey.class) {
                    bxxk = f153666f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153665e);
                        f153666f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
