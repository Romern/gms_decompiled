package p000;

/* renamed from: bwxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwxy f161427d;

    /* renamed from: e */
    private static volatile bxxk f161428e;

    /* renamed from: a */
    public int f161429a;

    /* renamed from: b */
    public int f161430b;

    /* renamed from: c */
    public bwya f161431c;

    static {
        bwxy bwxy = new bwxy();
        f161427d = bwxy;
        GeneratedMessageLite.m124024a(bwxy.class, bwxy);
    }

    private bwxy() {
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
            return GeneratedMessageLite.m124022a(f161427d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bwxw.f161426a, "c"});
        } else if (i2 == 3) {
            return new bwxy();
        } else {
            if (i2 == 4) {
                return new bxvd(f161427d);
            }
            if (i2 == 5) {
                return f161427d;
            }
            bxxk bxxk = f161428e;
            if (bxxk == null) {
                synchronized (bwxy.class) {
                    bxxk = f161428e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161427d);
                        f161428e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
