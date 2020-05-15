package p000;

/* renamed from: bwqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqd extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bwqd f160640f;

    /* renamed from: g */
    public static final bxvj f160641g;

    /* renamed from: h */
    private static volatile bxxk f160642h;

    /* renamed from: a */
    public int f160643a;

    /* renamed from: b */
    public int f160644b;

    /* renamed from: c */
    public String f160645c = "";

    /* renamed from: d */
    public blxc f160646d;

    /* renamed from: e */
    public String f160647e = "";

    static {
        bwqd bwqd = new bwqd();
        f160640f = bwqd;
        bxvk.m124024a(bwqd.class, bwqd);
        bwog bwog = bwog.f160437f;
        bwqd bwqd2 = f160640f;
        f160641g = bxvk.m124006a(bwog, bwqd2, bwqd2, 275110909, bxzf.MESSAGE);
    }

    private bwqd() {
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
            return bxvk.m124022a(f160640f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", bwqa.f160635a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwqd();
        } else {
            if (i2 == 4) {
                return new bxvd(f160640f);
            }
            if (i2 == 5) {
                return f160640f;
            }
            bxxk bxxk = f160642h;
            if (bxxk == null) {
                synchronized (bwqd.class) {
                    bxxk = f160642h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160640f);
                        f160642h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
