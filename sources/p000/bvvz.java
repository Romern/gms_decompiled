package p000;

/* renamed from: bvvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvz extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bvvz f157875h;

    /* renamed from: i */
    private static volatile bxxk f157876i;

    /* renamed from: a */
    public int f157877a;

    /* renamed from: b */
    public String f157878b = "";

    /* renamed from: c */
    public long f157879c;

    /* renamed from: d */
    public long f157880d;

    /* renamed from: e */
    public long f157881e;

    /* renamed from: f */
    public long f157882f;

    /* renamed from: g */
    public String f157883g = "";

    static {
        bvvz bvvz = new bvvz();
        f157875h = bvvz;
        bxvk.m124024a(bvvz.class, bvvz);
    }

    private bvvz() {
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
            return bxvk.m124022a(f157875h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bvvz();
        } else {
            if (i2 == 4) {
                return new bxvd(f157875h);
            }
            if (i2 == 5) {
                return f157875h;
            }
            bxxk bxxk = f157876i;
            if (bxxk == null) {
                synchronized (bvvz.class) {
                    bxxk = f157876i;
                    if (bxxk == null) {
                        bxxk = new bxve(f157875h);
                        f157876i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
