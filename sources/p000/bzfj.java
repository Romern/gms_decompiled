package p000;

/* renamed from: bzfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzfj f169818b;

    /* renamed from: c */
    public static final bxvj f169819c;

    /* renamed from: d */
    private static volatile bxxk f169820d;

    /* renamed from: a */
    public bxwc f169821a = bxxn.f165040b;

    static {
        bzfj bzfj = new bzfj();
        f169818b = bzfj;
        GeneratedMessageLite.m124024a(bzfj.class, bzfj);
        blca blca = blca.f125893b;
        bzfj bzfj2 = f169818b;
        f169819c = GeneratedMessageLite.m124006a(blca, bzfj2, bzfj2, 71464407, bxzf.MESSAGE);
    }

    private bzfj() {
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
            return GeneratedMessageLite.m124022a(f169818b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzgq.class});
        } else if (i2 == 3) {
            return new bzfj();
        } else {
            if (i2 == 4) {
                return new bxvd(f169818b);
            }
            if (i2 == 5) {
                return f169818b;
            }
            bxxk bxxk = f169820d;
            if (bxxk == null) {
                synchronized (bzfj.class) {
                    bxxk = f169820d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169818b);
                        f169820d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
