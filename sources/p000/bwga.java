package p000;

/* renamed from: bwga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwga extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bwga f159162f;

    /* renamed from: g */
    private static volatile bxxk f159163g;

    /* renamed from: a */
    public int f159164a;

    /* renamed from: b */
    public String f159165b = "";

    /* renamed from: c */
    public boolean f159166c;

    /* renamed from: d */
    public int f159167d;

    /* renamed from: e */
    public String f159168e = "";

    static {
        bwga bwga = new bwga();
        f159162f = bwga;
        bxvk.m124024a(bwga.class, bwga);
    }

    private bwga() {
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
            return bxvk.m124022a(f159162f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwga();
        } else {
            if (i2 == 4) {
                return new bxvd(f159162f);
            }
            if (i2 == 5) {
                return f159162f;
            }
            bxxk bxxk = f159163g;
            if (bxxk == null) {
                synchronized (bwga.class) {
                    bxxk = f159163g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159162f);
                        f159163g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
