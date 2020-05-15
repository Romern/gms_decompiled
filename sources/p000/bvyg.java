package p000;

/* renamed from: bvyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bvyg f158152g;

    /* renamed from: i */
    private static volatile bxxk f158153i;

    /* renamed from: a */
    public int f158154a;

    /* renamed from: b */
    public boolean f158155b;

    /* renamed from: c */
    public boolean f158156c;

    /* renamed from: d */
    public String f158157d = "";

    /* renamed from: e */
    public long f158158e;

    /* renamed from: f */
    public long f158159f;

    /* renamed from: h */
    private int f158160h;

    static {
        bvyg bvyg = new bvyg();
        f158152g = bvyg;
        bxvk.m124024a(bvyg.class, bvyg);
    }

    private bvyg() {
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
            return bxvk.m124022a(f158152g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bvyg();
        } else {
            if (i2 == 4) {
                return new bxvd(f158152g);
            }
            if (i2 == 5) {
                return f158152g;
            }
            bxxk bxxk = f158153i;
            if (bxxk == null) {
                synchronized (bvyg.class) {
                    bxxk = f158153i;
                    if (bxxk == null) {
                        bxxk = new bxve(f158152g);
                        f158153i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
