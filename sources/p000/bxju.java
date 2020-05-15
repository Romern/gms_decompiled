package p000;

/* renamed from: bxju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxju extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxju f163681d;

    /* renamed from: e */
    private static volatile bxxk f163682e;

    /* renamed from: a */
    public int f163683a;

    /* renamed from: b */
    public bxjc f163684b;

    /* renamed from: c */
    public bxwc f163685c = bxxn.f165040b;

    static {
        bxju bxju = new bxju();
        f163681d = bxju;
        bxvk.m124024a(bxju.class, bxju);
    }

    private bxju() {
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
            return bxvk.m124022a(f163681d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bxjk.class});
        } else if (i2 == 3) {
            return new bxju();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f163681d;
            }
            bxxk bxxk = f163682e;
            if (bxxk == null) {
                synchronized (bxju.class) {
                    bxxk = f163682e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163681d);
                        f163682e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
