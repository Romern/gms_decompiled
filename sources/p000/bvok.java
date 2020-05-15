package p000;

/* renamed from: bvok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvok extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvok f157041e;

    /* renamed from: f */
    private static volatile bxxk f157042f;

    /* renamed from: a */
    public int f157043a;

    /* renamed from: b */
    public int f157044b;

    /* renamed from: c */
    public int f157045c = 1;

    /* renamed from: d */
    public int f157046d;

    static {
        bvok bvok = new bvok();
        f157041e = bvok;
        GeneratedMessageLite.m124024a(bvok.class, bvok);
    }

    private bvok() {
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
            return GeneratedMessageLite.m124022a(f157041e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", bvoi.f157040a, "d"});
        } else if (i2 == 3) {
            return new bvok();
        } else {
            if (i2 == 4) {
                return new bxvd(f157041e);
            }
            if (i2 == 5) {
                return f157041e;
            }
            bxxk bxxk = f157042f;
            if (bxxk == null) {
                synchronized (bvok.class) {
                    bxxk = f157042f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157041e);
                        f157042f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
