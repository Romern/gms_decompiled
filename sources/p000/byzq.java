package p000;

/* renamed from: byzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzq extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byzq f169146b;

    /* renamed from: d */
    private static volatile bxxk f169147d;

    /* renamed from: a */
    public int f169148a = -1;

    /* renamed from: c */
    private int f169149c;

    static {
        byzq byzq = new byzq();
        f169146b = byzq;
        bxvk.m124024a(byzq.class, byzq);
    }

    private byzq() {
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
            return bxvk.m124022a(f169146b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bzbp.f169261a});
        } else if (i2 == 3) {
            return new byzq();
        } else {
            if (i2 == 4) {
                return new bxvd(f169146b);
            }
            if (i2 == 5) {
                return f169146b;
            }
            bxxk bxxk = f169147d;
            if (bxxk == null) {
                synchronized (byzq.class) {
                    bxxk = f169147d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169146b);
                        f169147d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
