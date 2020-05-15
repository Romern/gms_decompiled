package p000;

/* renamed from: bzfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzfo f169844c;

    /* renamed from: d */
    private static volatile bxxk f169845d;

    /* renamed from: a */
    public int f169846a;

    /* renamed from: b */
    public String f169847b = "";

    static {
        bzfo bzfo = new bzfo();
        f169844c = bzfo;
        bxvk.m124024a(bzfo.class, bzfo);
    }

    private bzfo() {
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
            return bxvk.m124022a(f169844c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzfo();
        } else {
            if (i2 == 4) {
                return new bxvd(f169844c);
            }
            if (i2 == 5) {
                return f169844c;
            }
            bxxk bxxk = f169845d;
            if (bxxk == null) {
                synchronized (bzfo.class) {
                    bxxk = f169845d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169844c);
                        f169845d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
