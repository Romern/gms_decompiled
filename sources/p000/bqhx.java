package p000;

/* renamed from: bqhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhx extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bqhx f140735h;

    /* renamed from: i */
    private static volatile bxxk f140736i;

    /* renamed from: a */
    public String f140737a = "";

    /* renamed from: b */
    public String f140738b = "";

    /* renamed from: c */
    public String f140739c = "";

    /* renamed from: d */
    public long f140740d;

    /* renamed from: e */
    public int f140741e;

    /* renamed from: f */
    public long f140742f;

    /* renamed from: g */
    public long f140743g;

    static {
        bqhx bqhx = new bqhx();
        f140735h = bqhx;
        GeneratedMessageLite.m124024a(bqhx.class, bqhx);
    }

    private bqhx() {
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
            return GeneratedMessageLite.m124022a(f140735h, "\u0000\u0007\u0000\u0000\u0001\t\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0003\u0006\f\b\u0003\t\u0003", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bqhx();
        } else {
            if (i2 == 4) {
                return new bxvd(f140735h);
            }
            if (i2 == 5) {
                return f140735h;
            }
            bxxk bxxk = f140736i;
            if (bxxk == null) {
                synchronized (bqhx.class) {
                    bxxk = f140736i;
                    if (bxxk == null) {
                        bxxk = new bxve(f140735h);
                        f140736i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
