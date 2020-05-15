package p000;

/* renamed from: bomg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bomg f133646g;

    /* renamed from: i */
    private static volatile bxxk f133647i;

    /* renamed from: a */
    public int f133648a;

    /* renamed from: b */
    public bomj f133649b;

    /* renamed from: c */
    public int f133650c;

    /* renamed from: d */
    public bomj f133651d;

    /* renamed from: e */
    public long f133652e;

    /* renamed from: f */
    public boolean f133653f;

    /* renamed from: h */
    private byte f133654h = 2;

    static {
        bomg bomg = new bomg();
        f133646g = bomg;
        bxvk.m124024a(bomg.class, bomg);
    }

    private bomg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f133654h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f133654h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f133646g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", bomf.f133645a, "d", "e", "f"});
        } else if (i2 == 3) {
            return new bomg();
        } else {
            if (i2 == 4) {
                return new bxvd(f133646g);
            }
            if (i2 == 5) {
                return f133646g;
            }
            bxxk bxxk = f133647i;
            if (bxxk == null) {
                synchronized (bomg.class) {
                    bxxk = f133647i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133646g);
                        f133647i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
