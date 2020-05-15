package p000;

/* renamed from: bovt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bovt f135051e;

    /* renamed from: f */
    private static volatile bxxk f135052f;

    /* renamed from: a */
    public int f135053a;

    /* renamed from: b */
    public int f135054b;

    /* renamed from: c */
    public int f135055c;

    /* renamed from: d */
    public int f135056d;

    static {
        bovt bovt = new bovt();
        f135051e = bovt;
        GeneratedMessageLite.m124024a(bovt.class, bovt);
    }

    private bovt() {
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
            return GeneratedMessageLite.m124022a(f135051e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", bovr.f135049a, "d", bovs.f135050a});
        } else if (i2 == 3) {
            return new bovt();
        } else {
            if (i2 == 4) {
                return new bxvd(f135051e);
            }
            if (i2 == 5) {
                return f135051e;
            }
            bxxk bxxk = f135052f;
            if (bxxk == null) {
                synchronized (bovt.class) {
                    bxxk = f135052f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135051e);
                        f135052f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
