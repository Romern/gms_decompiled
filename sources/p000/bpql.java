package p000;

/* renamed from: bpql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpql extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpql f138757g;

    /* renamed from: h */
    private static volatile bxxk f138758h;

    /* renamed from: a */
    public int f138759a;

    /* renamed from: b */
    public int f138760b;

    /* renamed from: c */
    public int f138761c;

    /* renamed from: d */
    public int f138762d;

    /* renamed from: e */
    public int f138763e;

    /* renamed from: f */
    public int f138764f;

    static {
        bpql bpql = new bpql();
        f138757g = bpql;
        GeneratedMessageLite.m124024a(bpql.class, bpql);
    }

    private bpql() {
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
            return GeneratedMessageLite.m124022a(f138757g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", bpox.f138585a});
        } else if (i2 == 3) {
            return new bpql();
        } else {
            if (i2 == 4) {
                return new bxvd(f138757g);
            }
            if (i2 == 5) {
                return f138757g;
            }
            bxxk bxxk = f138758h;
            if (bxxk == null) {
                synchronized (bpql.class) {
                    bxxk = f138758h;
                    if (bxxk == null) {
                        bxxk = new bxve(f138757g);
                        f138758h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
