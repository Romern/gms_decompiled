package p000;

/* renamed from: byjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byjw f166702c;

    /* renamed from: d */
    private static volatile bxxk f166703d;

    /* renamed from: a */
    public int f166704a;

    /* renamed from: b */
    public boolean f166705b;

    static {
        byjw byjw = new byjw();
        f166702c = byjw;
        bxvk.m124024a(byjw.class, byjw);
    }

    private byjw() {
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
            return bxvk.m124022a(f166702c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byjw();
        } else {
            if (i2 == 4) {
                return new bxvd(f166702c);
            }
            if (i2 == 5) {
                return f166702c;
            }
            bxxk bxxk = f166703d;
            if (bxxk == null) {
                synchronized (byjw.class) {
                    bxxk = f166703d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166702c);
                        f166703d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
