package p000;

/* renamed from: bwve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwve extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwve f161107d;

    /* renamed from: f */
    private static volatile bxxk f161108f;

    /* renamed from: a */
    public bwvf f161109a;

    /* renamed from: b */
    public String f161110b = "";

    /* renamed from: c */
    public int f161111c;

    /* renamed from: e */
    private int f161112e;

    static {
        bwve bwve = new bwve();
        f161107d = bwve;
        bxvk.m124024a(bwve.class, bwve);
    }

    private bwve() {
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
            return bxvk.m124022a(f161107d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bwve();
        } else {
            if (i2 == 4) {
                return new bxvd(f161107d);
            }
            if (i2 == 5) {
                return f161107d;
            }
            bxxk bxxk = f161108f;
            if (bxxk == null) {
                synchronized (bwve.class) {
                    bxxk = f161108f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161107d);
                        f161108f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
