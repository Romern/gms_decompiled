package p000;

/* renamed from: btqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btqv f150043b;

    /* renamed from: c */
    private static volatile bxxk f150044c;

    /* renamed from: a */
    public String f150045a = "";

    static {
        btqv btqv = new btqv();
        f150043b = btqv;
        bxvk.m124024a(btqv.class, btqv);
    }

    private btqv() {
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
            return bxvk.m124022a(f150043b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f150043b);
            }
            if (i2 == 5) {
                return f150043b;
            }
            bxxk bxxk = f150044c;
            if (bxxk == null) {
                synchronized (btqv.class) {
                    bxxk = f150044c;
                    if (bxxk == null) {
                        bxxk = new bxve(f150043b);
                        f150044c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
