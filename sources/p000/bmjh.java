package p000;

/* renamed from: bmjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmjh f129700e;

    /* renamed from: f */
    private static volatile bxxk f129701f;

    /* renamed from: a */
    public int f129702a;

    /* renamed from: b */
    public bmjf f129703b;

    /* renamed from: c */
    public bxwc f129704c = bxxn.f165040b;

    /* renamed from: d */
    public long f129705d;

    static {
        bmjh bmjh = new bmjh();
        f129700e = bmjh;
        GeneratedMessageLite.m124024a(bmjh.class, bmjh);
    }

    private bmjh() {
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
            return GeneratedMessageLite.m124022a(f129700e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဂ\u0001", new Object[]{"a", "b", "c", bmjg.class, "d"});
        } else if (i2 == 3) {
            return new bmjh();
        } else {
            if (i2 == 4) {
                return new bxvd(f129700e);
            }
            if (i2 == 5) {
                return f129700e;
            }
            bxxk bxxk = f129701f;
            if (bxxk == null) {
                synchronized (bmjh.class) {
                    bxxk = f129701f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129700e);
                        f129701f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
