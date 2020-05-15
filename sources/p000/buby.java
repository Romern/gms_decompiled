package p000;

/* renamed from: buby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buby extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final buby f153299h;

    /* renamed from: i */
    private static volatile bxxk f153300i;

    /* renamed from: a */
    public int f153301a;

    /* renamed from: b */
    public long f153302b;

    /* renamed from: c */
    public bxwc f153303c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f153304d = bxxn.f165040b;

    /* renamed from: e */
    public int f153305e;

    /* renamed from: f */
    public bubz f153306f;

    /* renamed from: g */
    public bucj f153307g;

    static {
        buby buby = new buby();
        f153299h = buby;
        GeneratedMessageLite.m124024a(buby.class, buby);
    }

    private buby() {
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
            return GeneratedMessageLite.m124022a(f153299h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဃ\u0000\u0002\u001b\u0003\u001b\u0004ဌ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"a", "b", "c", bucc.class, "d", buca.class, "e", bubx.m119310b(), "f", "g"});
        } else if (i2 == 3) {
            return new buby();
        } else {
            if (i2 == 4) {
                return new bxvd(f153299h);
            }
            if (i2 == 5) {
                return f153299h;
            }
            bxxk bxxk = f153300i;
            if (bxxk == null) {
                synchronized (buby.class) {
                    bxxk = f153300i;
                    if (bxxk == null) {
                        bxxk = new bxve(f153299h);
                        f153300i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
