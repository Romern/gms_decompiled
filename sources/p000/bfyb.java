package p000;

/* renamed from: bfyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfyb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bfyb f115648c;

    /* renamed from: d */
    private static volatile bxxk f115649d;

    /* renamed from: a */
    public String f115650a = "";

    /* renamed from: b */
    public boolean f115651b;

    static {
        bfyb bfyb = new bfyb();
        f115648c = bfyb;
        bxvk.m124024a(bfyb.class, bfyb);
    }

    private bfyb() {
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
            return bxvk.m124022a(f115648c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bfyb();
        } else {
            if (i2 == 4) {
                return new bxvd(f115648c);
            }
            if (i2 == 5) {
                return f115648c;
            }
            bxxk bxxk = f115649d;
            if (bxxk == null) {
                synchronized (bfyb.class) {
                    bxxk = f115649d;
                    if (bxxk == null) {
                        bxxk = new bxve(f115648c);
                        f115649d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
