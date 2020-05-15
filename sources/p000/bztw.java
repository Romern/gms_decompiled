package p000;

/* renamed from: bztw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bztw f171377c;

    /* renamed from: d */
    private static volatile bxxk f171378d;

    /* renamed from: a */
    public String f171379a = "";

    /* renamed from: b */
    public int f171380b;

    static {
        bztw bztw = new bztw();
        f171377c = bztw;
        bxvk.m124024a(bztw.class, bztw);
    }

    private bztw() {
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
            return bxvk.m124022a(f171377c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bztw();
        } else {
            if (i2 == 4) {
                return new bxvd(f171377c);
            }
            if (i2 == 5) {
                return f171377c;
            }
            bxxk bxxk = f171378d;
            if (bxxk == null) {
                synchronized (bztw.class) {
                    bxxk = f171378d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171377c);
                        f171378d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
