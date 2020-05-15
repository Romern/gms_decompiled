package p000;

/* renamed from: bzkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzkf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzkf f170382d;

    /* renamed from: e */
    private static volatile bxxk f170383e;

    /* renamed from: a */
    public int f170384a;

    /* renamed from: b */
    public long f170385b;

    /* renamed from: c */
    public bxyk f170386c;

    static {
        bzkf bzkf = new bzkf();
        f170382d = bzkf;
        GeneratedMessageLite.m124024a(bzkf.class, bzkf);
    }

    private bzkf() {
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
            return GeneratedMessageLite.m124022a(f170382d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzkf();
        } else {
            if (i2 == 4) {
                return new bxvd(f170382d);
            }
            if (i2 == 5) {
                return f170382d;
            }
            bxxk bxxk = f170383e;
            if (bxxk == null) {
                synchronized (bzkf.class) {
                    bxxk = f170383e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170382d);
                        f170383e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
