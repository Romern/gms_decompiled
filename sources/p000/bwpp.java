package p000;

/* renamed from: bwpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwpp f160590c;

    /* renamed from: d */
    public static final bxvj f160591d;

    /* renamed from: e */
    private static volatile bxxk f160592e;

    /* renamed from: a */
    public int f160593a;

    /* renamed from: b */
    public bwdv f160594b;

    static {
        bwpp bwpp = new bwpp();
        f160590c = bwpp;
        GeneratedMessageLite.m124024a(bwpp.class, bwpp);
        bwog bwog = bwog.f160437f;
        bwpp bwpp2 = f160590c;
        f160591d = GeneratedMessageLite.m124006a(bwog, bwpp2, bwpp2, 284093889, bxzf.MESSAGE);
    }

    private bwpp() {
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
            return GeneratedMessageLite.m124022a(f160590c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwpp();
        } else {
            if (i2 == 4) {
                return new bxvd(f160590c);
            }
            if (i2 == 5) {
                return f160590c;
            }
            bxxk bxxk = f160592e;
            if (bxxk == null) {
                synchronized (bwpp.class) {
                    bxxk = f160592e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160590c);
                        f160592e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
