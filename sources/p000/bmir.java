package p000;

/* renamed from: bmir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmir extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmir f129621d;

    /* renamed from: e */
    private static volatile bxxk f129622e;

    /* renamed from: a */
    public int f129623a;

    /* renamed from: b */
    public int f129624b;

    /* renamed from: c */
    public String f129625c = "";

    static {
        bmir bmir = new bmir();
        f129621d = bmir;
        bxvk.m124024a(bmir.class, bmir);
    }

    private bmir() {
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
            return bxvk.m124022a(f129621d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bmjd.f129684a, "c"});
        } else if (i2 == 3) {
            return new bmir();
        } else {
            if (i2 == 4) {
                return new bxvd(f129621d);
            }
            if (i2 == 5) {
                return f129621d;
            }
            bxxk bxxk = f129622e;
            if (bxxk == null) {
                synchronized (bmir.class) {
                    bxxk = f129622e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129621d);
                        f129622e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
