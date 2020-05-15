package p000;

/* renamed from: cacb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cacb f172505d;

    /* renamed from: e */
    private static volatile bxxk f172506e;

    /* renamed from: a */
    public int f172507a;

    /* renamed from: b */
    public String f172508b = "";

    /* renamed from: c */
    public String f172509c = "";

    static {
        cacb cacb = new cacb();
        f172505d = cacb;
        GeneratedMessageLite.m124024a(cacb.class, cacb);
    }

    private cacb() {
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
            return GeneratedMessageLite.m124022a(f172505d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cacb();
        } else {
            if (i2 == 4) {
                return new bxvd(f172505d);
            }
            if (i2 == 5) {
                return f172505d;
            }
            bxxk bxxk = f172506e;
            if (bxxk == null) {
                synchronized (cacb.class) {
                    bxxk = f172506e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172505d);
                        f172506e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
