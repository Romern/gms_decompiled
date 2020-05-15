package p000;

/* renamed from: kwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final kwn f25290e;

    /* renamed from: f */
    private static volatile bxxk f25291f;

    /* renamed from: a */
    public int f25292a;

    /* renamed from: b */
    public boolean f25293b;

    /* renamed from: c */
    public boolean f25294c;

    /* renamed from: d */
    public boolean f25295d;

    static {
        kwn kwn = new kwn();
        f25290e = kwn;
        GeneratedMessageLite.m124024a(kwn.class, kwn);
    }

    private kwn() {
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
            return GeneratedMessageLite.m124022a(f25290e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new kwn();
        } else {
            if (i2 == 4) {
                return new bxvd(f25290e);
            }
            if (i2 == 5) {
                return f25290e;
            }
            bxxk bxxk = f25291f;
            if (bxxk == null) {
                synchronized (kwn.class) {
                    bxxk = f25291f;
                    if (bxxk == null) {
                        bxxk = new bxve(f25290e);
                        f25291f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
