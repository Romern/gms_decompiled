package p000;

/* renamed from: bqmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqmt f141259b;

    /* renamed from: c */
    private static volatile bxxk f141260c;

    /* renamed from: a */
    public bxwc f141261a = bxxn.f165040b;

    static {
        bqmt bqmt = new bqmt();
        f141259b = bqmt;
        GeneratedMessageLite.m124024a(bqmt.class, bqmt);
    }

    private bqmt() {
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
            return GeneratedMessageLite.m124022a(f141259b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bqmx.class});
        } else if (i2 == 3) {
            return new bqmt();
        } else {
            if (i2 == 4) {
                return new bxvd(f141259b);
            }
            if (i2 == 5) {
                return f141259b;
            }
            bxxk bxxk = f141260c;
            if (bxxk == null) {
                synchronized (bqmt.class) {
                    bxxk = f141260c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141259b);
                        f141260c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
