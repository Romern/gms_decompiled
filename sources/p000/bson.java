package p000;

/* renamed from: bson */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bson extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bson f146405d;

    /* renamed from: e */
    private static volatile bxxk f146406e;

    /* renamed from: a */
    public int f146407a;

    /* renamed from: b */
    public int f146408b;

    /* renamed from: c */
    public int f146409c;

    static {
        bson bson = new bson();
        f146405d = bson;
        bxvk.m124024a(bson.class, bson);
    }

    private bson() {
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
            return bxvk.m124022a(f146405d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bson();
        } else {
            if (i2 == 4) {
                return new bxvd(f146405d);
            }
            if (i2 == 5) {
                return f146405d;
            }
            bxxk bxxk = f146406e;
            if (bxxk == null) {
                synchronized (bson.class) {
                    bxxk = f146406e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146405d);
                        f146406e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
