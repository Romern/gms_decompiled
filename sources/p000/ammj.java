package p000;

/* renamed from: ammj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final ammj f75289f;

    /* renamed from: g */
    private static volatile bxxk f75290g;

    /* renamed from: a */
    public int f75291a;

    /* renamed from: b */
    public int f75292b;

    /* renamed from: c */
    public int f75293c;

    /* renamed from: d */
    public long f75294d;

    /* renamed from: e */
    public int f75295e;

    static {
        ammj ammj = new ammj();
        f75289f = ammj;
        GeneratedMessageLite.m124024a(ammj.class, ammj);
    }

    private ammj() {
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
            return GeneratedMessageLite.m124022a(f75289f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ammj();
        } else {
            if (i2 == 4) {
                return new bxvd(f75289f);
            }
            if (i2 == 5) {
                return f75289f;
            }
            bxxk bxxk = f75290g;
            if (bxxk == null) {
                synchronized (ammj.class) {
                    bxxk = f75290g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75289f);
                        f75290g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
