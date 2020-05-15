package p000;

/* renamed from: btov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btov extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btov f149806c;

    /* renamed from: d */
    private static volatile bxxk f149807d;

    /* renamed from: a */
    public String f149808a = "";

    /* renamed from: b */
    public bxwc f149809b = bxxn.f165040b;

    static {
        btov btov = new btov();
        f149806c = btov;
        bxvk.m124024a(btov.class, btov);
    }

    private btov() {
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
            return bxvk.m124022a(f149806c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btov();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f149806c;
            }
            bxxk bxxk = f149807d;
            if (bxxk == null) {
                synchronized (btov.class) {
                    bxxk = f149807d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149806c);
                        f149807d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
