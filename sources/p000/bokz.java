package p000;

/* renamed from: bokz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokz extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bokz f133479h;

    /* renamed from: i */
    private static volatile bxxk f133480i;

    /* renamed from: a */
    public int f133481a;

    /* renamed from: b */
    public boky f133482b;

    /* renamed from: c */
    public bolb f133483c;

    /* renamed from: d */
    public bxwc f133484d = bxxn.f165040b;

    /* renamed from: e */
    public bole f133485e;

    /* renamed from: f */
    public bold f133486f;

    /* renamed from: g */
    public bokx f133487g;

    static {
        bokz bokz = new bokz();
        f133479h = bokz;
        GeneratedMessageLite.m124024a(bokz.class, bokz);
    }

    private bokz() {
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
            return GeneratedMessageLite.m124022a(f133479h, "\u0001\u0006\u0000\u0001\u0006\u0010\u0006\u0000\u0001\u0000\u0006\u001b\u0007ဉ\u0002\bဉ\u0003\u000eဉ\u0000\u000fဉ\u0004\u0010ဉ\u0001", new Object[]{"a", "d", bokw.class, "e", "f", "b", "g", "c"});
        } else if (i2 == 3) {
            return new bokz();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f133479h;
            }
            bxxk bxxk = f133480i;
            if (bxxk == null) {
                synchronized (bokz.class) {
                    bxxk = f133480i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133479h);
                        f133480i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
