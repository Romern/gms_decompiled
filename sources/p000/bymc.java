package p000;

/* renamed from: bymc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bymc f166997e;

    /* renamed from: g */
    private static volatile bxxk f166998g;

    /* renamed from: a */
    public int f166999a;

    /* renamed from: b */
    public bylp f167000b;

    /* renamed from: c */
    public String f167001c;

    /* renamed from: d */
    public bxwc f167002d;

    /* renamed from: f */
    private byte f167003f = 2;

    static {
        bymc bymc = new bymc();
        f166997e = bymc;
        bxvk.m124024a(bymc.class, bymc);
    }

    private bymc() {
        bxxn bxxn = bxxn.f165040b;
        this.f167001c = "";
        this.f167002d = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167003f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167003f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166997e, "\u0001\u0003\u0000\u0001\u0004\b\u0003\u0000\u0001\u0001\u0004ᐉ\u0002\u0006ဈ\u0004\b\u001b", new Object[]{"a", "b", "c", "d", bylo.class});
        } else if (i2 == 3) {
            return new bymc();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f166997e;
            }
            bxxk bxxk = f166998g;
            if (bxxk == null) {
                synchronized (bymc.class) {
                    bxxk = f166998g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166997e);
                        f166998g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
