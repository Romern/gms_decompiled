package p000;

/* renamed from: boss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boss extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final boss f134650f;

    /* renamed from: g */
    private static volatile bxxk f134651g;

    /* renamed from: a */
    public int f134652a;

    /* renamed from: b */
    public int f134653b;

    /* renamed from: c */
    public bxvt f134654c = bxvm.f164965b;

    /* renamed from: d */
    public boolean f134655d;

    /* renamed from: e */
    public int f134656e;

    static {
        boss boss = new boss();
        f134650f = boss;
        GeneratedMessageLite.m124024a(boss.class, boss);
    }

    private boss() {
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
            return GeneratedMessageLite.m124022a(f134650f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u0016\u0003ဇ\u0001\u0004င\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new boss();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f134650f;
            }
            bxxk bxxk = f134651g;
            if (bxxk == null) {
                synchronized (boss.class) {
                    bxxk = f134651g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134650f);
                        f134651g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
