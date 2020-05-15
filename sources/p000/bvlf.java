package p000;

/* renamed from: bvlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvlf f156524c;

    /* renamed from: e */
    private static volatile bxxk f156525e;

    /* renamed from: a */
    public bvow f156526a;

    /* renamed from: b */
    public bxwc f156527b = bxxn.f165040b;

    /* renamed from: d */
    private int f156528d;

    static {
        bvlf bvlf = new bvlf();
        f156524c = bvlf;
        GeneratedMessageLite.m124024a(bvlf.class, bvlf);
    }

    private bvlf() {
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
            return GeneratedMessageLite.m124022a(f156524c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bvld.class});
        } else if (i2 == 3) {
            return new bvlf();
        } else {
            if (i2 == 4) {
                return new bxvd(f156524c);
            }
            if (i2 == 5) {
                return f156524c;
            }
            bxxk bxxk = f156525e;
            if (bxxk == null) {
                synchronized (bvlf.class) {
                    bxxk = f156525e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156524c);
                        f156525e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
