package p000;

/* renamed from: bwjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwjr f159857f;

    /* renamed from: g */
    private static volatile bxxk f159858g;

    /* renamed from: a */
    public int f159859a;

    /* renamed from: b */
    public bmaq f159860b;

    /* renamed from: c */
    public bmav f159861c;

    /* renamed from: d */
    public bmar f159862d;

    /* renamed from: e */
    public bwjs f159863e;

    static {
        bwjr bwjr = new bwjr();
        f159857f = bwjr;
        GeneratedMessageLite.m124024a(bwjr.class, bwjr);
    }

    private bwjr() {
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
            return GeneratedMessageLite.m124022a(f159857f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new bwjr();
        } else {
            if (i2 == 4) {
                return new bxvd(f159857f);
            }
            if (i2 == 5) {
                return f159857f;
            }
            bxxk bxxk = f159858g;
            if (bxxk == null) {
                synchronized (bwjr.class) {
                    bxxk = f159858g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159857f);
                        f159858g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
