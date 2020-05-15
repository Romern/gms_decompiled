package p000;

/* renamed from: lgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lgs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final lgs f26054d;

    /* renamed from: e */
    private static volatile bxxk f26055e;

    /* renamed from: a */
    public String f26056a = "";

    /* renamed from: b */
    public String f26057b = "";

    /* renamed from: c */
    public bxyk f26058c;

    static {
        lgs lgs = new lgs();
        f26054d = lgs;
        bxvk.m124024a(lgs.class, lgs);
    }

    private lgs() {
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
            return bxvk.m124022a(f26054d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new lgs();
        } else {
            if (i2 == 4) {
                return new bxvd(f26054d);
            }
            if (i2 == 5) {
                return f26054d;
            }
            bxxk bxxk = f26055e;
            if (bxxk == null) {
                synchronized (lgs.class) {
                    bxxk = f26055e;
                    if (bxxk == null) {
                        bxxk = new bxve(f26054d);
                        f26055e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
