package p000;

/* renamed from: mtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final mtc f34642b;

    /* renamed from: d */
    private static volatile bxxk f34643d;

    /* renamed from: a */
    public String f34644a = "";

    /* renamed from: c */
    private int f34645c;

    static {
        mtc mtc = new mtc();
        f34642b = mtc;
        GeneratedMessageLite.m124024a(mtc.class, mtc);
    }

    private mtc() {
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
            return GeneratedMessageLite.m124022a(f34642b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new mtc();
        } else {
            if (i2 == 4) {
                return new bxvd(f34642b);
            }
            if (i2 == 5) {
                return f34642b;
            }
            bxxk bxxk = f34643d;
            if (bxxk == null) {
                synchronized (mtc.class) {
                    bxxk = f34643d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34642b);
                        f34643d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
