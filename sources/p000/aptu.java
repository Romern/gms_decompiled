package p000;

/* renamed from: aptu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final aptu f84877e;

    /* renamed from: g */
    private static volatile bxxk f84878g;

    /* renamed from: a */
    public bxwc f84879a = bxxn.f165040b;

    /* renamed from: b */
    public long f84880b;

    /* renamed from: c */
    public boolean f84881c;

    /* renamed from: d */
    public int f84882d;

    /* renamed from: f */
    private int f84883f;

    static {
        aptu aptu = new aptu();
        f84877e = aptu;
        bxvk.m124024a(aptu.class, aptu);
    }

    private aptu() {
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
            return bxvk.m124022a(f84877e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဇ\u0001\u0004င\u0002", new Object[]{"f", "a", aptt.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new aptu();
        } else {
            if (i2 == 4) {
                return new bxvd(f84877e);
            }
            if (i2 == 5) {
                return f84877e;
            }
            bxxk bxxk = f84878g;
            if (bxxk == null) {
                synchronized (aptu.class) {
                    bxxk = f84878g;
                    if (bxxk == null) {
                        bxxk = new bxve(f84877e);
                        f84878g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
