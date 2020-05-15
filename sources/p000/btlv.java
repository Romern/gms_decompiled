package p000;

/* renamed from: btlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btlv f149435f;

    /* renamed from: g */
    private static volatile bxxk f149436g;

    /* renamed from: a */
    public int f149437a;

    /* renamed from: b */
    public int f149438b;

    /* renamed from: c */
    public String f149439c = "";

    /* renamed from: d */
    public String f149440d = "";

    /* renamed from: e */
    public boolean f149441e;

    static {
        btlv btlv = new btlv();
        f149435f = btlv;
        bxvk.m124024a(btlv.class, btlv);
    }

    private btlv() {
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
            return bxvk.m124022a(f149435f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0005\u0007", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btlv();
        } else {
            if (i2 == 4) {
                return new bxvd(f149435f);
            }
            if (i2 == 5) {
                return f149435f;
            }
            bxxk bxxk = f149436g;
            if (bxxk == null) {
                synchronized (btlv.class) {
                    bxxk = f149436g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149435f);
                        f149436g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
