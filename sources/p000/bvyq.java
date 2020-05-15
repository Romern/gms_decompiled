package p000;

/* renamed from: bvyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyq extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bvyq f158199j;

    /* renamed from: k */
    private static volatile bxxk f158200k;

    /* renamed from: a */
    public int f158201a;

    /* renamed from: b */
    public long f158202b;

    /* renamed from: c */
    public int f158203c;

    /* renamed from: d */
    public int f158204d;

    /* renamed from: e */
    public boolean f158205e;

    /* renamed from: f */
    public int f158206f;

    /* renamed from: g */
    public bvyr f158207g;

    /* renamed from: h */
    public String f158208h = "";

    /* renamed from: i */
    public int f158209i;

    static {
        bvyq bvyq = new bvyq();
        f158199j = bvyq;
        GeneratedMessageLite.m124024a(bvyq.class, bvyq);
    }

    private bvyq() {
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
            return GeneratedMessageLite.m124022a(f158199j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဏ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဌ\u0007", new Object[]{"a", "b", "c", "d", bvyo.f158198a, "e", "f", "g", "h", "i", bvyn.f158197a});
        } else if (i2 == 3) {
            return new bvyq();
        } else {
            if (i2 == 4) {
                return new bxvd(f158199j);
            }
            if (i2 == 5) {
                return f158199j;
            }
            bxxk bxxk = f158200k;
            if (bxxk == null) {
                synchronized (bvyq.class) {
                    bxxk = f158200k;
                    if (bxxk == null) {
                        bxxk = new bxve(f158199j);
                        f158200k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
