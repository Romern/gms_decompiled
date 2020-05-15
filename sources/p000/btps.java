package p000;

/* renamed from: btps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btps extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btps f149882e;

    /* renamed from: f */
    private static volatile bxxk f149883f;

    /* renamed from: a */
    public String f149884a = "";

    /* renamed from: b */
    public String f149885b = "";

    /* renamed from: c */
    public String f149886c = "";

    /* renamed from: d */
    public int f149887d;

    static {
        btps btps = new btps();
        f149882e = btps;
        bxvk.m124024a(btps.class, btps);
    }

    private btps() {
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
            return bxvk.m124022a(f149882e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btps();
        } else {
            if (i2 == 4) {
                return new bxvd(f149882e);
            }
            if (i2 == 5) {
                return f149882e;
            }
            bxxk bxxk = f149883f;
            if (bxxk == null) {
                synchronized (btps.class) {
                    bxxk = f149883f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149882e);
                        f149883f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
