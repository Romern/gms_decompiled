package p000;

/* renamed from: aqcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final aqcx f85723b;

    /* renamed from: c */
    private static volatile bxxk f85724c;

    /* renamed from: a */
    public bxwc f85725a = bxxn.f165040b;

    static {
        aqcx aqcx = new aqcx();
        f85723b = aqcx;
        GeneratedMessageLite.m124024a(aqcx.class, aqcx);
    }

    private aqcx() {
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
            return GeneratedMessageLite.m124022a(f85723b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aqcw.class});
        } else if (i2 == 3) {
            return new aqcx();
        } else {
            if (i2 == 4) {
                return new bxvd(f85723b);
            }
            if (i2 == 5) {
                return f85723b;
            }
            bxxk bxxk = f85724c;
            if (bxxk == null) {
                synchronized (aqcx.class) {
                    bxxk = f85724c;
                    if (bxxk == null) {
                        bxxk = new bxve(f85723b);
                        f85724c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
