package p000;

/* renamed from: bvyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvyv f158228f;

    /* renamed from: g */
    private static volatile bxxk f158229g;

    /* renamed from: a */
    public int f158230a;

    /* renamed from: b */
    public int f158231b;

    /* renamed from: c */
    public bvyw f158232c;

    /* renamed from: d */
    public bvys f158233d;

    /* renamed from: e */
    public bxwc f158234e = bxxn.f165040b;

    static {
        bvyv bvyv = new bvyv();
        f158228f = bvyv;
        bxvk.m124024a(bvyv.class, bvyv);
    }

    private bvyv() {
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
            return bxvk.m124022a(f158228f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"a", "b", bvyu.f158227a, "c", "d", "e", bvyt.class});
        } else if (i2 == 3) {
            return new bvyv();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f158228f;
            }
            bxxk bxxk = f158229g;
            if (bxxk == null) {
                synchronized (bvyv.class) {
                    bxxk = f158229g;
                    if (bxxk == null) {
                        bxxk = new bxve(f158228f);
                        f158229g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
