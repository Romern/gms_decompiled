package p000;

/* renamed from: byel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byel extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byel f165914c;

    /* renamed from: e */
    private static volatile bxxk f165915e;

    /* renamed from: a */
    public long f165916a;

    /* renamed from: b */
    public long f165917b;

    /* renamed from: d */
    private int f165918d;

    static {
        byel byel = new byel();
        f165914c = byel;
        bxvk.m124024a(byel.class, byel);
    }

    private byel() {
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
            return bxvk.m124022a(f165914c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002စ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new byel();
        } else {
            if (i2 == 4) {
                return new bxvd(f165914c);
            }
            if (i2 == 5) {
                return f165914c;
            }
            bxxk bxxk = f165915e;
            if (bxxk == null) {
                synchronized (byel.class) {
                    bxxk = f165915e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165914c);
                        f165915e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
