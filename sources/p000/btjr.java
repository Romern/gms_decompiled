package p000;

/* renamed from: btjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjr extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btjr f149168f;

    /* renamed from: g */
    private static volatile bxxk f149169g;

    /* renamed from: a */
    public btiy f149170a;

    /* renamed from: b */
    public bxtx f149171b = bxtx.f164797b;

    /* renamed from: c */
    public btjw f149172c;

    /* renamed from: d */
    public String f149173d = "";

    /* renamed from: e */
    public int f149174e;

    static {
        btjr btjr = new btjr();
        f149168f = btjr;
        bxvk.m124024a(btjr.class, btjr);
    }

    private btjr() {
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
            return bxvk.m124022a(f149168f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\n\u0003\t\u0004Ȉ\u0005\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btjr();
        } else {
            if (i2 == 4) {
                return new bxvd(f149168f);
            }
            if (i2 == 5) {
                return f149168f;
            }
            bxxk bxxk = f149169g;
            if (bxxk == null) {
                synchronized (btjr.class) {
                    bxxk = f149169g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149168f);
                        f149169g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
