package p000;

/* renamed from: bpdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdl extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpdl f136256a;

    /* renamed from: b */
    private static volatile bxxk f136257b;

    static {
        bpdl bpdl = new bpdl();
        f136256a = bpdl;
        GeneratedMessageLite.m124024a(bpdl.class, bpdl);
    }

    private bpdl() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f136256a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpdl();
        }
        if (i2 == 4) {
            return new bxvd(f136256a);
        }
        if (i2 == 5) {
            return f136256a;
        }
        bxxk bxxk = f136257b;
        if (bxxk == null) {
            synchronized (bpdl.class) {
                bxxk = f136257b;
                if (bxxk == null) {
                    bxxk = new bxve(f136256a);
                    f136257b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
