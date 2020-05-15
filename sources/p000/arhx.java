package p000;

/* renamed from: arhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arhx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final arhx f87755d;

    /* renamed from: e */
    private static volatile bxxk f87756e;

    /* renamed from: a */
    public int f87757a;

    /* renamed from: b */
    public int f87758b;

    /* renamed from: c */
    public arhz f87759c;

    static {
        arhx arhx = new arhx();
        f87755d = arhx;
        GeneratedMessageLite.m124024a(arhx.class, arhx);
    }

    private arhx() {
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
            return GeneratedMessageLite.m124022a(f87755d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", arhv.f87754a, "c"});
        } else if (i2 == 3) {
            return new arhx();
        } else {
            if (i2 == 4) {
                return new bxvd(f87755d);
            }
            if (i2 == 5) {
                return f87755d;
            }
            bxxk bxxk = f87756e;
            if (bxxk == null) {
                synchronized (arhx.class) {
                    bxxk = f87756e;
                    if (bxxk == null) {
                        bxxk = new bxve(f87755d);
                        f87756e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
