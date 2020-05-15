package p000;

/* renamed from: byhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhc extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final byhc f166424f;

    /* renamed from: g */
    private static volatile bxxk f166425g;

    /* renamed from: a */
    public int f166426a;

    /* renamed from: b */
    public int f166427b;

    /* renamed from: c */
    public int f166428c;

    /* renamed from: d */
    public long f166429d;

    /* renamed from: e */
    public byix f166430e;

    static {
        byhc byhc = new byhc();
        f166424f = byhc;
        GeneratedMessageLite.m124024a(byhc.class, byhc);
    }

    private byhc() {
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
            return GeneratedMessageLite.m124022a(f166424f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byhc();
        } else {
            if (i2 == 4) {
                return new bxvd(f166424f);
            }
            if (i2 == 5) {
                return f166424f;
            }
            bxxk bxxk = f166425g;
            if (bxxk == null) {
                synchronized (byhc.class) {
                    bxxk = f166425g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166424f);
                        f166425g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
