package p000;

/* renamed from: bypj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bypj f167346f;

    /* renamed from: g */
    private static volatile bxxk f167347g;

    /* renamed from: a */
    public int f167348a;

    /* renamed from: b */
    public long f167349b;

    /* renamed from: c */
    public boolean f167350c;

    /* renamed from: d */
    public int f167351d = -1;

    /* renamed from: e */
    public byok f167352e;

    static {
        bypj bypj = new bypj();
        f167346f = bypj;
        GeneratedMessageLite.m124024a(bypj.class, bypj);
    }

    private bypj() {
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
            return GeneratedMessageLite.m124022a(f167346f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", bypi.f167345a, "e"});
        } else if (i2 == 3) {
            return new bypj();
        } else {
            if (i2 == 4) {
                return new bxvd(f167346f);
            }
            if (i2 == 5) {
                return f167346f;
            }
            bxxk bxxk = f167347g;
            if (bxxk == null) {
                synchronized (bypj.class) {
                    bxxk = f167347g;
                    if (bxxk == null) {
                        bxxk = new bxve(f167346f);
                        f167347g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
