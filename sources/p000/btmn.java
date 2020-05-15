package p000;

/* renamed from: btmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btmn f149517b;

    /* renamed from: c */
    private static volatile bxxk f149518c;

    /* renamed from: a */
    public boolean f149519a;

    static {
        btmn btmn = new btmn();
        f149517b = btmn;
        bxvk.m124024a(btmn.class, btmn);
    }

    private btmn() {
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
            return bxvk.m124022a(f149517b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btmn();
        } else {
            if (i2 == 4) {
                return new bxvd(f149517b);
            }
            if (i2 == 5) {
                return f149517b;
            }
            bxxk bxxk = f149518c;
            if (bxxk == null) {
                synchronized (btmn.class) {
                    bxxk = f149518c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149517b);
                        f149518c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
