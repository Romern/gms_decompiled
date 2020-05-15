package p000;

/* renamed from: bwrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwrx f160814d;

    /* renamed from: e */
    public static final bxvj f160815e;

    /* renamed from: f */
    private static volatile bxxk f160816f;

    /* renamed from: a */
    public int f160817a;

    /* renamed from: b */
    public bxwc f160818b = bxxn.f165040b;

    /* renamed from: c */
    public int f160819c;

    static {
        bwrx bwrx = new bwrx();
        f160814d = bwrx;
        GeneratedMessageLite.m124024a(bwrx.class, bwrx);
        bwog bwog = bwog.f160437f;
        bwrx bwrx2 = f160814d;
        f160815e = GeneratedMessageLite.m124006a(bwog, bwrx2, bwrx2, 264984587, bxzf.MESSAGE);
    }

    private bwrx() {
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
            return GeneratedMessageLite.m124022a(f160814d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", bwrw.class, "c"});
        } else if (i2 == 3) {
            return new bwrx();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f160814d;
            }
            bxxk bxxk = f160816f;
            if (bxxk == null) {
                synchronized (bwrx.class) {
                    bxxk = f160816f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160814d);
                        f160816f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
