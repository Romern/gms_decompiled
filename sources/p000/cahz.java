package p000;

/* renamed from: cahz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahz extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cahz f174610h;

    /* renamed from: i */
    private static volatile bxxk f174611i;

    /* renamed from: a */
    public int f174612a;

    /* renamed from: b */
    public int f174613b;

    /* renamed from: c */
    public int f174614c;

    /* renamed from: d */
    public String f174615d = "";

    /* renamed from: e */
    public bxwc f174616e = bxxn.f165040b;

    /* renamed from: f */
    public int f174617f;

    /* renamed from: g */
    public int f174618g;

    static {
        cahz cahz = new cahz();
        f174610h = cahz;
        bxvk.m124024a(cahz.class, cahz);
    }

    private cahz() {
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
            return bxvk.m124022a(f174610h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0005\u001b\u0006ဌ\u0004\u0007င\u0005", new Object[]{"a", "b", bqzc.f142017a, "c", bqyn.f141966a, "d", "e", cahv.class, "f", cahx.f174609a, "g"});
        } else if (i2 == 3) {
            return new cahz();
        } else {
            if (i2 == 4) {
                return new cahw();
            }
            if (i2 == 5) {
                return f174610h;
            }
            bxxk bxxk = f174611i;
            if (bxxk == null) {
                synchronized (cahz.class) {
                    bxxk = f174611i;
                    if (bxxk == null) {
                        bxxk = new bxve(f174610h);
                        f174611i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
