package p000;

/* renamed from: biqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final biqd f121254e;

    /* renamed from: f */
    private static volatile bxxk f121255f;

    /* renamed from: a */
    public int f121256a;

    /* renamed from: b */
    public int f121257b;

    /* renamed from: c */
    public int f121258c;

    /* renamed from: d */
    public int f121259d;

    static {
        biqd biqd = new biqd();
        f121254e = biqd;
        GeneratedMessageLite.m124024a(biqd.class, biqd);
    }

    private biqd() {
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
            return GeneratedMessageLite.m124022a(f121254e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new biqd();
        } else {
            if (i2 == 4) {
                return new bxvd(f121254e);
            }
            if (i2 == 5) {
                return f121254e;
            }
            bxxk bxxk = f121255f;
            if (bxxk == null) {
                synchronized (biqd.class) {
                    bxxk = f121255f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121254e);
                        f121255f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
