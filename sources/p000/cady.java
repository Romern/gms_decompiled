package p000;

/* renamed from: cady */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cady extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cady f172767e;

    /* renamed from: f */
    private static volatile bxxk f172768f;

    /* renamed from: a */
    public int f172769a;

    /* renamed from: b */
    public bxwc f172770b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f172771c = bxxn.f165040b;

    /* renamed from: d */
    public String f172772d = "";

    static {
        cady cady = new cady();
        f172767e = cady;
        GeneratedMessageLite.m124024a(cady.class, cady);
    }

    private cady() {
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
            return GeneratedMessageLite.m124022a(f172767e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000", new Object[]{"a", "b", cadz.class, "c", cadz.class, "d"});
        } else if (i2 == 3) {
            return new cady();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f172767e;
            }
            bxxk bxxk = f172768f;
            if (bxxk == null) {
                synchronized (cady.class) {
                    bxxk = f172768f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172767e);
                        f172768f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
