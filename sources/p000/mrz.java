package p000;

/* renamed from: mrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mrz extends bxvk implements bxxd {

    /* renamed from: i */
    public static final mrz f34496i;

    /* renamed from: j */
    private static volatile bxxk f34497j;

    /* renamed from: a */
    public int f34498a;

    /* renamed from: b */
    public int f34499b;

    /* renamed from: c */
    public long f34500c;

    /* renamed from: d */
    public long f34501d;

    /* renamed from: e */
    public int f34502e;

    /* renamed from: f */
    public int f34503f;

    /* renamed from: g */
    public int f34504g;

    /* renamed from: h */
    public long f34505h;

    static {
        mrz mrz = new mrz();
        f34496i = mrz;
        bxvk.m124024a(mrz.class, mrz);
    }

    private mrz() {
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
            return bxvk.m124022a(f34496i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဂ\u0006", new Object[]{"a", "b", mrw.f34493a, "c", "d", "e", mrv.f34492a, "f", mry.f34495a, "g", mrx.f34494a, "h"});
        } else if (i2 == 3) {
            return new mrz();
        } else {
            if (i2 == 4) {
                return new bxvd(f34496i);
            }
            if (i2 == 5) {
                return f34496i;
            }
            bxxk bxxk = f34497j;
            if (bxxk == null) {
                synchronized (mrz.class) {
                    bxxk = f34497j;
                    if (bxxk == null) {
                        bxxk = new bxve(f34496i);
                        f34497j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
