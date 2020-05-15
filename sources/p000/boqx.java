package p000;

/* renamed from: boqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqx extends bxvk implements bxxd {

    /* renamed from: i */
    public static final boqx f134343i;

    /* renamed from: j */
    private static volatile bxxk f134344j;

    /* renamed from: a */
    public int f134345a;

    /* renamed from: b */
    public int f134346b;

    /* renamed from: c */
    public boqy f134347c;

    /* renamed from: d */
    public borb f134348d;

    /* renamed from: e */
    public boqw f134349e;

    /* renamed from: f */
    public borc f134350f;

    /* renamed from: g */
    public bora f134351g;

    /* renamed from: h */
    public boqz f134352h;

    static {
        boqx boqx = new boqx();
        f134343i = boqx;
        bxvk.m124024a(boqx.class, boqx);
    }

    private boqx() {
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
            return bxvk.m124022a(f134343i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", caeq.f172849a, "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new boqx();
        } else {
            if (i2 == 4) {
                return new bxvd(f134343i);
            }
            if (i2 == 5) {
                return f134343i;
            }
            bxxk bxxk = f134344j;
            if (bxxk == null) {
                synchronized (boqx.class) {
                    bxxk = f134344j;
                    if (bxxk == null) {
                        bxxk = new bxve(f134343i);
                        f134344j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
