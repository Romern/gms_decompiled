package p000;

/* renamed from: btbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btbc f148098f;

    /* renamed from: g */
    private static volatile bxxk f148099g;

    /* renamed from: a */
    public String f148100a = "";

    /* renamed from: b */
    public String f148101b = "";

    /* renamed from: c */
    public String f148102c = "";

    /* renamed from: d */
    public String f148103d = "";

    /* renamed from: e */
    public String f148104e = "";

    static {
        btbc btbc = new btbc();
        f148098f = btbc;
        bxvk.m124024a(btbc.class, btbc);
    }

    private btbc() {
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
            return bxvk.m124022a(f148098f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btbc();
        } else {
            if (i2 == 4) {
                return new bxvd(f148098f);
            }
            if (i2 == 5) {
                return f148098f;
            }
            bxxk bxxk = f148099g;
            if (bxxk == null) {
                synchronized (btbc.class) {
                    bxxk = f148099g;
                    if (bxxk == null) {
                        bxxk = new bxve(f148098f);
                        f148099g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
