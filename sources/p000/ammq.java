package p000;

/* renamed from: ammq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammq extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final ammq f75359l;

    /* renamed from: m */
    private static volatile bxxk f75360m;

    /* renamed from: a */
    public int f75361a;

    /* renamed from: b */
    public amnw f75362b;

    /* renamed from: c */
    public int f75363c;

    /* renamed from: d */
    public long f75364d;

    /* renamed from: e */
    public boolean f75365e;

    /* renamed from: f */
    public boolean f75366f;

    /* renamed from: g */
    public boolean f75367g;

    /* renamed from: h */
    public boolean f75368h;

    /* renamed from: i */
    public boolean f75369i;

    /* renamed from: j */
    public String f75370j = "";

    /* renamed from: k */
    public boolean f75371k;

    static {
        ammq ammq = new ammq();
        f75359l = ammq;
        GeneratedMessageLite.m124024a(ammq.class, ammq);
    }

    private ammq() {
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
            return GeneratedMessageLite.m124022a(f75359l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0006\u0007ဇ\u0005\bဇ\u0007\tဈ\b\nဇ\t", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g", "i", "j", "k"});
        } else if (i2 == 3) {
            return new ammq();
        } else {
            if (i2 == 4) {
                return new bxvd(f75359l);
            }
            if (i2 == 5) {
                return f75359l;
            }
            bxxk bxxk = f75360m;
            if (bxxk == null) {
                synchronized (ammq.class) {
                    bxxk = f75360m;
                    if (bxxk == null) {
                        bxxk = new bxve(f75359l);
                        f75360m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
