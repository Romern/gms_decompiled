package p000;

/* renamed from: bzwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzwl f171643c;

    /* renamed from: e */
    private static volatile bxxk f171644e;

    /* renamed from: a */
    public boolean f171645a;

    /* renamed from: b */
    public bzwk f171646b;

    /* renamed from: d */
    private int f171647d;

    static {
        bzwl bzwl = new bzwl();
        f171643c = bzwl;
        GeneratedMessageLite.m124024a(bzwl.class, bzwl);
    }

    private bzwl() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f171643c, "\u0001\u0002\u0000\u0001\u0004\n\u0002\u0000\u0000\u0000\u0004ဇ\u0001\nဉ\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzwl();
        } else {
            if (i2 == 4) {
                return new bxvd(f171643c);
            }
            if (i2 == 5) {
                return f171643c;
            }
            bxxk bxxk = f171644e;
            if (bxxk == null) {
                synchronized (bzwl.class) {
                    bxxk = f171644e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171643c);
                        f171644e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
