package p000;

/* renamed from: aqcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aqcr f85693e;

    /* renamed from: f */
    private static volatile bxxk f85694f;

    /* renamed from: a */
    public int f85695a;

    /* renamed from: b */
    public bxwc f85696b = bxxn.f165040b;

    /* renamed from: c */
    public aqcg f85697c;

    /* renamed from: d */
    public aqcg f85698d;

    static {
        aqcr aqcr = new aqcr();
        f85693e = aqcr;
        GeneratedMessageLite.m124024a(aqcr.class, aqcr);
    }

    private aqcr() {
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
            return GeneratedMessageLite.m124022a(f85693e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", aqdc.class, "c", "d"});
        } else if (i2 == 3) {
            return new aqcr();
        } else {
            if (i2 == 4) {
                return new aqcq();
            }
            if (i2 == 5) {
                return f85693e;
            }
            bxxk bxxk = f85694f;
            if (bxxk == null) {
                synchronized (aqcr.class) {
                    bxxk = f85694f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85693e);
                        f85694f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
