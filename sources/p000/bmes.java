package p000;

/* renamed from: bmes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmes extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmes f129008g;

    /* renamed from: i */
    private static volatile bxxk f129009i;

    /* renamed from: a */
    public long f129010a;

    /* renamed from: b */
    public String f129011b = "";

    /* renamed from: c */
    public bxwc f129012c = bxxn.f165040b;

    /* renamed from: d */
    public long f129013d;

    /* renamed from: e */
    public bxtx f129014e = bxtx.f164797b;

    /* renamed from: f */
    public boolean f129015f;

    /* renamed from: h */
    private int f129016h;

    static {
        bmes bmes = new bmes();
        f129008g = bmes;
        bxvk.m124024a(bmes.class, bmes);
    }

    private bmes() {
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
            return bxvk.m124022a(f129008g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\u0000\u0005ဂ\u0003\u0006ည\u0004\u0007ဇ\u0005", new Object[]{"h", "b", "c", bmnr.class, "a", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bmes();
        } else {
            if (i2 == 4) {
                return new bxvd(f129008g);
            }
            if (i2 == 5) {
                return f129008g;
            }
            bxxk bxxk = f129009i;
            if (bxxk == null) {
                synchronized (bmes.class) {
                    bxxk = f129009i;
                    if (bxxk == null) {
                        bxxk = new bxve(f129008g);
                        f129009i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
