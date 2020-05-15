package p000;

/* renamed from: btpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpu extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btpu f149888f;

    /* renamed from: g */
    private static volatile bxxk f149889g;

    /* renamed from: a */
    public long f149890a;

    /* renamed from: b */
    public btps f149891b;

    /* renamed from: c */
    public btps f149892c;

    /* renamed from: d */
    public int f149893d;

    /* renamed from: e */
    public bxvt f149894e = bxvm.f164965b;

    static {
        btpu btpu = new btpu();
        f149888f = btpu;
        GeneratedMessageLite.m124024a(btpu.class, btpu);
    }

    private btpu() {
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
            return GeneratedMessageLite.m124022a(f149888f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u0002\u0002\t\u0003\t\u0006\f\u0007,", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btpu();
        } else {
            if (i2 == 4) {
                return new btpt();
            }
            if (i2 == 5) {
                return f149888f;
            }
            bxxk bxxk = f149889g;
            if (bxxk == null) {
                synchronized (btpu.class) {
                    bxxk = f149889g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149888f);
                        f149889g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
