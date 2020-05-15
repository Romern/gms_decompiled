package p000;

/* renamed from: bxlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxlo f163871e;

    /* renamed from: f */
    private static volatile bxxk f163872f;

    /* renamed from: a */
    public int f163873a;

    /* renamed from: b */
    public int f163874b;

    /* renamed from: c */
    public int f163875c;

    /* renamed from: d */
    public bxwc f163876d = bxxn.f165040b;

    static {
        bxlo bxlo = new bxlo();
        f163871e = bxlo;
        GeneratedMessageLite.m124024a(bxlo.class, bxlo);
    }

    private bxlo() {
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
            return GeneratedMessageLite.m124022a(f163871e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"a", "b", bxcl.m122572b(), "c", bxls.f163890a, "d", bxlo.class});
        } else if (i2 == 3) {
            return new bxlo();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f163871e;
            }
            bxxk bxxk = f163872f;
            if (bxxk == null) {
                synchronized (bxlo.class) {
                    bxxk = f163872f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163871e);
                        f163872f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
