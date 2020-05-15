package p000;

/* renamed from: bvww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvww extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bvww f158020h;

    /* renamed from: i */
    private static volatile bxxk f158021i;

    /* renamed from: a */
    public int f158022a;

    /* renamed from: b */
    public String f158023b = "";

    /* renamed from: c */
    public String f158024c = "";

    /* renamed from: d */
    public String f158025d = "";

    /* renamed from: e */
    public bvwx f158026e;

    /* renamed from: f */
    public int f158027f;

    /* renamed from: g */
    public int f158028g;

    static {
        bvww bvww = new bvww();
        f158020h = bvww;
        bxvk.m124024a(bvww.class, bvww);
    }

    private bvww() {
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
            return bxvk.m124022a(f158020h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", bvwv.f158019a, "g", bvwu.f158018a});
        } else if (i2 == 3) {
            return new bvww();
        } else {
            if (i2 == 4) {
                return new bxvd(f158020h);
            }
            if (i2 == 5) {
                return f158020h;
            }
            bxxk bxxk = f158021i;
            if (bxxk == null) {
                synchronized (bvww.class) {
                    bxxk = f158021i;
                    if (bxxk == null) {
                        bxxk = new bxve(f158020h);
                        f158021i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
