package p000;

/* renamed from: bxsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxsq f164721c;

    /* renamed from: d */
    private static volatile bxxk f164722d;

    /* renamed from: a */
    public int f164723a;

    /* renamed from: b */
    public String f164724b = "";

    static {
        bxsq bxsq = new bxsq();
        f164721c = bxsq;
        GeneratedMessageLite.m124024a(bxsq.class, bxsq);
    }

    private bxsq() {
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
            return GeneratedMessageLite.m124022a(f164721c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxsq();
        } else {
            if (i2 == 4) {
                return new bxvd(f164721c);
            }
            if (i2 == 5) {
                return f164721c;
            }
            bxxk bxxk = f164722d;
            if (bxxk == null) {
                synchronized (bxsq.class) {
                    bxxk = f164722d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164721c);
                        f164722d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
