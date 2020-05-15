package p000;

/* renamed from: bvso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvso extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvso f157508f;

    /* renamed from: g */
    private static volatile bxxk f157509g;

    /* renamed from: a */
    public int f157510a;

    /* renamed from: b */
    public int f157511b = 0;

    /* renamed from: c */
    public Object f157512c;

    /* renamed from: d */
    public int f157513d;

    /* renamed from: e */
    public long f157514e;

    static {
        bvso bvso = new bvso();
        f157508f = bvso;
        bxvk.m124024a(bvso.class, bvso);
    }

    private bvso() {
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
            return bxvk.m124022a(f157508f, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ြ\u0000", new Object[]{"c", "b", "a", "d", bvzi.f158292a, "e", bvsn.class});
        } else if (i2 == 3) {
            return new bvso();
        } else {
            if (i2 == 4) {
                return new bxvd(f157508f);
            }
            if (i2 == 5) {
                return f157508f;
            }
            bxxk bxxk = f157509g;
            if (bxxk == null) {
                synchronized (bvso.class) {
                    bxxk = f157509g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157508f);
                        f157509g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
