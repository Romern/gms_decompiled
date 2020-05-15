package p000;

/* renamed from: btmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btmk f149498c;

    /* renamed from: d */
    private static volatile bxxk f149499d;

    /* renamed from: a */
    public btmi f149500a;

    /* renamed from: b */
    public btmj f149501b;

    static {
        btmk btmk = new btmk();
        f149498c = btmk;
        bxvk.m124024a(btmk.class, btmk);
    }

    private btmk() {
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
            return bxvk.m124022a(f149498c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btmk();
        } else {
            if (i2 == 4) {
                return new bxvd(f149498c);
            }
            if (i2 == 5) {
                return f149498c;
            }
            bxxk bxxk = f149499d;
            if (bxxk == null) {
                synchronized (btmk.class) {
                    bxxk = f149499d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149498c);
                        f149499d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
