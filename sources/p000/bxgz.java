package p000;

/* renamed from: bxgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxgz f163326d;

    /* renamed from: e */
    private static volatile bxxk f163327e;

    /* renamed from: a */
    public int f163328a;

    /* renamed from: b */
    public int f163329b;

    /* renamed from: c */
    public bxgk f163330c;

    static {
        bxgz bxgz = new bxgz();
        f163326d = bxgz;
        GeneratedMessageLite.m124024a(bxgz.class, bxgz);
    }

    private bxgz() {
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
            return GeneratedMessageLite.m124022a(f163326d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bxgy.m122706b(), "c"});
        } else if (i2 == 3) {
            return new bxgz();
        } else {
            if (i2 == 4) {
                return new bxvd(f163326d);
            }
            if (i2 == 5) {
                return f163326d;
            }
            bxxk bxxk = f163327e;
            if (bxxk == null) {
                synchronized (bxgz.class) {
                    bxxk = f163327e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163326d);
                        f163327e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
