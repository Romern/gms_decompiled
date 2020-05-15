package p000;

/* renamed from: bxsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsu extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxsu f164744f;

    /* renamed from: g */
    private static volatile bxxk f164745g;

    /* renamed from: a */
    public int f164746a;

    /* renamed from: b */
    public bxre f164747b;

    /* renamed from: c */
    public String f164748c = "";

    /* renamed from: d */
    public bxst f164749d;

    /* renamed from: e */
    public String f164750e = "";

    static {
        bxsu bxsu = new bxsu();
        f164744f = bxsu;
        GeneratedMessageLite.m124024a(bxsu.class, bxsu);
    }

    private bxsu() {
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
            return GeneratedMessageLite.m124022a(f164744f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0002\u0002ဉ\u0000\u0003ဈ\u0001\u0005ဈ\u0004", new Object[]{"a", "d", "b", "c", "e"});
        } else if (i2 == 3) {
            return new bxsu();
        } else {
            if (i2 == 4) {
                return new bxvd(f164744f);
            }
            if (i2 == 5) {
                return f164744f;
            }
            bxxk bxxk = f164745g;
            if (bxxk == null) {
                synchronized (bxsu.class) {
                    bxxk = f164745g;
                    if (bxxk == null) {
                        bxxk = new bxve(f164744f);
                        f164745g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
