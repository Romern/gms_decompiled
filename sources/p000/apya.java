package p000;

/* renamed from: apya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apya extends bxvk implements bxxd {

    /* renamed from: k */
    public static final apya f85097k;

    /* renamed from: l */
    private static volatile bxxk f85098l;

    /* renamed from: a */
    public int f85099a;

    /* renamed from: b */
    public bxtx f85100b = bxtx.f164797b;

    /* renamed from: c */
    public String f85101c = "";

    /* renamed from: d */
    public bxwc f85102d = bxxn.f165040b;

    /* renamed from: e */
    public bxtx f85103e = bxtx.f164797b;

    /* renamed from: f */
    public int f85104f;

    /* renamed from: g */
    public bxwc f85105g = bxxn.f165040b;

    /* renamed from: h */
    public apye f85106h;

    /* renamed from: i */
    public long f85107i;

    /* renamed from: j */
    public boolean f85108j;

    static {
        apya apya = new apya();
        f85097k = apya;
        bxvk.m124024a(apya.class, apya);
    }

    private apya() {
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
            return bxvk.m124022a(f85097k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003\u001c\u0004ည\u0002\u0005င\u0003\u0006\u001b\u0007ဉ\u0004\bဃ\u0005\tဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", apyf.class, "h", "i", "j"});
        } else if (i2 == 3) {
            return new apya();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f85097k;
            }
            bxxk bxxk = f85098l;
            if (bxxk == null) {
                synchronized (apya.class) {
                    bxxk = f85098l;
                    if (bxxk == null) {
                        bxxk = new bxve(f85097k);
                        f85098l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
