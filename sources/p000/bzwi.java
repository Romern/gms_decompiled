package p000;

/* renamed from: bzwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwi extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzwi f171625d;

    /* renamed from: e */
    private static volatile bxxk f171626e;

    /* renamed from: a */
    public int f171627a;

    /* renamed from: b */
    public bzwl f171628b;

    /* renamed from: c */
    public bzvu f171629c;

    static {
        bzwi bzwi = new bzwi();
        f171625d = bzwi;
        GeneratedMessageLite.m124024a(bzwi.class, bzwi);
    }

    private bzwi() {
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
            return GeneratedMessageLite.m124022a(f171625d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzwi();
        } else {
            if (i2 == 4) {
                return new bxvd(f171625d);
            }
            if (i2 == 5) {
                return f171625d;
            }
            bxxk bxxk = f171626e;
            if (bxxk == null) {
                synchronized (bzwi.class) {
                    bxxk = f171626e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171625d);
                        f171626e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
