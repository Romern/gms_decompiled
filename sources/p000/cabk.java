package p000;

/* renamed from: cabk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cabk f172444e;

    /* renamed from: f */
    private static volatile bxxk f172445f;

    /* renamed from: a */
    public int f172446a;

    /* renamed from: b */
    public int f172447b = 0;

    /* renamed from: c */
    public Object f172448c;

    /* renamed from: d */
    public cabv f172449d;

    static {
        cabk cabk = new cabk();
        f172444e = cabk;
        GeneratedMessageLite.m124024a(cabk.class, cabk);
    }

    private cabk() {
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
            return GeneratedMessageLite.m124022a(f172444e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000", new Object[]{"c", "b", "a", "d", cabj.class});
        } else if (i2 == 3) {
            return new cabk();
        } else {
            if (i2 == 4) {
                return new bxvd(f172444e);
            }
            if (i2 == 5) {
                return f172444e;
            }
            bxxk bxxk = f172445f;
            if (bxxk == null) {
                synchronized (cabk.class) {
                    bxxk = f172445f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172444e);
                        f172445f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
