package p000;

/* renamed from: btaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btaq extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btaq f148036g;

    /* renamed from: h */
    private static volatile bxxk f148037h;

    /* renamed from: a */
    public int f148038a;

    /* renamed from: b */
    public long f148039b;

    /* renamed from: c */
    public long f148040c;

    /* renamed from: d */
    public bxyk f148041d;

    /* renamed from: e */
    public bxyk f148042e;

    /* renamed from: f */
    public long f148043f;

    static {
        btaq btaq = new btaq();
        f148036g = btaq;
        bxvk.m124024a(btaq.class, btaq);
    }

    private btaq() {
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
            return bxvk.m124022a(f148036g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002\u0004\t\u0005\t\u0006\u0002", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btaq();
        } else {
            if (i2 == 4) {
                return new bxvd(f148036g);
            }
            if (i2 == 5) {
                return f148036g;
            }
            bxxk bxxk = f148037h;
            if (bxxk == null) {
                synchronized (btaq.class) {
                    bxxk = f148037h;
                    if (bxxk == null) {
                        bxxk = new bxve(f148036g);
                        f148037h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
