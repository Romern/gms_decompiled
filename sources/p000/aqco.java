package p000;

/* renamed from: aqco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqco extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aqco f85682d;

    /* renamed from: e */
    private static volatile bxxk f85683e;

    /* renamed from: a */
    public int f85684a;

    /* renamed from: b */
    public bxwc f85685b = bxxn.f165040b;

    /* renamed from: c */
    public aqcg f85686c;

    static {
        aqco aqco = new aqco();
        f85682d = aqco;
        GeneratedMessageLite.m124024a(aqco.class, aqco);
    }

    private aqco() {
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
            return GeneratedMessageLite.m124022a(f85682d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", aqcn.class, "c"});
        } else if (i2 == 3) {
            return new aqco();
        } else {
            if (i2 == 4) {
                return new bxvd(f85682d);
            }
            if (i2 == 5) {
                return f85682d;
            }
            bxxk bxxk = f85683e;
            if (bxxk == null) {
                synchronized (aqco.class) {
                    bxxk = f85683e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85682d);
                        f85683e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
