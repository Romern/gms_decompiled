package p000;

/* renamed from: bwhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhu extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bwhu f159567j;

    /* renamed from: k */
    private static volatile bxxk f159568k;

    /* renamed from: a */
    public int f159569a;

    /* renamed from: b */
    public bmnr f159570b;

    /* renamed from: c */
    public bmnr f159571c;

    /* renamed from: d */
    public bwhm f159572d;

    /* renamed from: e */
    public bxwc f159573e = bxxn.f165040b;

    /* renamed from: f */
    public String f159574f = "";

    /* renamed from: g */
    public bxwc f159575g = bxxn.f165040b;

    /* renamed from: h */
    public bwhm f159576h;

    /* renamed from: i */
    public bmjz f159577i;

    static {
        bwhu bwhu = new bwhu();
        f159567j = bwhu;
        GeneratedMessageLite.m124024a(bwhu.class, bwhu);
    }

    private bwhu() {
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
            return GeneratedMessageLite.m124022a(f159567j, "\u0001\b\u0000\u0001\u0002\r\b\u0000\u0002\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0004\u0005\u001b\u0007ဉ\u0006\nဉ\u0005\u000bဉ\u0003\r\u001b", new Object[]{"a", "b", "c", "f", "g", bmnr.class, "i", "h", "d", "e", bmnr.class});
        } else if (i2 == 3) {
            return new bwhu();
        } else {
            if (i2 == 4) {
                return new bxvd(f159567j);
            }
            if (i2 == 5) {
                return f159567j;
            }
            bxxk bxxk = f159568k;
            if (bxxk == null) {
                synchronized (bwhu.class) {
                    bxxk = f159568k;
                    if (bxxk == null) {
                        bxxk = new bxve(f159567j);
                        f159568k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
