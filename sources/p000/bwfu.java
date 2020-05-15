package p000;

/* renamed from: bwfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwfu extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwfu f159137e;

    /* renamed from: f */
    private static volatile bxxk f159138f;

    /* renamed from: a */
    public int f159139a;

    /* renamed from: b */
    public int f159140b;

    /* renamed from: c */
    public String f159141c = "";

    /* renamed from: d */
    public bwft f159142d;

    static {
        bwfu bwfu = new bwfu();
        f159137e = bwfu;
        GeneratedMessageLite.m124024a(bwfu.class, bwfu);
    }

    private bwfu() {
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
            return GeneratedMessageLite.m124022a(f159137e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0002\u0003ဈ\u0001", new Object[]{"a", "b", bwfg.f159085a, "d", "c"});
        } else if (i2 == 3) {
            return new bwfu();
        } else {
            if (i2 == 4) {
                return new bxvd(f159137e);
            }
            if (i2 == 5) {
                return f159137e;
            }
            bxxk bxxk = f159138f;
            if (bxxk == null) {
                synchronized (bwfu.class) {
                    bxxk = f159138f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159137e);
                        f159138f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
