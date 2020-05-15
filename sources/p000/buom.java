package p000;

/* renamed from: buom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buom extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buom f154548d;

    /* renamed from: e */
    private static volatile bxxk f154549e;

    /* renamed from: a */
    public String f154550a = "";

    /* renamed from: b */
    public buov f154551b;

    /* renamed from: c */
    public buoi f154552c;

    static {
        buom buom = new buom();
        f154548d = buom;
        bxvk.m124024a(buom.class, buom);
    }

    private buom() {
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
            return bxvk.m124022a(f154548d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buom();
        } else {
            if (i2 == 4) {
                return new bxvd(f154548d);
            }
            if (i2 == 5) {
                return f154548d;
            }
            bxxk bxxk = f154549e;
            if (bxxk == null) {
                synchronized (buom.class) {
                    bxxk = f154549e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154548d);
                        f154549e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
