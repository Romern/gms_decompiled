package p000;

/* renamed from: bxjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxjx f163698d;

    /* renamed from: e */
    private static volatile bxxk f163699e;

    /* renamed from: a */
    public int f163700a;

    /* renamed from: b */
    public String f163701b = "";

    /* renamed from: c */
    public long f163702c;

    static {
        bxjx bxjx = new bxjx();
        f163698d = bxjx;
        GeneratedMessageLite.m124024a(bxjx.class, bxjx);
    }

    private bxjx() {
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
            return GeneratedMessageLite.m124022a(f163698d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxjx();
        } else {
            if (i2 == 4) {
                return new bxvd(f163698d);
            }
            if (i2 == 5) {
                return f163698d;
            }
            bxxk bxxk = f163699e;
            if (bxxk == null) {
                synchronized (bxjx.class) {
                    bxxk = f163699e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163698d);
                        f163699e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
