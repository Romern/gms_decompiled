package p000;

/* renamed from: btjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btjp f149156e;

    /* renamed from: f */
    private static volatile bxxk f149157f;

    /* renamed from: a */
    public int f149158a;

    /* renamed from: b */
    public int f149159b;

    /* renamed from: c */
    public int f149160c;

    /* renamed from: d */
    public int f149161d;

    static {
        btjp btjp = new btjp();
        f149156e = btjp;
        GeneratedMessageLite.m124024a(btjp.class, btjp);
    }

    private btjp() {
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
            return GeneratedMessageLite.m124022a(f149156e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\f\u0004\f", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btjp();
        } else {
            if (i2 == 4) {
                return new bxvd(f149156e);
            }
            if (i2 == 5) {
                return f149156e;
            }
            bxxk bxxk = f149157f;
            if (bxxk == null) {
                synchronized (btjp.class) {
                    bxxk = f149157f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149156e);
                        f149157f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
