package p000;

/* renamed from: bwpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwpm f160570c;

    /* renamed from: d */
    public static final bxvj f160571d;

    /* renamed from: e */
    private static volatile bxxk f160572e;

    /* renamed from: a */
    public int f160573a;

    /* renamed from: b */
    public int f160574b;

    static {
        bwpm bwpm = new bwpm();
        f160570c = bwpm;
        bxvk.m124024a(bwpm.class, bwpm);
        bwog bwog = bwog.f160437f;
        bwpm bwpm2 = f160570c;
        f160571d = bxvk.m124006a(bwog, bwpm2, bwpm2, 277984631, bxzf.MESSAGE);
    }

    private bwpm() {
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
            return bxvk.m124022a(f160570c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwpm();
        } else {
            if (i2 == 4) {
                return new bxvd(f160570c);
            }
            if (i2 == 5) {
                return f160570c;
            }
            bxxk bxxk = f160572e;
            if (bxxk == null) {
                synchronized (bwpm.class) {
                    bxxk = f160572e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160570c);
                        f160572e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
