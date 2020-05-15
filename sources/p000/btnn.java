package p000;

/* renamed from: btnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final btnn f149659h;

    /* renamed from: i */
    private static volatile bxxk f149660i;

    /* renamed from: a */
    public btng f149661a;

    /* renamed from: b */
    public btnk f149662b;

    /* renamed from: c */
    public btnl f149663c;

    /* renamed from: d */
    public btnh f149664d;

    /* renamed from: e */
    public btnm f149665e;

    /* renamed from: f */
    public btni f149666f;

    /* renamed from: g */
    public btnj f149667g;

    static {
        btnn btnn = new btnn();
        f149659h = btnn;
        GeneratedMessageLite.m124024a(btnn.class, btnn);
    }

    private btnn() {
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
            return GeneratedMessageLite.m124022a(f149659h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\b\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new btnn();
        } else {
            if (i2 == 4) {
                return new bxvd(f149659h);
            }
            if (i2 == 5) {
                return f149659h;
            }
            bxxk bxxk = f149660i;
            if (bxxk == null) {
                synchronized (btnn.class) {
                    bxxk = f149660i;
                    if (bxxk == null) {
                        bxxk = new bxve(f149659h);
                        f149660i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
