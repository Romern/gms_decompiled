package p000;

/* renamed from: bzzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzzz extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzzz f172298f;

    /* renamed from: g */
    private static volatile bxxk f172299g;

    /* renamed from: a */
    public int f172300a;

    /* renamed from: b */
    public String f172301b = "";

    /* renamed from: c */
    public String f172302c = "";

    /* renamed from: d */
    public bxvw f172303d = bxwq.f165002b;

    /* renamed from: e */
    public String f172304e = "";

    static {
        bzzz bzzz = new bzzz();
        f172298f = bzzz;
        GeneratedMessageLite.m124024a(bzzz.class, bzzz);
    }

    private bzzz() {
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
            return GeneratedMessageLite.m124022a(f172298f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u0014\u0005ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzzz();
        } else {
            if (i2 == 4) {
                return new bzzy();
            }
            if (i2 == 5) {
                return f172298f;
            }
            bxxk bxxk = f172299g;
            if (bxxk == null) {
                synchronized (bzzz.class) {
                    bxxk = f172299g;
                    if (bxxk == null) {
                        bxxk = new bxve(f172298f);
                        f172299g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
