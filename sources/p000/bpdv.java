package p000;

/* renamed from: bpdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdv extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bpdv f136400i;

    /* renamed from: j */
    private static volatile bxxk f136401j;

    /* renamed from: a */
    public int f136402a;

    /* renamed from: b */
    public int f136403b;

    /* renamed from: c */
    public int f136404c;

    /* renamed from: d */
    public int f136405d;

    /* renamed from: e */
    public int f136406e;

    /* renamed from: f */
    public int f136407f;

    /* renamed from: g */
    public int f136408g;

    /* renamed from: h */
    public int f136409h;

    static {
        bpdv bpdv = new bpdv();
        f136400i = bpdv;
        GeneratedMessageLite.m124024a(bpdv.class, bpdv);
    }

    private bpdv() {
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
            return GeneratedMessageLite.m124022a(f136400i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bpdv();
        } else {
            if (i2 == 4) {
                return new bxvd(f136400i);
            }
            if (i2 == 5) {
                return f136400i;
            }
            bxxk bxxk = f136401j;
            if (bxxk == null) {
                synchronized (bpdv.class) {
                    bxxk = f136401j;
                    if (bxxk == null) {
                        bxxk = new bxve(f136400i);
                        f136401j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
