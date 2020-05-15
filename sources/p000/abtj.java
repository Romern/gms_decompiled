package p000;

/* renamed from: abtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final abtj f58241d;

    /* renamed from: e */
    private static volatile bxxk f58242e;

    /* renamed from: a */
    public int f58243a;

    /* renamed from: b */
    public abth f58244b;

    /* renamed from: c */
    public bxwc f58245c = bxxn.f165040b;

    static {
        abtj abtj = new abtj();
        f58241d = abtj;
        GeneratedMessageLite.m124024a(abtj.class, abtj);
    }

    private abtj() {
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
            return GeneratedMessageLite.m124022a(f58241d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", abti.class});
        } else if (i2 == 3) {
            return new abtj();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f58241d;
            }
            bxxk bxxk = f58242e;
            if (bxxk == null) {
                synchronized (abtj.class) {
                    bxxk = f58242e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58241d);
                        f58242e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
