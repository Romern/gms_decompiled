package p000;

/* renamed from: bopb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopb extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bopb f134091f;

    /* renamed from: g */
    private static volatile bxxk f134092g;

    /* renamed from: a */
    public String f134093a = "";

    /* renamed from: b */
    public String f134094b = "";

    /* renamed from: c */
    public String f134095c = "";

    /* renamed from: d */
    public String f134096d = "";

    /* renamed from: e */
    public long f134097e;

    static {
        bopb bopb = new bopb();
        f134091f = bopb;
        bxvk.m124024a(bopb.class, bopb);
    }

    private bopb() {
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
            return bxvk.m124022a(f134091f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bopb();
        } else {
            if (i2 == 4) {
                return new bxvd(f134091f);
            }
            if (i2 == 5) {
                return f134091f;
            }
            bxxk bxxk = f134092g;
            if (bxxk == null) {
                synchronized (bopb.class) {
                    bxxk = f134092g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134091f);
                        f134092g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
