package p000;

/* renamed from: btic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btic extends bxvk implements bxxd {

    /* renamed from: j */
    public static final btic f148950j;

    /* renamed from: k */
    private static volatile bxxk f148951k;

    /* renamed from: a */
    public bxtx f148952a = bxtx.f164797b;

    /* renamed from: b */
    public btio f148953b;

    /* renamed from: c */
    public boolean f148954c;

    /* renamed from: d */
    public boolean f148955d;

    /* renamed from: e */
    public boolean f148956e;

    /* renamed from: f */
    public boolean f148957f;

    /* renamed from: g */
    public int f148958g;

    /* renamed from: h */
    public boolean f148959h;

    /* renamed from: i */
    public bxvt f148960i = bxvm.f164965b;

    static {
        btic btic = new btic();
        f148950j = btic;
        bxvk.m124024a(btic.class, btic);
    }

    private btic() {
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
            return bxvk.m124022a(f148950j, "\u0000\t\u0000\u0000\u0003\f\t\u0000\u0001\u0000\u0003\t\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\f\n\n\u000b\u0007\f'", new Object[]{"b", "c", "d", "e", "f", "g", "a", "h", "i"});
        } else if (i2 == 3) {
            return new btic();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f148950j;
            }
            bxxk bxxk = f148951k;
            if (bxxk == null) {
                synchronized (btic.class) {
                    bxxk = f148951k;
                    if (bxxk == null) {
                        bxxk = new bxve(f148950j);
                        f148951k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
