package p000;

/* renamed from: bpyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpyy f139961d;

    /* renamed from: e */
    private static volatile bxxk f139962e;

    /* renamed from: a */
    public int f139963a;

    /* renamed from: b */
    public bpyz f139964b;

    /* renamed from: c */
    public long f139965c;

    static {
        bpyy bpyy = new bpyy();
        f139961d = bpyy;
        GeneratedMessageLite.m124024a(bpyy.class, bpyy);
    }

    private bpyy() {
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
            return GeneratedMessageLite.m124022a(f139961d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpyy();
        } else {
            if (i2 == 4) {
                return new bxvd(f139961d);
            }
            if (i2 == 5) {
                return f139961d;
            }
            bxxk bxxk = f139962e;
            if (bxxk == null) {
                synchronized (bpyy.class) {
                    bxxk = f139962e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139961d);
                        f139962e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
