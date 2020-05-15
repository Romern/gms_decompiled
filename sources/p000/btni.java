package p000;

/* renamed from: btni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btni extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btni f149624e;

    /* renamed from: f */
    private static volatile bxxk f149625f;

    /* renamed from: a */
    public boolean f149626a;

    /* renamed from: b */
    public int f149627b;

    /* renamed from: c */
    public int f149628c;

    /* renamed from: d */
    public boolean f149629d;

    static {
        btni btni = new btni();
        f149624e = btni;
        bxvk.m124024a(btni.class, btni);
    }

    private btni() {
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
            return bxvk.m124022a(f149624e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003\f\u0004\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btni();
        } else {
            if (i2 == 4) {
                return new bxvd(f149624e);
            }
            if (i2 == 5) {
                return f149624e;
            }
            bxxk bxxk = f149625f;
            if (bxxk == null) {
                synchronized (btni.class) {
                    bxxk = f149625f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149624e);
                        f149625f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
