package p000;

/* renamed from: avsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final avsx f93872c;

    /* renamed from: d */
    private static volatile bxxk f93873d;

    /* renamed from: a */
    public int f93874a;

    /* renamed from: b */
    public boolean f93875b;

    static {
        avsx avsx = new avsx();
        f93872c = avsx;
        GeneratedMessageLite.m124024a(avsx.class, avsx);
    }

    private avsx() {
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
            return GeneratedMessageLite.m124022a(f93872c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new avsx();
        } else {
            if (i2 == 4) {
                return new bxvd(f93872c);
            }
            if (i2 == 5) {
                return f93872c;
            }
            bxxk bxxk = f93873d;
            if (bxxk == null) {
                synchronized (avsx.class) {
                    bxxk = f93873d;
                    if (bxxk == null) {
                        bxxk = new bxve(f93872c);
                        f93873d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
