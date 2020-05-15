package p000;

/* renamed from: bxnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxnf f164025d;

    /* renamed from: f */
    private static volatile bxxk f164026f;

    /* renamed from: a */
    public int f164027a;

    /* renamed from: b */
    public int f164028b;

    /* renamed from: c */
    public bxvt f164029c = bxvm.f164965b;

    /* renamed from: e */
    private int f164030e;

    static {
        bxnf bxnf = new bxnf();
        f164025d = bxnf;
        GeneratedMessageLite.m124024a(bxnf.class, bxnf);
    }

    private bxnf() {
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
            return GeneratedMessageLite.m124022a(f164025d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002င\u0001\u0003င\u0002\u0004'", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bxnf();
        } else {
            if (i2 == 4) {
                return new bxvd(f164025d);
            }
            if (i2 == 5) {
                return f164025d;
            }
            bxxk bxxk = f164026f;
            if (bxxk == null) {
                synchronized (bxnf.class) {
                    bxxk = f164026f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164025d);
                        f164026f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
