package p000;

/* renamed from: bwpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwpy f160621c;

    /* renamed from: d */
    public static final bxvj f160622d;

    /* renamed from: e */
    private static volatile bxxk f160623e;

    /* renamed from: a */
    public int f160624a;

    /* renamed from: b */
    public String f160625b = "";

    static {
        bwpy bwpy = new bwpy();
        f160621c = bwpy;
        GeneratedMessageLite.m124024a(bwpy.class, bwpy);
        bwog bwog = bwog.f160437f;
        bwpy bwpy2 = f160621c;
        f160622d = GeneratedMessageLite.m124006a(bwog, bwpy2, bwpy2, 232348704, bxzf.MESSAGE);
    }

    private bwpy() {
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
            return GeneratedMessageLite.m124022a(f160621c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwpy();
        } else {
            if (i2 == 4) {
                return new bxvd(f160621c);
            }
            if (i2 == 5) {
                return f160621c;
            }
            bxxk bxxk = f160623e;
            if (bxxk == null) {
                synchronized (bwpy.class) {
                    bxxk = f160623e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160621c);
                        f160623e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
