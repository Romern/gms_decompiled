package p000;

/* renamed from: bzeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzeb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzeb f169630c;

    /* renamed from: d */
    private static volatile bxxk f169631d;

    /* renamed from: a */
    public String f169632a = "";

    /* renamed from: b */
    public long f169633b;

    static {
        bzeb bzeb = new bzeb();
        f169630c = bzeb;
        bxvk.m124024a(bzeb.class, bzeb);
    }

    private bzeb() {
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
            return bxvk.m124022a(f169630c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzeb();
        } else {
            if (i2 == 4) {
                return new bxvd(f169630c);
            }
            if (i2 == 5) {
                return f169630c;
            }
            bxxk bxxk = f169631d;
            if (bxxk == null) {
                synchronized (bzeb.class) {
                    bxxk = f169631d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169630c);
                        f169631d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
