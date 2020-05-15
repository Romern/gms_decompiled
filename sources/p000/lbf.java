package p000;

/* renamed from: lbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lbf extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final lbf f25715f;

    /* renamed from: g */
    private static volatile bxxk f25716g;

    /* renamed from: a */
    public bxwc f25717a = bxxn.f165040b;

    /* renamed from: b */
    public String f25718b = "";

    /* renamed from: c */
    public int f25719c;

    /* renamed from: d */
    public long f25720d;

    /* renamed from: e */
    public long f25721e;

    static {
        lbf lbf = new lbf();
        f25715f = lbf;
        GeneratedMessageLite.m124024a(lbf.class, lbf);
    }

    private lbf() {
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
            return GeneratedMessageLite.m124022a(f25715f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u001b\u0004Ȉ\u0005\u0004\u0006\u0005\u0007\u0005", new Object[]{"a", lbd.class, "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new lbf();
        } else {
            if (i2 == 4) {
                return new bxvd(f25715f);
            }
            if (i2 == 5) {
                return f25715f;
            }
            bxxk bxxk = f25716g;
            if (bxxk == null) {
                synchronized (lbf.class) {
                    bxxk = f25716g;
                    if (bxxk == null) {
                        bxxk = new bxve(f25715f);
                        f25716g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
