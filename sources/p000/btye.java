package p000;

/* renamed from: btye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btye extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btye f152889f;

    /* renamed from: g */
    private static volatile bxxk f152890g;

    /* renamed from: a */
    public int f152891a;

    /* renamed from: b */
    public bxwc f152892b = bxxn.f165040b;

    /* renamed from: c */
    public long f152893c;

    /* renamed from: d */
    public long f152894d;

    /* renamed from: e */
    public int f152895e;

    static {
        btye btye = new btye();
        f152889f = btye;
        GeneratedMessageLite.m124024a(btye.class, btye);
    }

    private btye() {
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
            return GeneratedMessageLite.m124022a(f152889f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဂ\u0001\u0004င\u0002", new Object[]{"a", "b", btyd.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new btye();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f152889f;
            }
            bxxk bxxk = f152890g;
            if (bxxk == null) {
                synchronized (btye.class) {
                    bxxk = f152890g;
                    if (bxxk == null) {
                        bxxk = new bxve(f152889f);
                        f152890g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
