package p000;

/* renamed from: bxaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxaz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxaz f161765d;

    /* renamed from: f */
    private static volatile bxxk f161766f;

    /* renamed from: a */
    public int f161767a = 0;

    /* renamed from: b */
    public Object f161768b;

    /* renamed from: c */
    public int f161769c;

    /* renamed from: e */
    private int f161770e;

    static {
        bxaz bxaz = new bxaz();
        f161765d = bxaz;
        GeneratedMessageLite.m124024a(bxaz.class, bxaz);
    }

    private bxaz() {
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
            return GeneratedMessageLite.m124022a(f161765d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "e", "c", bpsg.m112233b(), bxay.class});
        } else if (i2 == 3) {
            return new bxaz();
        } else {
            if (i2 == 4) {
                return new bxvd(f161765d);
            }
            if (i2 == 5) {
                return f161765d;
            }
            bxxk bxxk = f161766f;
            if (bxxk == null) {
                synchronized (bxaz.class) {
                    bxxk = f161766f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161765d);
                        f161766f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
