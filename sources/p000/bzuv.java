package p000;

/* renamed from: bzuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzuv extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bzuv f171471h;

    /* renamed from: i */
    private static volatile bxxk f171472i;

    /* renamed from: a */
    public String f171473a = "";

    /* renamed from: b */
    public bzth f171474b;

    /* renamed from: c */
    public String f171475c = "";

    /* renamed from: d */
    public String f171476d = "";

    /* renamed from: e */
    public String f171477e = "";

    /* renamed from: f */
    public bzti f171478f;

    /* renamed from: g */
    public boolean f171479g;

    static {
        bzuv bzuv = new bzuv();
        f171471h = bzuv;
        bxvk.m124024a(bzuv.class, bzuv);
    }

    private bzuv() {
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
            return bxvk.m124022a(f171471h, "\u0000\u0007\u0000\u0000\u0001\t\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003Ȉ\u0006Ȉ\u0007Ȉ\b\t\t\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bzuv();
        } else {
            if (i2 == 4) {
                return new bxvd(f171471h);
            }
            if (i2 == 5) {
                return f171471h;
            }
            bxxk bxxk = f171472i;
            if (bxxk == null) {
                synchronized (bzuv.class) {
                    bxxk = f171472i;
                    if (bxxk == null) {
                        bxxk = new bxve(f171471h);
                        f171472i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
