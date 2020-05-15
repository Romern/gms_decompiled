package p000;

/* renamed from: bplg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplg extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bplg f138081f;

    /* renamed from: g */
    private static volatile bxxk f138082g;

    /* renamed from: a */
    public int f138083a;

    /* renamed from: b */
    public int f138084b;

    /* renamed from: c */
    public int f138085c;

    /* renamed from: d */
    public int f138086d;

    /* renamed from: e */
    public int f138087e;

    static {
        bplg bplg = new bplg();
        f138081f = bplg;
        GeneratedMessageLite.m124024a(bplg.class, bplg);
    }

    private bplg() {
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
            return GeneratedMessageLite.m124022a(f138081f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bplg();
        } else {
            if (i2 == 4) {
                return new bxvd(f138081f);
            }
            if (i2 == 5) {
                return f138081f;
            }
            bxxk bxxk = f138082g;
            if (bxxk == null) {
                synchronized (bplg.class) {
                    bxxk = f138082g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138081f);
                        f138082g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
