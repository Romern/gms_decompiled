package p000;

/* renamed from: btnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnt extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btnt f149683b;

    /* renamed from: c */
    private static volatile bxxk f149684c;

    /* renamed from: a */
    public btnu f149685a;

    static {
        btnt btnt = new btnt();
        f149683b = btnt;
        bxvk.m124024a(btnt.class, btnt);
    }

    private btnt() {
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
            return bxvk.m124022a(f149683b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btnt();
        } else {
            if (i2 == 4) {
                return new bxvd(f149683b);
            }
            if (i2 == 5) {
                return f149683b;
            }
            bxxk bxxk = f149684c;
            if (bxxk == null) {
                synchronized (btnt.class) {
                    bxxk = f149684c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149683b);
                        f149684c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
