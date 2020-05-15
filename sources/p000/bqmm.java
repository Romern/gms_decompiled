package p000;

/* renamed from: bqmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqmm f141233d;

    /* renamed from: e */
    private static volatile bxxk f141234e;

    /* renamed from: a */
    public int f141235a = 0;

    /* renamed from: b */
    public Object f141236b;

    /* renamed from: c */
    public String f141237c = "";

    static {
        bqmm bqmm = new bqmm();
        f141233d = bqmm;
        GeneratedMessageLite.m124024a(bqmm.class, bqmm);
    }

    private bqmm() {
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
            return GeneratedMessageLite.m124022a(f141233d, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003=\u0000\u0004<\u0000", new Object[]{"b", "a", "c", bqmn.class});
        } else if (i2 == 3) {
            return new bqmm();
        } else {
            if (i2 == 4) {
                return new bxvd(f141233d);
            }
            if (i2 == 5) {
                return f141233d;
            }
            bxxk bxxk = f141234e;
            if (bxxk == null) {
                synchronized (bqmm.class) {
                    bxxk = f141234e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141233d);
                        f141234e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
