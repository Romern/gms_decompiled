package p000;

/* renamed from: bmrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmrq f130560d;

    /* renamed from: e */
    private static volatile bxxk f130561e;

    /* renamed from: a */
    public int f130562a;

    /* renamed from: b */
    public bmaj f130563b;

    /* renamed from: c */
    public bmrn f130564c;

    static {
        bmrq bmrq = new bmrq();
        f130560d = bmrq;
        GeneratedMessageLite.m124024a(bmrq.class, bmrq);
    }

    private bmrq() {
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
            return GeneratedMessageLite.m124022a(f130560d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmrq();
        } else {
            if (i2 == 4) {
                return new bxvd(f130560d);
            }
            if (i2 == 5) {
                return f130560d;
            }
            bxxk bxxk = f130561e;
            if (bxxk == null) {
                synchronized (bmrq.class) {
                    bxxk = f130561e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130560d);
                        f130561e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
