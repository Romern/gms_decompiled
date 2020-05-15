package p000;

/* renamed from: bpdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdp extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpdp f136352f;

    /* renamed from: g */
    private static volatile bxxk f136353g;

    /* renamed from: a */
    public int f136354a;

    /* renamed from: b */
    public int f136355b;

    /* renamed from: c */
    public int f136356c;

    /* renamed from: d */
    public long f136357d;

    /* renamed from: e */
    public long f136358e;

    static {
        bpdp bpdp = new bpdp();
        f136352f = bpdp;
        GeneratedMessageLite.m124024a(bpdp.class, bpdp);
    }

    private bpdp() {
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
            return GeneratedMessageLite.m124022a(f136352f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpdp();
        } else {
            if (i2 == 4) {
                return new bxvd(f136352f);
            }
            if (i2 == 5) {
                return f136352f;
            }
            bxxk bxxk = f136353g;
            if (bxxk == null) {
                synchronized (bpdp.class) {
                    bxxk = f136353g;
                    if (bxxk == null) {
                        bxxk = new bxve(f136352f);
                        f136353g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
