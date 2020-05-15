package p000;

/* renamed from: btut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btut extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btut f150628c;

    /* renamed from: d */
    private static volatile bxxk f150629d;

    /* renamed from: a */
    public int f150630a;

    /* renamed from: b */
    public btus f150631b;

    static {
        btut btut = new btut();
        f150628c = btut;
        bxvk.m124024a(btut.class, btut);
    }

    private btut() {
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
            return bxvk.m124022a(f150628c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btut();
        } else {
            if (i2 == 4) {
                return new bxvd(f150628c);
            }
            if (i2 == 5) {
                return f150628c;
            }
            bxxk bxxk = f150629d;
            if (bxxk == null) {
                synchronized (btut.class) {
                    bxxk = f150629d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150628c);
                        f150629d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
