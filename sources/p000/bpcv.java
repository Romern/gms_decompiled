package p000;

/* renamed from: bpcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcv extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bpcv f135867i;

    /* renamed from: j */
    private static volatile bxxk f135868j;

    /* renamed from: a */
    public int f135869a;

    /* renamed from: b */
    public bpcu f135870b;

    /* renamed from: c */
    public bpcs f135871c;

    /* renamed from: d */
    public int f135872d;

    /* renamed from: e */
    public bxwc f135873e = bxxn.f165040b;

    /* renamed from: f */
    public bpct f135874f;

    /* renamed from: g */
    public int f135875g;

    /* renamed from: h */
    public int f135876h;

    static {
        bpcv bpcv = new bpcv();
        f135867i = bpcv;
        GeneratedMessageLite.m124024a(bpcv.class, bpcv);
    }

    private bpcv() {
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
            return GeneratedMessageLite.m124022a(f135867i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004\u001b\u0005ဉ\u0003\u0006င\u0004\u0007င\u0005", new Object[]{"a", "b", "c", "d", "e", bpcr.class, "f", "g", "h"});
        } else if (i2 == 3) {
            return new bpcv();
        } else {
            if (i2 == 4) {
                return new bpcq();
            }
            if (i2 == 5) {
                return f135867i;
            }
            bxxk bxxk = f135868j;
            if (bxxk == null) {
                synchronized (bpcv.class) {
                    bxxk = f135868j;
                    if (bxxk == null) {
                        bxxk = new bxve(f135867i);
                        f135868j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
