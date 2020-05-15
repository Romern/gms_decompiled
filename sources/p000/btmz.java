package p000;

/* renamed from: btmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btmz f149585b;

    /* renamed from: c */
    private static volatile bxxk f149586c;

    /* renamed from: a */
    public int f149587a;

    static {
        btmz btmz = new btmz();
        f149585b = btmz;
        bxvk.m124024a(btmz.class, btmz);
    }

    private btmz() {
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
            return bxvk.m124022a(f149585b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btmz();
        } else {
            if (i2 == 4) {
                return new bxvd(f149585b);
            }
            if (i2 == 5) {
                return f149585b;
            }
            bxxk bxxk = f149586c;
            if (bxxk == null) {
                synchronized (btmz.class) {
                    bxxk = f149586c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149585b);
                        f149586c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
