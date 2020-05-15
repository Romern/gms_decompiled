package p000;

/* renamed from: bsjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjl extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bsjl f144810h;

    /* renamed from: j */
    private static volatile bxxk f144811j;

    /* renamed from: a */
    public int f144812a;

    /* renamed from: b */
    public int f144813b;

    /* renamed from: c */
    public long f144814c;

    /* renamed from: d */
    public String f144815d = "";

    /* renamed from: e */
    public boolean f144816e;

    /* renamed from: f */
    public int f144817f = 1;

    /* renamed from: g */
    public String f144818g = "";

    /* renamed from: i */
    private byte f144819i = 2;

    static {
        bsjl bsjl = new bsjl();
        f144810h = bsjl;
        bxvk.m124024a(bsjl.class, bsjl);
    }

    private bsjl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f144819i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f144819i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f144810h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔃ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0005\bင\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
        } else if (i2 == 3) {
            return new bsjl();
        } else {
            if (i2 == 4) {
                return new bxvd(f144810h);
            }
            if (i2 == 5) {
                return f144810h;
            }
            bxxk bxxk = f144811j;
            if (bxxk == null) {
                synchronized (bsjl.class) {
                    bxxk = f144811j;
                    if (bxxk == null) {
                        bxxk = new bxve(f144810h);
                        f144811j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
