package p000;

/* renamed from: budw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final budw f153530e;

    /* renamed from: f */
    private static volatile bxxk f153531f;

    /* renamed from: a */
    public int f153532a;

    /* renamed from: b */
    public int f153533b;

    /* renamed from: c */
    public int f153534c;

    /* renamed from: d */
    public int f153535d;

    static {
        budw budw = new budw();
        f153530e = budw;
        GeneratedMessageLite.m124024a(budw.class, budw);
    }

    private budw() {
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
            return GeneratedMessageLite.m124022a(f153530e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new budw();
        } else {
            if (i2 == 4) {
                return new bxvd(f153530e);
            }
            if (i2 == 5) {
                return f153530e;
            }
            bxxk bxxk = f153531f;
            if (bxxk == null) {
                synchronized (budw.class) {
                    bxxk = f153531f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153530e);
                        f153531f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
