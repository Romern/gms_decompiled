package p000;

/* renamed from: aqci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqci extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aqci f85653e;

    /* renamed from: f */
    private static volatile bxxk f85654f;

    /* renamed from: a */
    public int f85655a;

    /* renamed from: b */
    public int f85656b;

    /* renamed from: c */
    public int f85657c;

    /* renamed from: d */
    public bxvt f85658d = bxvm.f164965b;

    static {
        aqci aqci = new aqci();
        f85653e = aqci;
        GeneratedMessageLite.m124024a(aqci.class, aqci);
    }

    private aqci() {
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
            return GeneratedMessageLite.m124022a(f85653e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0004\u001e", new Object[]{"a", "b", "c", "d", aqcf.m71347b()});
        } else if (i2 == 3) {
            return new aqci();
        } else {
            if (i2 == 4) {
                return new aqch();
            }
            if (i2 == 5) {
                return f85653e;
            }
            bxxk bxxk = f85654f;
            if (bxxk == null) {
                synchronized (aqci.class) {
                    bxxk = f85654f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85653e);
                        f85654f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
