package p000;

/* renamed from: btyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btyw f152992d;

    /* renamed from: e */
    private static volatile bxxk f152993e;

    /* renamed from: a */
    public int f152994a;

    /* renamed from: b */
    public int f152995b;

    /* renamed from: c */
    public int f152996c;

    static {
        btyw btyw = new btyw();
        f152992d = btyw;
        bxvk.m124024a(btyw.class, btyw);
    }

    private btyw() {
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
            return bxvk.m124022a(f152992d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", btze.m119038b(), "c", btzc.m119034b()});
        } else if (i2 == 3) {
            return new btyw();
        } else {
            if (i2 == 4) {
                return new bxvd(f152992d);
            }
            if (i2 == 5) {
                return f152992d;
            }
            bxxk bxxk = f152993e;
            if (bxxk == null) {
                synchronized (btyw.class) {
                    bxxk = f152993e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152992d);
                        f152993e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
