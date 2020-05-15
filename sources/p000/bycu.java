package p000;

/* renamed from: bycu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bycu extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bycu f165705k;

    /* renamed from: l */
    private static volatile bxxk f165706l;

    /* renamed from: a */
    public int f165707a;

    /* renamed from: b */
    public String f165708b = "";

    /* renamed from: c */
    public long f165709c;

    /* renamed from: d */
    public long f165710d;

    /* renamed from: e */
    public String f165711e = "";

    /* renamed from: f */
    public bycy f165712f;

    /* renamed from: g */
    public bxtx f165713g = bxtx.f164797b;

    /* renamed from: h */
    public int f165714h;

    /* renamed from: i */
    public String f165715i = "";

    /* renamed from: j */
    public bycw f165716j;

    static {
        bycu bycu = new bycu();
        f165705k = bycu;
        bxvk.m124024a(bycu.class, bycu);
    }

    private bycu() {
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
            return bxvk.m124022a(f165705k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ည\u0006\bင\u0007\tဈ\b\nဉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bycu();
        } else {
            if (i2 == 4) {
                return new bxvd(f165705k);
            }
            if (i2 == 5) {
                return f165705k;
            }
            bxxk bxxk = f165706l;
            if (bxxk == null) {
                synchronized (bycu.class) {
                    bxxk = f165706l;
                    if (bxxk == null) {
                        bxxk = new bxve(f165705k);
                        f165706l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
