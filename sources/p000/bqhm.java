package p000;

/* renamed from: bqhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhm extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bqhm f140667g;

    /* renamed from: h */
    private static volatile bxxk f140668h;

    /* renamed from: a */
    public String f140669a = "";

    /* renamed from: b */
    public int f140670b;

    /* renamed from: c */
    public int f140671c;

    /* renamed from: d */
    public int f140672d;

    /* renamed from: e */
    public int f140673e;

    /* renamed from: f */
    public boolean f140674f;

    static {
        bqhm bqhm = new bqhm();
        f140667g = bqhm;
        GeneratedMessageLite.m124024a(bqhm.class, bqhm);
    }

    private bqhm() {
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
            return GeneratedMessageLite.m124022a(f140667g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\f\u0005\f\u0006\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bqhm();
        } else {
            if (i2 == 4) {
                return new bxvd(f140667g);
            }
            if (i2 == 5) {
                return f140667g;
            }
            bxxk bxxk = f140668h;
            if (bxxk == null) {
                synchronized (bqhm.class) {
                    bxxk = f140668h;
                    if (bxxk == null) {
                        bxxk = new bxve(f140667g);
                        f140668h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
