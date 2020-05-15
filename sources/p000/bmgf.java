package p000;

/* renamed from: bmgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmgf f129233e;

    /* renamed from: f */
    private static volatile bxxk f129234f;

    /* renamed from: a */
    public int f129235a;

    /* renamed from: b */
    public bmbs f129236b;

    /* renamed from: c */
    public bmif f129237c;

    /* renamed from: d */
    public bmfv f129238d;

    static {
        bmgf bmgf = new bmgf();
        f129233e = bmgf;
        GeneratedMessageLite.m124024a(bmgf.class, bmgf);
    }

    private bmgf() {
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
            return GeneratedMessageLite.m124022a(f129233e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmgf();
        } else {
            if (i2 == 4) {
                return new bxvd(f129233e);
            }
            if (i2 == 5) {
                return f129233e;
            }
            bxxk bxxk = f129234f;
            if (bxxk == null) {
                synchronized (bmgf.class) {
                    bxxk = f129234f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129233e);
                        f129234f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
