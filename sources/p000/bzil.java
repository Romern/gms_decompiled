package p000;

/* renamed from: bzil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzil extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzil f170202f;

    /* renamed from: g */
    private static volatile bxxk f170203g;

    /* renamed from: a */
    public int f170204a;

    /* renamed from: b */
    public bziv f170205b;

    /* renamed from: c */
    public bzin f170206c;

    /* renamed from: d */
    public bzis f170207d;

    /* renamed from: e */
    public bziy f170208e;

    static {
        bzil bzil = new bzil();
        f170202f = bzil;
        bxvk.m124024a(bzil.class, bzil);
    }

    private bzil() {
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
            return bxvk.m124022a(f170202f, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzil();
        } else {
            if (i2 == 4) {
                return new bxvd(f170202f);
            }
            if (i2 == 5) {
                return f170202f;
            }
            bxxk bxxk = f170203g;
            if (bxxk == null) {
                synchronized (bzil.class) {
                    bxxk = f170203g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170202f);
                        f170203g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
