package p000;

/* renamed from: bzom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzom extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzom f170834d;

    /* renamed from: e */
    private static volatile bxxk f170835e;

    /* renamed from: a */
    public bzoa f170836a;

    /* renamed from: b */
    public String f170837b = "";

    /* renamed from: c */
    public String f170838c = "";

    static {
        bzom bzom = new bzom();
        f170834d = bzom;
        bxvk.m124024a(bzom.class, bzom);
    }

    private bzom() {
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
            return bxvk.m124022a(f170834d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzom();
        } else {
            if (i2 == 4) {
                return new bxvd(f170834d);
            }
            if (i2 == 5) {
                return f170834d;
            }
            bxxk bxxk = f170835e;
            if (bxxk == null) {
                synchronized (bzom.class) {
                    bxxk = f170835e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170834d);
                        f170835e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
