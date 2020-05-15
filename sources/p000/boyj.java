package p000;

/* renamed from: boyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boyj extends bxvk implements bxxd {

    /* renamed from: i */
    public static final boyj f135319i;

    /* renamed from: j */
    private static volatile bxxk f135320j;

    /* renamed from: a */
    public int f135321a;

    /* renamed from: b */
    public int f135322b;

    /* renamed from: c */
    public int f135323c;

    /* renamed from: d */
    public int f135324d;

    /* renamed from: e */
    public bxwc f135325e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f135326f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f135327g = bxxn.f165040b;

    /* renamed from: h */
    public long f135328h;

    static {
        boyj boyj = new boyj();
        f135319i = boyj;
        bxvk.m124024a(boyj.class, boyj);
    }

    private boyj() {
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
            return bxvk.m124022a(f135319i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004\u001a\u0005\u001a\u0006\u001a\u0007ဂ\u0003", new Object[]{"a", "b", boyi.f135318a, "c", boyg.f135317a, "d", boyf.f135316a, "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new boyj();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f135319i;
            }
            bxxk bxxk = f135320j;
            if (bxxk == null) {
                synchronized (boyj.class) {
                    bxxk = f135320j;
                    if (bxxk == null) {
                        bxxk = new bxve(f135319i);
                        f135320j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
