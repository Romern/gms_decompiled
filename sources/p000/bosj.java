package p000;

/* renamed from: bosj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bosj f134597c;

    /* renamed from: d */
    private static volatile bxxk f134598d;

    /* renamed from: a */
    public int f134599a;

    /* renamed from: b */
    public long f134600b;

    static {
        bosj bosj = new bosj();
        f134597c = bosj;
        GeneratedMessageLite.m124024a(bosj.class, bosj);
    }

    private bosj() {
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
            return GeneratedMessageLite.m124022a(f134597c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bosj();
        } else {
            if (i2 == 4) {
                return new bxvd(f134597c);
            }
            if (i2 == 5) {
                return f134597c;
            }
            bxxk bxxk = f134598d;
            if (bxxk == null) {
                synchronized (bosj.class) {
                    bxxk = f134598d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134597c);
                        f134598d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
