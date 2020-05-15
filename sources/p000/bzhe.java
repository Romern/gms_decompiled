package p000;

/* renamed from: bzhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhe extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bzhe f170031k;

    /* renamed from: l */
    private static volatile bxxk f170032l;

    /* renamed from: a */
    public bxwc f170033a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f170034b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f170035c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f170036d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f170037e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f170038f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f170039g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f170040h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f170041i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f170042j = bxxn.f165040b;

    static {
        bzhe bzhe = new bzhe();
        f170031k = bzhe;
        bxvk.m124024a(bzhe.class, bzhe);
    }

    private bzhe() {
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
            return bxvk.m124022a(f170031k, "\u0001\n\u0000\u0000\u0005\u0011\n\u0000\n\u0000\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\u000b\u001b\f\u001b\u000e\u001b\u000f\u001b\u0010\u001b\u0011\u001b", new Object[]{"a", bzgv.class, "b", bzhb.class, "c", bzgx.class, "d", bzgy.class, "e", bzgu.class, "f", bzgw.class, "g", bzha.class, "h", bzgz.class, "i", bzhd.class, "j", bzhc.class});
        } else if (i2 == 3) {
            return new bzhe();
        } else {
            if (i2 == 4) {
                return new bxvd(f170031k);
            }
            if (i2 == 5) {
                return f170031k;
            }
            bxxk bxxk = f170032l;
            if (bxxk == null) {
                synchronized (bzhe.class) {
                    bxxk = f170032l;
                    if (bxxk == null) {
                        bxxk = new bxve(f170031k);
                        f170032l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
