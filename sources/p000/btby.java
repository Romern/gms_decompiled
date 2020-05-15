package p000;

/* renamed from: btby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btby extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btby f148232d;

    /* renamed from: f */
    private static volatile bxxk f148233f;

    /* renamed from: a */
    public bxwc f148234a = bxxn.f165040b;

    /* renamed from: b */
    public bxuw f148235b;

    /* renamed from: c */
    public btcz f148236c;

    /* renamed from: e */
    private byte f148237e = 2;

    static {
        btby btby = new btby();
        f148232d = btby;
        bxvk.m124024a(btby.class, btby);
    }

    private btby() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148237e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148237e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148232d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0002\t\u0004\t", new Object[]{"a", btbx.class, "b", "c"});
        } else if (i2 == 3) {
            return new btby();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f148232d;
            }
            bxxk bxxk = f148233f;
            if (bxxk == null) {
                synchronized (btby.class) {
                    bxxk = f148233f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148232d);
                        f148233f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
