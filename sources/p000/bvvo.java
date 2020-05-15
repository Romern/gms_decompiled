package p000;

/* renamed from: bvvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvo extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvvo f157820f;

    /* renamed from: g */
    private static volatile bxxk f157821g;

    /* renamed from: a */
    public int f157822a;

    /* renamed from: b */
    public int f157823b = 0;

    /* renamed from: c */
    public Object f157824c;

    /* renamed from: d */
    public int f157825d;

    /* renamed from: e */
    public String f157826e = "";

    static {
        bvvo bvvo = new bvvo();
        f157820f = bvvo;
        bxvk.m124024a(bvvo.class, bvvo);
    }

    private bvvo() {
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
            return bxvk.m124022a(f157820f, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003့\u0000\u0004ဵ\u0000\u0005ဴ\u0000\u0006ဳ\u0000\u0007ျ\u0000\b်\u0000", new Object[]{"c", "b", "a", "d", bvvn.f157819a, "e"});
        } else if (i2 == 3) {
            return new bvvo();
        } else {
            if (i2 == 4) {
                return new bxvd(f157820f);
            }
            if (i2 == 5) {
                return f157820f;
            }
            bxxk bxxk = f157821g;
            if (bxxk == null) {
                synchronized (bvvo.class) {
                    bxxk = f157821g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157820f);
                        f157821g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
