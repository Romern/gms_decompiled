package p000;

/* renamed from: cajf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cajf f174814d;

    /* renamed from: e */
    private static volatile bxxk f174815e;

    /* renamed from: a */
    public int f174816a;

    /* renamed from: b */
    public cajl f174817b;

    /* renamed from: c */
    public int f174818c;

    static {
        cajf cajf = new cajf();
        f174814d = cajf;
        GeneratedMessageLite.m124024a(cajf.class, cajf);
    }

    private cajf() {
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
            return GeneratedMessageLite.m124022a(f174814d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cajf();
        } else {
            if (i2 == 4) {
                return new bxvd(f174814d);
            }
            if (i2 == 5) {
                return f174814d;
            }
            bxxk bxxk = f174815e;
            if (bxxk == null) {
                synchronized (cajf.class) {
                    bxxk = f174815e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174814d);
                        f174815e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
