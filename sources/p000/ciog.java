package p000;

/* renamed from: ciog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciog extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ciog f191055d;

    /* renamed from: e */
    private static volatile bxxk f191056e;

    /* renamed from: a */
    public int f191057a;

    /* renamed from: b */
    public long f191058b;

    /* renamed from: c */
    public long f191059c;

    static {
        ciog ciog = new ciog();
        f191055d = ciog;
        bxvk.m124024a(ciog.class, ciog);
    }

    private ciog() {
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
            return bxvk.m124022a(f191055d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ciog();
        } else {
            if (i2 == 4) {
                return new bxvd(f191055d);
            }
            if (i2 == 5) {
                return f191055d;
            }
            bxxk bxxk = f191056e;
            if (bxxk == null) {
                synchronized (ciog.class) {
                    bxxk = f191056e;
                    if (bxxk == null) {
                        bxxk = new bxve(f191055d);
                        f191056e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
