package p000;

/* renamed from: bycc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycc extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bycc f165628g;

    /* renamed from: h */
    private static volatile bxxk f165629h;

    /* renamed from: a */
    public int f165630a;

    /* renamed from: b */
    public String f165631b = "";

    /* renamed from: c */
    public String f165632c = "";

    /* renamed from: d */
    public int f165633d;

    /* renamed from: e */
    public int f165634e;

    /* renamed from: f */
    public String f165635f = "";

    static {
        bycc bycc = new bycc();
        f165628g = bycc;
        bxvk.m124024a(bycc.class, bycc);
    }

    private bycc() {
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
            return bxvk.m124022a(f165628g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bycc();
        } else {
            if (i2 == 4) {
                return new bxvd(f165628g);
            }
            if (i2 == 5) {
                return f165628g;
            }
            bxxk bxxk = f165629h;
            if (bxxk == null) {
                synchronized (bycc.class) {
                    bxxk = f165629h;
                    if (bxxk == null) {
                        bxxk = new bxve(f165628g);
                        f165629h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
