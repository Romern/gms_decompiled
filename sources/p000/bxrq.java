package p000;

/* renamed from: bxrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrq extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxrq f164586f;

    /* renamed from: g */
    private static volatile bxxk f164587g;

    /* renamed from: a */
    public int f164588a;

    /* renamed from: b */
    public int f164589b;

    /* renamed from: c */
    public int f164590c;

    /* renamed from: d */
    public int f164591d;

    /* renamed from: e */
    public bxrn f164592e;

    static {
        bxrq bxrq = new bxrq();
        f164586f = bxrq;
        GeneratedMessageLite.m124024a(bxrq.class, bxrq);
    }

    private bxrq() {
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
            return GeneratedMessageLite.m124022a(f164586f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", bxro.f164585a, "d", bxsm.f164713a, "e"});
        } else if (i2 == 3) {
            return new bxrq();
        } else {
            if (i2 == 4) {
                return new bxvd(f164586f);
            }
            if (i2 == 5) {
                return f164586f;
            }
            bxxk bxxk = f164587g;
            if (bxxk == null) {
                synchronized (bxrq.class) {
                    bxxk = f164587g;
                    if (bxxk == null) {
                        bxxk = new bxve(f164586f);
                        f164587g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
