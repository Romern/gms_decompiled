package p000;

/* renamed from: amnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final amnw f75565e;

    /* renamed from: f */
    private static volatile bxxk f75566f;

    /* renamed from: a */
    public int f75567a;

    /* renamed from: b */
    public int f75568b;

    /* renamed from: c */
    public boolean f75569c;

    /* renamed from: d */
    public int f75570d;

    static {
        amnw amnw = new amnw();
        f75565e = amnw;
        GeneratedMessageLite.m124024a(amnw.class, amnw);
    }

    private amnw() {
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
            return GeneratedMessageLite.m124022a(f75565e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", amnv.f75564a});
        } else if (i2 == 3) {
            return new amnw();
        } else {
            if (i2 == 4) {
                return new bxvd(f75565e);
            }
            if (i2 == 5) {
                return f75565e;
            }
            bxxk bxxk = f75566f;
            if (bxxk == null) {
                synchronized (amnw.class) {
                    bxxk = f75566f;
                    if (bxxk == null) {
                        bxxk = new bxve(f75565e);
                        f75566f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
