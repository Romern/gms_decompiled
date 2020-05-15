package p000;

/* renamed from: ater */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ater extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ater f90191d;

    /* renamed from: e */
    private static volatile bxxk f90192e;

    /* renamed from: a */
    public int f90193a = 0;

    /* renamed from: b */
    public Object f90194b;

    /* renamed from: c */
    public String f90195c = "";

    static {
        ater ater = new ater();
        f90191d = ater;
        GeneratedMessageLite.m124024a(ater.class, ater);
    }

    private ater() {
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
            return GeneratedMessageLite.m124022a(f90191d, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003=\u0000\u0004:\u0000\u00057\u0000\u00065\u0000", new Object[]{"b", "a", "c"});
        } else if (i2 == 3) {
            return new ater();
        } else {
            if (i2 == 4) {
                return new bxvd(f90191d);
            }
            if (i2 == 5) {
                return f90191d;
            }
            bxxk bxxk = f90192e;
            if (bxxk == null) {
                synchronized (ater.class) {
                    bxxk = f90192e;
                    if (bxxk == null) {
                        bxxk = new bxve(f90191d);
                        f90192e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
