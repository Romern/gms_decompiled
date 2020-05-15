package p000;

/* renamed from: bzya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzya extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzya f171830g;

    /* renamed from: h */
    private static volatile bxxk f171831h;

    /* renamed from: a */
    public long f171832a;

    /* renamed from: b */
    public String f171833b = "";

    /* renamed from: c */
    public long f171834c;

    /* renamed from: d */
    public String f171835d = "";

    /* renamed from: e */
    public String f171836e = "";

    /* renamed from: f */
    public String f171837f = "";

    static {
        bzya bzya = new bzya();
        f171830g = bzya;
        GeneratedMessageLite.m124024a(bzya.class, bzya);
    }

    private bzya() {
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
            return GeneratedMessageLite.m124022a(f171830g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzya();
        } else {
            if (i2 == 4) {
                return new bxvd(f171830g);
            }
            if (i2 == 5) {
                return f171830g;
            }
            bxxk bxxk = f171831h;
            if (bxxk == null) {
                synchronized (bzya.class) {
                    bxxk = f171831h;
                    if (bxxk == null) {
                        bxxk = new bxve(f171830g);
                        f171831h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
