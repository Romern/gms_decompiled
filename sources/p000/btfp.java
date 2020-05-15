package p000;

/* renamed from: btfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btfp f148731d;

    /* renamed from: e */
    private static volatile bxxk f148732e;

    /* renamed from: a */
    public String f148733a = "";

    /* renamed from: b */
    public int f148734b;

    /* renamed from: c */
    public String f148735c = "";

    static {
        btfp btfp = new btfp();
        f148731d = btfp;
        bxvk.m124024a(btfp.class, btfp);
    }

    private btfp() {
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
            return bxvk.m124022a(f148731d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btfp();
        } else {
            if (i2 == 4) {
                return new bxvd(f148731d);
            }
            if (i2 == 5) {
                return f148731d;
            }
            bxxk bxxk = f148732e;
            if (bxxk == null) {
                synchronized (btfp.class) {
                    bxxk = f148732e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148731d);
                        f148732e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
