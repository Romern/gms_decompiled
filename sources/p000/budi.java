package p000;

/* renamed from: budi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budi extends bxvk implements bxxd {

    /* renamed from: i */
    public static final budi f153472i;

    /* renamed from: j */
    private static volatile bxxk f153473j;

    /* renamed from: a */
    public int f153474a;

    /* renamed from: b */
    public boolean f153475b;

    /* renamed from: c */
    public long f153476c = 30000000000L;

    /* renamed from: d */
    public long f153477d = 20000000000L;

    /* renamed from: e */
    public boolean f153478e;

    /* renamed from: f */
    public long f153479f = 43200;

    /* renamed from: g */
    public int f153480g;

    /* renamed from: h */
    public int f153481h = 24;

    static {
        budi budi = new budi();
        f153472i = budi;
        bxvk.m124024a(budi.class, budi);
    }

    private budi() {
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
            return bxvk.m124022a(f153472i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0004ဃ\u0003\u0005ဇ\u0004\u0006ဃ\u0005\u0007ဋ\u0006\bဋ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new budi();
        } else {
            if (i2 == 4) {
                return new bxvd(f153472i);
            }
            if (i2 == 5) {
                return f153472i;
            }
            bxxk bxxk = f153473j;
            if (bxxk == null) {
                synchronized (budi.class) {
                    bxxk = f153473j;
                    if (bxxk == null) {
                        bxxk = new bxve(f153472i);
                        f153473j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
