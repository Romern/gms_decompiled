package p000;

/* renamed from: lsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lsw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final lsw f32856c;

    /* renamed from: d */
    private static volatile bxxk f32857d;

    /* renamed from: a */
    public int f32858a;

    /* renamed from: b */
    public String f32859b = "";

    static {
        lsw lsw = new lsw();
        f32856c = lsw;
        GeneratedMessageLite.m124024a(lsw.class, lsw);
    }

    private lsw() {
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
            return GeneratedMessageLite.m124022a(f32856c, "\u0001\u0001\u0000\u0001\f\f\u0001\u0000\u0000\u0000\fဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new lsw();
        } else {
            if (i2 == 4) {
                return new bxvd(f32856c);
            }
            if (i2 == 5) {
                return f32856c;
            }
            bxxk bxxk = f32857d;
            if (bxxk == null) {
                synchronized (lsw.class) {
                    bxxk = f32857d;
                    if (bxxk == null) {
                        bxxk = new bxve(f32856c);
                        f32857d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
