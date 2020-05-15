package p000;

/* renamed from: dmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final dmc f13490d;

    /* renamed from: e */
    private static volatile bxxk f13491e;

    /* renamed from: a */
    public int f13492a;

    /* renamed from: b */
    public String f13493b = "";

    /* renamed from: c */
    public int f13494c;

    static {
        dmc dmc = new dmc();
        f13490d = dmc;
        bxvk.m124024a(dmc.class, dmc);
    }

    private dmc() {
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
            return bxvk.m124022a(f13490d, "\u0001\u0002\u0000\u0001\u0001\n\u0002\u0000\u0000\u0000\u0001ဈ\u0000\nင\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new dmc();
        } else {
            if (i2 == 4) {
                return new bxvd(f13490d);
            }
            if (i2 == 5) {
                return f13490d;
            }
            bxxk bxxk = f13491e;
            if (bxxk == null) {
                synchronized (dmc.class) {
                    bxxk = f13491e;
                    if (bxxk == null) {
                        bxxk = new bxve(f13490d);
                        f13491e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
