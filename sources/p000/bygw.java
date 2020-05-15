package p000;

/* renamed from: bygw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bygw f166398b;

    /* renamed from: c */
    private static volatile bxxk f166399c;

    /* renamed from: a */
    public bxwc f166400a = bxxn.f165040b;

    static {
        bygw bygw = new bygw();
        f166398b = bygw;
        bxvk.m124024a(bygw.class, bygw);
    }

    private bygw() {
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
            return bxvk.m124022a(f166398b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bygv.class});
        } else if (i2 == 3) {
            return new bygw();
        } else {
            if (i2 == 4) {
                return new bxvd(f166398b);
            }
            if (i2 == 5) {
                return f166398b;
            }
            bxxk bxxk = f166399c;
            if (bxxk == null) {
                synchronized (bygw.class) {
                    bxxk = f166399c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166398b);
                        f166399c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
