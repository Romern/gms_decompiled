package p000;

/* renamed from: ahyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahyx extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final ahyx f68417f;

    /* renamed from: g */
    private static volatile bxxk f68418g;

    /* renamed from: a */
    public int f68419a;

    /* renamed from: b */
    public String f68420b = "";

    /* renamed from: c */
    public bvkr f68421c;

    /* renamed from: d */
    public long f68422d;

    /* renamed from: e */
    public boolean f68423e;

    static {
        ahyx ahyx = new ahyx();
        f68417f = ahyx;
        GeneratedMessageLite.m124024a(ahyx.class, ahyx);
    }

    private ahyx() {
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
            return GeneratedMessageLite.m124022a(f68417f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ahyx();
        } else {
            if (i2 == 4) {
                return new bxvd(f68417f);
            }
            if (i2 == 5) {
                return f68417f;
            }
            bxxk bxxk = f68418g;
            if (bxxk == null) {
                synchronized (ahyx.class) {
                    bxxk = f68418g;
                    if (bxxk == null) {
                        bxxk = new bxve(f68417f);
                        f68418g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
