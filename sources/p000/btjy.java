package p000;

/* renamed from: btjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btjy f149201d;

    /* renamed from: e */
    private static volatile bxxk f149202e;

    /* renamed from: a */
    public String f149203a = "";

    /* renamed from: b */
    public String f149204b = "";

    /* renamed from: c */
    public String f149205c = "";

    static {
        btjy btjy = new btjy();
        f149201d = btjy;
        bxvk.m124024a(btjy.class, btjy);
    }

    private btjy() {
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
            return bxvk.m124022a(f149201d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btjy();
        } else {
            if (i2 == 4) {
                return new bxvd(f149201d);
            }
            if (i2 == 5) {
                return f149201d;
            }
            bxxk bxxk = f149202e;
            if (bxxk == null) {
                synchronized (btjy.class) {
                    bxxk = f149202e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149201d);
                        f149202e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
