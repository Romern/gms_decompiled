package p000;

/* renamed from: lsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lsx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final lsx f32860c;

    /* renamed from: d */
    private static volatile bxxk f32861d;

    /* renamed from: a */
    public int f32862a;

    /* renamed from: b */
    public String f32863b = "";

    static {
        lsx lsx = new lsx();
        f32860c = lsx;
        bxvk.m124024a(lsx.class, lsx);
    }

    private lsx() {
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
            return bxvk.m124022a(f32860c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new lsx();
        } else {
            if (i2 == 4) {
                return new bxvd(f32860c);
            }
            if (i2 == 5) {
                return f32860c;
            }
            bxxk bxxk = f32861d;
            if (bxxk == null) {
                synchronized (lsx.class) {
                    bxxk = f32861d;
                    if (bxxk == null) {
                        bxxk = new bxve(f32860c);
                        f32861d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
