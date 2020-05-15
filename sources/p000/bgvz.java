package p000;

/* renamed from: bgvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvz extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bgvz f117769m;

    /* renamed from: n */
    private static volatile bxxk f117770n;

    /* renamed from: a */
    public int f117771a;

    /* renamed from: b */
    public long f117772b;

    /* renamed from: c */
    public int f117773c;

    /* renamed from: d */
    public int f117774d;

    /* renamed from: e */
    public boolean f117775e;

    /* renamed from: f */
    public int f117776f;

    /* renamed from: g */
    public int f117777g;

    /* renamed from: h */
    public int f117778h;

    /* renamed from: i */
    public int f117779i;

    /* renamed from: j */
    public int f117780j;

    /* renamed from: k */
    public int f117781k;

    /* renamed from: l */
    public String f117782l = "";

    static {
        bgvz bgvz = new bgvz();
        f117769m = bgvz;
        bxvk.m124024a(bgvz.class, bgvz);
    }

    private bgvz() {
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
            return bxvk.m124022a(f117769m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဏ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဈ\n", new Object[]{"a", "b", "c", "d", bgvx.f117768a, "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bgvz();
        } else {
            if (i2 == 4) {
                return new bxvd(f117769m);
            }
            if (i2 == 5) {
                return f117769m;
            }
            bxxk bxxk = f117770n;
            if (bxxk == null) {
                synchronized (bgvz.class) {
                    bxxk = f117770n;
                    if (bxxk == null) {
                        bxxk = new bxve(f117769m);
                        f117770n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
