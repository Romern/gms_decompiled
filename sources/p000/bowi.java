package p000;

/* renamed from: bowi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowi extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bowi f135132i;

    /* renamed from: j */
    private static volatile bxxk f135133j;

    /* renamed from: a */
    public int f135134a;

    /* renamed from: b */
    public boolean f135135b;

    /* renamed from: c */
    public int f135136c;

    /* renamed from: d */
    public int f135137d;

    /* renamed from: e */
    public int f135138e;

    /* renamed from: f */
    public int f135139f;

    /* renamed from: g */
    public int f135140g;

    /* renamed from: h */
    public boolean f135141h;

    static {
        bowi bowi = new bowi();
        f135132i = bowi;
        GeneratedMessageLite.m124024a(bowi.class, bowi);
    }

    private bowi() {
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
            return GeneratedMessageLite.m124022a(f135132i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဌ\u0005\bဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", bowh.m111607b(), "h"});
        } else if (i2 == 3) {
            return new bowi();
        } else {
            if (i2 == 4) {
                return new bxvd(f135132i);
            }
            if (i2 == 5) {
                return f135132i;
            }
            bxxk bxxk = f135133j;
            if (bxxk == null) {
                synchronized (bowi.class) {
                    bxxk = f135133j;
                    if (bxxk == null) {
                        bxxk = new bxve(f135132i);
                        f135133j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
