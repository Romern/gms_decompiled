package p000;

/* renamed from: cafp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cafp f172936d;

    /* renamed from: f */
    private static volatile bxxk f172937f;

    /* renamed from: a */
    public boolean f172938a;

    /* renamed from: b */
    public bxwc f172939b = bxxn.f165040b;

    /* renamed from: c */
    public bxww f172940c = bxww.f165013b;

    /* renamed from: e */
    private int f172941e;

    static {
        cafp cafp = new cafp();
        f172936d = cafp;
        GeneratedMessageLite.m124024a(cafp.class, cafp);
    }

    private cafp() {
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
            return GeneratedMessageLite.m124022a(f172936d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u0001ဇ\u0000\u0002\u001b\u00032", new Object[]{"e", "a", "b", cafo.class, "c", cafn.f172930a});
        } else if (i2 == 3) {
            return new cafp();
        } else {
            if (i2 == 4) {
                return new bxvd(f172936d);
            }
            if (i2 == 5) {
                return f172936d;
            }
            bxxk bxxk = f172937f;
            if (bxxk == null) {
                synchronized (cafp.class) {
                    bxxk = f172937f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172936d);
                        f172937f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
