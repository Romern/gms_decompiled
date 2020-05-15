package p000;

/* renamed from: cejm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cejm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cejm f182788b;

    /* renamed from: c */
    private static volatile bxxk f182789c;

    /* renamed from: a */
    public bxwc f182790a = bxxn.f165040b;

    static {
        cejm cejm = new cejm();
        f182788b = cejm;
        GeneratedMessageLite.m124024a(cejm.class, cejm);
    }

    private cejm() {
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
            return GeneratedMessageLite.m124022a(f182788b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cejl.class});
        } else if (i2 == 3) {
            return new cejm();
        } else {
            if (i2 == 4) {
                return new bxvd(f182788b);
            }
            if (i2 == 5) {
                return f182788b;
            }
            bxxk bxxk = f182789c;
            if (bxxk == null) {
                synchronized (cejm.class) {
                    bxxk = f182789c;
                    if (bxxk == null) {
                        bxxk = new bxve(f182788b);
                        f182789c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
