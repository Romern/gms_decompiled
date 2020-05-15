package p000;

/* renamed from: bzla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzla extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzla f170493d;

    /* renamed from: e */
    private static volatile bxxk f170494e;

    /* renamed from: a */
    public int f170495a;

    /* renamed from: b */
    public String f170496b = "";

    /* renamed from: c */
    public String f170497c = "";

    static {
        bzla bzla = new bzla();
        f170493d = bzla;
        GeneratedMessageLite.m124024a(bzla.class, bzla);
    }

    private bzla() {
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
            return GeneratedMessageLite.m124022a(f170493d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzla();
        } else {
            if (i2 == 4) {
                return new bxvd(f170493d);
            }
            if (i2 == 5) {
                return f170493d;
            }
            bxxk bxxk = f170494e;
            if (bxxk == null) {
                synchronized (bzla.class) {
                    bxxk = f170494e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170493d);
                        f170494e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
