package p000;

/* renamed from: bmot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmot extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmot f130255f;

    /* renamed from: h */
    private static volatile bxxk f130256h;

    /* renamed from: a */
    public int f130257a;

    /* renamed from: b */
    public int f130258b;

    /* renamed from: c */
    public bxvt f130259c = bxvm.f164965b;

    /* renamed from: d */
    public bxvt f130260d = bxvm.f164965b;

    /* renamed from: e */
    public int f130261e;

    /* renamed from: g */
    private int f130262g;

    static {
        bmot bmot = new bmot();
        f130255f = bmot;
        GeneratedMessageLite.m124024a(bmot.class, bmot);
    }

    private bmot() {
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
            return GeneratedMessageLite.m124022a(f130255f, "\u0001\u0005\u0000\u0001\u0003\n\u0005\u0000\u0002\u0000\u0003င\u0000\u0004င\u0001\u0006'\u0007'\nဌ\u0002", new Object[]{"g", "a", "b", "c", "d", "e", bmor.f130254a});
        } else if (i2 == 3) {
            return new bmot();
        } else {
            if (i2 == 4) {
                return new bxvd(f130255f);
            }
            if (i2 == 5) {
                return f130255f;
            }
            bxxk bxxk = f130256h;
            if (bxxk == null) {
                synchronized (bmot.class) {
                    bxxk = f130256h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130255f);
                        f130256h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
