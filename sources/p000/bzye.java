package p000;

/* renamed from: bzye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzye extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzye f171854c;

    /* renamed from: d */
    private static volatile bxxk f171855d;

    /* renamed from: a */
    public bxwc f171856a = bxxn.f165040b;

    /* renamed from: b */
    public long f171857b;

    static {
        bzye bzye = new bzye();
        f171854c = bzye;
        bxvk.m124024a(bzye.class, bzye);
    }

    private bzye() {
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
            return bxvk.m124022a(f171854c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"a", bzyn.class, "b"});
        } else if (i2 == 3) {
            return new bzye();
        } else {
            if (i2 == 4) {
                return new bxvd(f171854c);
            }
            if (i2 == 5) {
                return f171854c;
            }
            bxxk bxxk = f171855d;
            if (bxxk == null) {
                synchronized (bzye.class) {
                    bxxk = f171855d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171854c);
                        f171855d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
