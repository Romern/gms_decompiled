package p000;

/* renamed from: bwfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwfp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwfp f159099c;

    /* renamed from: d */
    private static volatile bxxk f159100d;

    /* renamed from: a */
    public int f159101a;

    /* renamed from: b */
    public String f159102b = "";

    static {
        bwfp bwfp = new bwfp();
        f159099c = bwfp;
        GeneratedMessageLite.m124024a(bwfp.class, bwfp);
    }

    private bwfp() {
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
            return GeneratedMessageLite.m124022a(f159099c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwfp();
        } else {
            if (i2 == 4) {
                return new bxvd(f159099c);
            }
            if (i2 == 5) {
                return f159099c;
            }
            bxxk bxxk = f159100d;
            if (bxxk == null) {
                synchronized (bwfp.class) {
                    bxxk = f159100d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159099c);
                        f159100d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
