package p000;

/* renamed from: aylq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aylq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aylq f97916d;

    /* renamed from: f */
    private static volatile bxxk f97917f;

    /* renamed from: a */
    public String f97918a = "";

    /* renamed from: b */
    public int f97919b;

    /* renamed from: c */
    public int f97920c;

    /* renamed from: e */
    private int f97921e;

    static {
        aylq aylq = new aylq();
        f97916d = aylq;
        GeneratedMessageLite.m124024a(aylq.class, aylq);
    }

    private aylq() {
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
            return GeneratedMessageLite.m124022a(f97916d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new aylq();
        } else {
            if (i2 == 4) {
                return new bxvd(f97916d);
            }
            if (i2 == 5) {
                return f97916d;
            }
            bxxk bxxk = f97917f;
            if (bxxk == null) {
                synchronized (aylq.class) {
                    bxxk = f97917f;
                    if (bxxk == null) {
                        bxxk = new bxve(f97916d);
                        f97917f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
