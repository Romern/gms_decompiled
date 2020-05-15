package p000;

/* renamed from: bqlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlo extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqlo f141126b;

    /* renamed from: c */
    private static volatile bxxk f141127c;

    /* renamed from: a */
    public bxwc f141128a = bxxn.f165040b;

    static {
        bqlo bqlo = new bqlo();
        f141126b = bqlo;
        GeneratedMessageLite.m124024a(bqlo.class, bqlo);
    }

    private bqlo() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f141126b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0000\u0004\u001b", new Object[]{"a", bqln.class});
        } else if (i2 == 3) {
            return new bqlo();
        } else {
            if (i2 == 4) {
                return new bxvd(f141126b);
            }
            if (i2 == 5) {
                return f141126b;
            }
            bxxk bxxk = f141127c;
            if (bxxk == null) {
                synchronized (bqlo.class) {
                    bxxk = f141127c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141126b);
                        f141127c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
