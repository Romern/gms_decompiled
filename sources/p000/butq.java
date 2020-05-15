package p000;

/* renamed from: butq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final butq f154862d;

    /* renamed from: e */
    private static volatile bxxk f154863e;

    /* renamed from: a */
    public int f154864a;

    /* renamed from: b */
    public String f154865b = "";

    /* renamed from: c */
    public String f154866c = "";

    static {
        butq butq = new butq();
        f154862d = butq;
        GeneratedMessageLite.m124024a(butq.class, butq);
    }

    private butq() {
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
            return GeneratedMessageLite.m124022a(f154862d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new butq();
        } else {
            if (i2 == 4) {
                return new bxvd(f154862d);
            }
            if (i2 == 5) {
                return f154862d;
            }
            bxxk bxxk = f154863e;
            if (bxxk == null) {
                synchronized (butq.class) {
                    bxxk = f154863e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154862d);
                        f154863e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
