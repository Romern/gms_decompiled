package p000;

/* renamed from: bwny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwny extends bxvg implements bxvh {

    /* renamed from: k */
    public static final bwny f160414k;

    /* renamed from: n */
    private static volatile bxxk f160415n;

    /* renamed from: a */
    public int f160416a;

    /* renamed from: b */
    public bwog f160417b;

    /* renamed from: c */
    public boolean f160418c;

    /* renamed from: d */
    public String f160419d = "";

    /* renamed from: e */
    public bxwc f160420e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f160421f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f160422g = bxxn.f165040b;

    /* renamed from: h */
    public int f160423h;

    /* renamed from: i */
    public bwnx f160424i;

    /* renamed from: j */
    public bxwc f160425j = bxxn.f165040b;

    /* renamed from: l */
    private byte f160426l = 2;

    static {
        bwny bwny = new bwny();
        f160414k = bwny;
        bxvk.m124024a(bwny.class, bwny);
    }

    private bwny() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160426l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160426l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160414k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0004\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004Л\u0005Л\u0006Л\u0007င\u0003\bဉ\u0004\t\u001b", new Object[]{"a", "b", "c", "d", "e", bwou.class, "f", bwoi.class, "g", bwoq.class, "h", "i", "j", bxaz.class});
        } else if (i2 == 3) {
            return new bwny();
        } else {
            if (i2 == 4) {
                return new bxvf(f160414k);
            }
            if (i2 == 5) {
                return f160414k;
            }
            bxxk bxxk = f160415n;
            if (bxxk == null) {
                synchronized (bwny.class) {
                    bxxk = f160415n;
                    if (bxxk == null) {
                        bxxk = new bxve(f160414k);
                        f160415n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
