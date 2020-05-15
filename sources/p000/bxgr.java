package p000;

/* renamed from: bxgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxgr f163289d;

    /* renamed from: e */
    private static volatile bxxk f163290e;

    /* renamed from: a */
    public int f163291a;

    /* renamed from: b */
    public bxge f163292b;

    /* renamed from: c */
    public int f163293c;

    static {
        bxgr bxgr = new bxgr();
        f163289d = bxgr;
        GeneratedMessageLite.m124024a(bxgr.class, bxgr);
    }

    private bxgr() {
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
            return GeneratedMessageLite.m124022a(f163289d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bxgl.f163268a});
        } else if (i2 == 3) {
            return new bxgr();
        } else {
            if (i2 == 4) {
                return new bxvd(f163289d);
            }
            if (i2 == 5) {
                return f163289d;
            }
            bxxk bxxk = f163290e;
            if (bxxk == null) {
                synchronized (bxgr.class) {
                    bxxk = f163290e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163289d);
                        f163290e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
