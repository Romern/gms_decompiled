package p000;

/* renamed from: bwwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwwh f161232e;

    /* renamed from: f */
    public static final bxvj f161233f;

    /* renamed from: h */
    private static volatile bxxk f161234h;

    /* renamed from: a */
    public int f161235a = 0;

    /* renamed from: b */
    public Object f161236b;

    /* renamed from: c */
    public int f161237c;

    /* renamed from: d */
    public int f161238d;

    /* renamed from: g */
    private int f161239g;

    static {
        bwwh bwwh = new bwwh();
        f161232e = bwwh;
        bxvk.m124024a(bwwh.class, bwwh);
        bwxl bwxl = bwxl.f161383i;
        bwwh bwwh2 = f161232e;
        f161233f = bxvk.m124006a(bwxl, bwwh2, bwwh2, 64497341, bxzf.MESSAGE);
    }

    private bwwh() {
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
            return bxvk.m124022a(f161232e, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0001\u0003ဌ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", "g", "d", bwwf.f161231a, "c", bwus.f161065a, bwwi.class, bwwe.class});
        } else if (i2 == 3) {
            return new bwwh();
        } else {
            if (i2 == 4) {
                return new bxvd(f161232e);
            }
            if (i2 == 5) {
                return f161232e;
            }
            bxxk bxxk = f161234h;
            if (bxxk == null) {
                synchronized (bwwh.class) {
                    bxxk = f161234h;
                    if (bxxk == null) {
                        bxxk = new bxve(f161232e);
                        f161234h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
