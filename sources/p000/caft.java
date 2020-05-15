package p000;

/* renamed from: caft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caft extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final caft f172959e;

    /* renamed from: f */
    private static volatile bxxk f172960f;

    /* renamed from: a */
    public int f172961a;

    /* renamed from: b */
    public int f172962b;

    /* renamed from: c */
    public int f172963c;

    /* renamed from: d */
    public int f172964d;

    static {
        caft caft = new caft();
        f172959e = caft;
        GeneratedMessageLite.m124024a(caft.class, caft);
    }

    private caft() {
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
            return GeneratedMessageLite.m124022a(f172959e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new caft();
        } else {
            if (i2 == 4) {
                return new bxvd(f172959e);
            }
            if (i2 == 5) {
                return f172959e;
            }
            bxxk bxxk = f172960f;
            if (bxxk == null) {
                synchronized (caft.class) {
                    bxxk = f172960f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172959e);
                        f172960f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
