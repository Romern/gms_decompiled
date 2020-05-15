package p000;

/* renamed from: bxlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxlq f163878d;

    /* renamed from: e */
    private static volatile bxxk f163879e;

    /* renamed from: a */
    public int f163880a;

    /* renamed from: b */
    public int f163881b;

    /* renamed from: c */
    public bxlo f163882c;

    static {
        bxlq bxlq = new bxlq();
        f163878d = bxlq;
        bxvk.m124024a(bxlq.class, bxlq);
    }

    private bxlq() {
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
            return bxvk.m124022a(f163878d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bxlp.f163877a, "c"});
        } else if (i2 == 3) {
            return new bxlq();
        } else {
            if (i2 == 4) {
                return new bxvd(f163878d);
            }
            if (i2 == 5) {
                return f163878d;
            }
            bxxk bxxk = f163879e;
            if (bxxk == null) {
                synchronized (bxlq.class) {
                    bxxk = f163879e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163878d);
                        f163879e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
