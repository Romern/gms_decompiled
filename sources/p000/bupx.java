package p000;

/* renamed from: bupx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bupx f154687b;

    /* renamed from: c */
    private static volatile bxxk f154688c;

    /* renamed from: a */
    public long f154689a;

    static {
        bupx bupx = new bupx();
        f154687b = bupx;
        GeneratedMessageLite.m124024a(bupx.class, bupx);
    }

    private bupx() {
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
            return GeneratedMessageLite.m124022a(f154687b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bupx();
        } else {
            if (i2 == 4) {
                return new bxvd(f154687b);
            }
            if (i2 == 5) {
                return f154687b;
            }
            bxxk bxxk = f154688c;
            if (bxxk == null) {
                synchronized (bupx.class) {
                    bxxk = f154688c;
                    if (bxxk == null) {
                        bxxk = new bxve(f154687b);
                        f154688c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
