package p000;

/* renamed from: bwtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwtf f160949b;

    /* renamed from: c */
    public static final bxvj f160950c;

    /* renamed from: e */
    private static volatile bxxk f160951e;

    /* renamed from: a */
    public bwtg f160952a;

    /* renamed from: d */
    private int f160953d;

    static {
        bwtf bwtf = new bwtf();
        f160949b = bwtf;
        GeneratedMessageLite.m124024a(bwtf.class, bwtf);
        bwxl bwxl = bwxl.f161383i;
        bwtf bwtf2 = f160949b;
        f160950c = GeneratedMessageLite.m124006a(bwxl, bwtf2, bwtf2, 213678542, bxzf.MESSAGE);
    }

    private bwtf() {
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
            return GeneratedMessageLite.m124022a(f160949b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
        } else if (i2 == 3) {
            return new bwtf();
        } else {
            if (i2 == 4) {
                return new bxvd(f160949b);
            }
            if (i2 == 5) {
                return f160949b;
            }
            bxxk bxxk = f160951e;
            if (bxxk == null) {
                synchronized (bwtf.class) {
                    bxxk = f160951e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160949b);
                        f160951e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
