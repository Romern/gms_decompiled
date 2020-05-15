package p000;

/* renamed from: bucu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bucu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bucu f153409d;

    /* renamed from: f */
    private static volatile bxxk f153410f;

    /* renamed from: a */
    public int f153411a = 0;

    /* renamed from: b */
    public Object f153412b;

    /* renamed from: c */
    public long f153413c;

    /* renamed from: e */
    private int f153414e;

    static {
        bucu bucu = new bucu();
        f153409d = bucu;
        bxvk.m124024a(bucu.class, bucu);
    }

    private bucu() {
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
            return bxvk.m124022a(f153409d, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", "e", "c", budf.class, bucy.class, budt.class, budq.class});
        } else if (i2 == 3) {
            return new bucu();
        } else {
            if (i2 == 4) {
                return new bxvd(f153409d);
            }
            if (i2 == 5) {
                return f153409d;
            }
            bxxk bxxk = f153410f;
            if (bxxk == null) {
                synchronized (bucu.class) {
                    bxxk = f153410f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153409d);
                        f153410f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
