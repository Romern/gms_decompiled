package p000;

/* renamed from: bzhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhl extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bzhl f170076m;

    /* renamed from: n */
    private static volatile bxxk f170077n;

    /* renamed from: a */
    public int f170078a;

    /* renamed from: b */
    public bzjm f170079b;

    /* renamed from: c */
    public bzje f170080c;

    /* renamed from: d */
    public bzji f170081d;

    /* renamed from: e */
    public bzhf f170082e;

    /* renamed from: f */
    public bzii f170083f;

    /* renamed from: g */
    public bzjr f170084g;

    /* renamed from: h */
    public bzju f170085h;

    /* renamed from: i */
    public bziq f170086i;

    /* renamed from: j */
    public bzik f170087j;

    /* renamed from: k */
    public bzht f170088k;

    /* renamed from: l */
    public bzjp f170089l;

    static {
        bzhl bzhl = new bzhl();
        f170076m = bzhl;
        GeneratedMessageLite.m124024a(bzhl.class, bzhl);
    }

    private bzhl() {
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
            return GeneratedMessageLite.m124022a(f170076m, "\u0001\u000b\u0000\u0001\u0002\u0013\u000b\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\bဉ\u0006\tဉ\u0007\u000bဉ\t\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0013ဉ\u0011", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bzhl();
        } else {
            if (i2 == 4) {
                return new bxvd(f170076m);
            }
            if (i2 == 5) {
                return f170076m;
            }
            bxxk bxxk = f170077n;
            if (bxxk == null) {
                synchronized (bzhl.class) {
                    bxxk = f170077n;
                    if (bxxk == null) {
                        bxxk = new bxve(f170076m);
                        f170077n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
