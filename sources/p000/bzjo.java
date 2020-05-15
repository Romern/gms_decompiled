package p000;

/* renamed from: bzjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzjo f170318e;

    /* renamed from: f */
    private static volatile bxxk f170319f;

    /* renamed from: a */
    public int f170320a;

    /* renamed from: b */
    public bzjn f170321b;

    /* renamed from: c */
    public bxwc f170322c = bxxn.f165040b;

    /* renamed from: d */
    public int f170323d;

    static {
        bzjo bzjo = new bzjo();
        f170318e = bzjo;
        GeneratedMessageLite.m124024a(bzjo.class, bzjo);
    }

    private bzjo() {
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
            return GeneratedMessageLite.m124022a(f170318e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0004င\u0002", new Object[]{"a", "b", "c", bzjn.class, "d"});
        } else if (i2 == 3) {
            return new bzjo();
        } else {
            if (i2 == 4) {
                return new bxvd(f170318e);
            }
            if (i2 == 5) {
                return f170318e;
            }
            bxxk bxxk = f170319f;
            if (bxxk == null) {
                synchronized (bzjo.class) {
                    bxxk = f170319f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170318e);
                        f170319f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
