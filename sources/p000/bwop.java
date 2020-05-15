package p000;

/* renamed from: bwop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwop extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwop f160475d;

    /* renamed from: e */
    private static volatile bxxk f160476e;

    /* renamed from: a */
    public int f160477a;

    /* renamed from: b */
    public long f160478b;

    /* renamed from: c */
    public int f160479c;

    static {
        bwop bwop = new bwop();
        f160475d = bwop;
        GeneratedMessageLite.m124024a(bwop.class, bwop);
    }

    private bwop() {
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
            return GeneratedMessageLite.m124022a(f160475d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwop();
        } else {
            if (i2 == 4) {
                return new bxvd(f160475d);
            }
            if (i2 == 5) {
                return f160475d;
            }
            bxxk bxxk = f160476e;
            if (bxxk == null) {
                synchronized (bwop.class) {
                    bxxk = f160476e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160475d);
                        f160476e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
