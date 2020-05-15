package p000;

/* renamed from: bocq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bocq f132590d;

    /* renamed from: e */
    private static volatile bxxk f132591e;

    /* renamed from: a */
    public int f132592a;

    /* renamed from: b */
    public int f132593b;

    /* renamed from: c */
    public int f132594c;

    static {
        bocq bocq = new bocq();
        f132590d = bocq;
        bxvk.m124024a(bocq.class, bocq);
    }

    private bocq() {
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
            return bxvk.m124022a(f132590d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bocp.f132589a, "c", bode.f132674a});
        } else if (i2 == 3) {
            return new bocq();
        } else {
            if (i2 == 4) {
                return new bxvd(f132590d);
            }
            if (i2 == 5) {
                return f132590d;
            }
            bxxk bxxk = f132591e;
            if (bxxk == null) {
                synchronized (bocq.class) {
                    bxxk = f132591e;
                    if (bxxk == null) {
                        bxxk = new bxve(f132590d);
                        f132591e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
