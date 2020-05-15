package p000;

/* renamed from: btfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btfn f148713d;

    /* renamed from: e */
    private static volatile bxxk f148714e;

    /* renamed from: a */
    public String f148715a = "";

    /* renamed from: b */
    public int f148716b;

    /* renamed from: c */
    public String f148717c = "";

    static {
        btfn btfn = new btfn();
        f148713d = btfn;
        bxvk.m124024a(btfn.class, btfn);
    }

    private btfn() {
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
            return bxvk.m124022a(f148713d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btfn();
        } else {
            if (i2 == 4) {
                return new bxvd(f148713d);
            }
            if (i2 == 5) {
                return f148713d;
            }
            bxxk bxxk = f148714e;
            if (bxxk == null) {
                synchronized (btfn.class) {
                    bxxk = f148714e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148713d);
                        f148714e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
