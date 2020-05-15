package p000;

/* renamed from: bmrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmrz f130626e;

    /* renamed from: f */
    private static volatile bxxk f130627f;

    /* renamed from: a */
    public int f130628a;

    /* renamed from: b */
    public bmaj f130629b;

    /* renamed from: c */
    public bmry f130630c;

    /* renamed from: d */
    public bmaf f130631d;

    static {
        bmrz bmrz = new bmrz();
        f130626e = bmrz;
        GeneratedMessageLite.m124024a(bmrz.class, bmrz);
    }

    private bmrz() {
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
            return GeneratedMessageLite.m124022a(f130626e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmrz();
        } else {
            if (i2 == 4) {
                return new bxvd(f130626e);
            }
            if (i2 == 5) {
                return f130626e;
            }
            bxxk bxxk = f130627f;
            if (bxxk == null) {
                synchronized (bmrz.class) {
                    bxxk = f130627f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130626e);
                        f130627f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
