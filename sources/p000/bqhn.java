package p000;

/* renamed from: bqhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqhn f140675e;

    /* renamed from: f */
    private static volatile bxxk f140676f;

    /* renamed from: a */
    public boolean f140677a;

    /* renamed from: b */
    public long f140678b;

    /* renamed from: c */
    public boolean f140679c;

    /* renamed from: d */
    public boolean f140680d;

    static {
        bqhn bqhn = new bqhn();
        f140675e = bqhn;
        bxvk.m124024a(bqhn.class, bqhn);
    }

    private bqhn() {
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
            return bxvk.m124022a(f140675e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0007\u0004\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqhn();
        } else {
            if (i2 == 4) {
                return new bxvd(f140675e);
            }
            if (i2 == 5) {
                return f140675e;
            }
            bxxk bxxk = f140676f;
            if (bxxk == null) {
                synchronized (bqhn.class) {
                    bxxk = f140676f;
                    if (bxxk == null) {
                        bxxk = new bxve(f140675e);
                        f140676f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
