package p000;

/* renamed from: lan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lan extends bxvk implements bxxd {

    /* renamed from: j */
    public static final lan f25571j;

    /* renamed from: k */
    private static volatile bxxk f25572k;

    /* renamed from: a */
    public kzz f25573a;

    /* renamed from: b */
    public int f25574b;

    /* renamed from: c */
    public long f25575c;

    /* renamed from: d */
    public boolean f25576d;

    /* renamed from: e */
    public boolean f25577e;

    /* renamed from: f */
    public int f25578f;

    /* renamed from: g */
    public boolean f25579g;

    /* renamed from: h */
    public boolean f25580h;

    /* renamed from: i */
    public boolean f25581i;

    static {
        lan lan = new lan();
        f25571j = lan;
        bxvk.m124024a(lan.class, lan);
    }

    private lan() {
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
            return bxvk.m124022a(f25571j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\u0004\u0003\u0002\u0004\u0007\u0005\u0007\u0006\f\u0007\u0007\b\u0007\t\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new lan();
        } else {
            if (i2 == 4) {
                return new bxvd(f25571j);
            }
            if (i2 == 5) {
                return f25571j;
            }
            bxxk bxxk = f25572k;
            if (bxxk == null) {
                synchronized (lan.class) {
                    bxxk = f25572k;
                    if (bxxk == null) {
                        bxxk = new bxve(f25571j);
                        f25572k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
