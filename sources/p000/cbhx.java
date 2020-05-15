package p000;

/* renamed from: cbhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbhx f177210c;

    /* renamed from: d */
    private static volatile bxxk f177211d;

    /* renamed from: a */
    public cbhy f177212a;

    /* renamed from: b */
    public String f177213b = "";

    static {
        cbhx cbhx = new cbhx();
        f177210c = cbhx;
        bxvk.m124024a(cbhx.class, cbhx);
    }

    private cbhx() {
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
            return bxvk.m124022a(f177210c, "\u0000\u0002\u0000\u0000\u0006\u0007\u0002\u0000\u0000\u0000\u0006Ȉ\u0007\t", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new cbhx();
        } else {
            if (i2 == 4) {
                return new bxvd(f177210c);
            }
            if (i2 == 5) {
                return f177210c;
            }
            bxxk bxxk = f177211d;
            if (bxxk == null) {
                synchronized (cbhx.class) {
                    bxxk = f177211d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177210c);
                        f177211d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
