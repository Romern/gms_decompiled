package p000;

/* renamed from: bvjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvjz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvjz f156370d;

    /* renamed from: e */
    private static volatile bxxk f156371e;

    /* renamed from: a */
    public String f156372a = "";

    /* renamed from: b */
    public int f156373b;

    /* renamed from: c */
    public String f156374c = "";

    static {
        bvjz bvjz = new bvjz();
        f156370d = bvjz;
        GeneratedMessageLite.m124024a(bvjz.class, bvjz);
    }

    private bvjz() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f156370d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvjz();
        } else {
            if (i2 == 4) {
                return new bxvd(f156370d);
            }
            if (i2 == 5) {
                return f156370d;
            }
            bxxk bxxk = f156371e;
            if (bxxk == null) {
                synchronized (bvjz.class) {
                    bxxk = f156371e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156370d);
                        f156371e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
