package p000;

/* renamed from: cbgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbgw f177095a;

    /* renamed from: b */
    private static volatile bxxk f177096b;

    static {
        cbgw cbgw = new cbgw();
        f177095a = cbgw;
        bxvk.m124024a(cbgw.class, cbgw);
    }

    private cbgw() {
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
            return bxvk.m124022a(f177095a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbgw();
        }
        if (i2 == 4) {
            return new bxvd(f177095a);
        }
        if (i2 == 5) {
            return f177095a;
        }
        bxxk bxxk = f177096b;
        if (bxxk == null) {
            synchronized (cbgw.class) {
                bxxk = f177096b;
                if (bxxk == null) {
                    bxxk = new bxve(f177095a);
                    f177096b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
