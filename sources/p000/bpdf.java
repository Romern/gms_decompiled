package p000;

/* renamed from: bpdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpdf f135929c;

    /* renamed from: d */
    private static volatile bxxk f135930d;

    /* renamed from: a */
    public int f135931a;

    /* renamed from: b */
    public int f135932b;

    static {
        bpdf bpdf = new bpdf();
        f135929c = bpdf;
        GeneratedMessageLite.m124024a(bpdf.class, bpdf);
    }

    private bpdf() {
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
            return GeneratedMessageLite.m124022a(f135929c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpdf();
        } else {
            if (i2 == 4) {
                return new bxvd(f135929c);
            }
            if (i2 == 5) {
                return f135929c;
            }
            bxxk bxxk = f135930d;
            if (bxxk == null) {
                synchronized (bpdf.class) {
                    bxxk = f135930d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135929c);
                        f135930d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
