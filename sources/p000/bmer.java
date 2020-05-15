package p000;

/* renamed from: bmer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmer extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmer f129000g;

    /* renamed from: h */
    private static volatile bxxk f129001h;

    /* renamed from: a */
    public int f129002a;

    /* renamed from: b */
    public bmfv f129003b;

    /* renamed from: c */
    public bmbs f129004c;

    /* renamed from: d */
    public String f129005d = "";

    /* renamed from: e */
    public String f129006e = "";

    /* renamed from: f */
    public bmkv f129007f;

    static {
        bmer bmer = new bmer();
        f129000g = bmer;
        bxvk.m124024a(bmer.class, bmer);
    }

    private bmer() {
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
            return bxvk.m124022a(f129000g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0004ဉ\u0001\u0005ဈ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", "d", "c", "e", "f"});
        } else if (i2 == 3) {
            return new bmer();
        } else {
            if (i2 == 4) {
                return new bxvd(f129000g);
            }
            if (i2 == 5) {
                return f129000g;
            }
            bxxk bxxk = f129001h;
            if (bxxk == null) {
                synchronized (bmer.class) {
                    bxxk = f129001h;
                    if (bxxk == null) {
                        bxxk = new bxve(f129000g);
                        f129001h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
