package p000;

/* renamed from: aylu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aylu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final aylu f97932c;

    /* renamed from: e */
    private static volatile bxxk f97933e;

    /* renamed from: a */
    public String f97934a = "";

    /* renamed from: b */
    public bxwc f97935b = bxxn.f165040b;

    /* renamed from: d */
    private int f97936d;

    static {
        aylu aylu = new aylu();
        f97932c = aylu;
        GeneratedMessageLite.m124024a(aylu.class, aylu);
    }

    private aylu() {
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
            return GeneratedMessageLite.m124022a(f97932c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", ayls.class});
        } else if (i2 == 3) {
            return new aylu();
        } else {
            if (i2 == 4) {
                return new bxvd(f97932c);
            }
            if (i2 == 5) {
                return f97932c;
            }
            bxxk bxxk = f97933e;
            if (bxxk == null) {
                synchronized (aylu.class) {
                    bxxk = f97933e;
                    if (bxxk == null) {
                        bxxk = new bxve(f97932c);
                        f97933e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
