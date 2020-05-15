package p000;

/* renamed from: moz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class moz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final moz f34092c;

    /* renamed from: d */
    private static volatile bxxk f34093d;

    /* renamed from: a */
    public int f34094a;

    /* renamed from: b */
    public String f34095b = "";

    static {
        moz moz = new moz();
        f34092c = moz;
        bxvk.m124024a(moz.class, moz);
    }

    private moz() {
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
            return bxvk.m124022a(f34092c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new moz();
        } else {
            if (i2 == 4) {
                return new bxvd(f34092c);
            }
            if (i2 == 5) {
                return f34092c;
            }
            bxxk bxxk = f34093d;
            if (bxxk == null) {
                synchronized (moz.class) {
                    bxxk = f34093d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34092c);
                        f34093d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
