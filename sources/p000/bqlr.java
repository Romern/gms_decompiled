package p000;

/* renamed from: bqlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqlr f141155c;

    /* renamed from: d */
    private static volatile bxxk f141156d;

    /* renamed from: a */
    public int f141157a;

    /* renamed from: b */
    public String f141158b = "";

    static {
        bqlr bqlr = new bqlr();
        f141155c = bqlr;
        bxvk.m124024a(bqlr.class, bqlr);
    }

    private bqlr() {
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
            return bxvk.m124022a(f141155c, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002\f\u0004Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqlr();
        } else {
            if (i2 == 4) {
                return new bxvd(f141155c);
            }
            if (i2 == 5) {
                return f141155c;
            }
            bxxk bxxk = f141156d;
            if (bxxk == null) {
                synchronized (bqlr.class) {
                    bxxk = f141156d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141155c);
                        f141156d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
