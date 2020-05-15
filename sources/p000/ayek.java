package p000;

/* renamed from: ayek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayek extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ayek f97315e;

    /* renamed from: f */
    private static volatile bxxk f97316f;

    /* renamed from: a */
    public int f97317a;

    /* renamed from: b */
    public long f97318b;

    /* renamed from: c */
    public boolean f97319c;

    /* renamed from: d */
    public long f97320d;

    static {
        ayek ayek = new ayek();
        f97315e = ayek;
        bxvk.m124024a(ayek.class, ayek);
    }

    private ayek() {
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
            return bxvk.m124022a(f97315e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001စ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new ayek();
        } else {
            if (i2 == 4) {
                return new bxvd(f97315e);
            }
            if (i2 == 5) {
                return f97315e;
            }
            bxxk bxxk = f97316f;
            if (bxxk == null) {
                synchronized (ayek.class) {
                    bxxk = f97316f;
                    if (bxxk == null) {
                        bxxk = new bxve(f97315e);
                        f97316f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
