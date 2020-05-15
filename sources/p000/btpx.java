package p000;

/* renamed from: btpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btpx f149902c;

    /* renamed from: d */
    private static volatile bxxk f149903d;

    /* renamed from: a */
    public btpw f149904a;

    /* renamed from: b */
    public bxte f149905b;

    static {
        btpx btpx = new btpx();
        f149902c = btpx;
        bxvk.m124024a(btpx.class, btpx);
    }

    private btpx() {
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
            return bxvk.m124022a(f149902c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btpx();
        } else {
            if (i2 == 4) {
                return new bxvd(f149902c);
            }
            if (i2 == 5) {
                return f149902c;
            }
            bxxk bxxk = f149903d;
            if (bxxk == null) {
                synchronized (btpx.class) {
                    bxxk = f149903d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149902c);
                        f149903d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
