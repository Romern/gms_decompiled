package p000;

/* renamed from: bolp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bolp extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bolp f133560h;

    /* renamed from: i */
    private static volatile bxxk f133561i;

    /* renamed from: a */
    public int f133562a;

    /* renamed from: b */
    public int f133563b;

    /* renamed from: c */
    public int f133564c;

    /* renamed from: d */
    public long f133565d;

    /* renamed from: e */
    public long f133566e;

    /* renamed from: f */
    public long f133567f;

    /* renamed from: g */
    public long f133568g;

    static {
        bolp bolp = new bolp();
        f133560h = bolp;
        bxvk.m124024a(bolp.class, bolp);
    }

    private bolp() {
        bxxn bxxn = bxxn.f165040b;
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f133560h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0006ဂ\u0003\u0007ဂ\u0004\bဂ\u0005\tဂ\u0006", new Object[]{"a", "b", bolo.f133559a, "c", boln.f133558a, "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bolp();
        } else {
            if (i2 == 4) {
                return new bxvd(f133560h);
            }
            if (i2 == 5) {
                return f133560h;
            }
            bxxk bxxk = f133561i;
            if (bxxk == null) {
                synchronized (bolp.class) {
                    bxxk = f133561i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133560h);
                        f133561i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
