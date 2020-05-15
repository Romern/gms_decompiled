package p000;

/* renamed from: bzuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzuu f171466d;

    /* renamed from: e */
    private static volatile bxxk f171467e;

    /* renamed from: a */
    public bzuv f171468a;

    /* renamed from: b */
    public String f171469b = "";

    /* renamed from: c */
    public String f171470c = "";

    static {
        bzuu bzuu = new bzuu();
        f171466d = bzuu;
        GeneratedMessageLite.m124024a(bzuu.class, bzuu);
    }

    private bzuu() {
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
            return GeneratedMessageLite.m124022a(f171466d, "\u0000\u0003\u0000\u0000\u0004\u0006\u0003\u0000\u0000\u0000\u0004Ȉ\u0005Ȉ\u0006\t", new Object[]{"b", "c", "a"});
        } else if (i2 == 3) {
            return new bzuu();
        } else {
            if (i2 == 4) {
                return new bxvd(f171466d);
            }
            if (i2 == 5) {
                return f171466d;
            }
            bxxk bxxk = f171467e;
            if (bxxk == null) {
                synchronized (bzuu.class) {
                    bxxk = f171467e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171466d);
                        f171467e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
