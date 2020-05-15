package p000;

/* renamed from: bxzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxzx extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bxzx f165197j;

    /* renamed from: k */
    private static volatile bxxk f165198k;

    /* renamed from: a */
    public long f165199a;

    /* renamed from: b */
    public String f165200b = "";

    /* renamed from: c */
    public String f165201c = "";

    /* renamed from: d */
    public String f165202d = "";

    /* renamed from: e */
    public String f165203e = "";

    /* renamed from: f */
    public int f165204f;

    /* renamed from: g */
    public long f165205g;

    /* renamed from: h */
    public int f165206h;

    /* renamed from: i */
    public boolean f165207i;

    static {
        bxzx bxzx = new bxzx();
        f165197j = bxzx;
        GeneratedMessageLite.m124024a(bxzx.class, bxzx);
    }

    private bxzx() {
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
            return GeneratedMessageLite.m124022a(f165197j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007\u0002\b\u0004\t\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bxzx();
        } else {
            if (i2 == 4) {
                return new bxvd(f165197j);
            }
            if (i2 == 5) {
                return f165197j;
            }
            bxxk bxxk = f165198k;
            if (bxxk == null) {
                synchronized (bxzx.class) {
                    bxxk = f165198k;
                    if (bxxk == null) {
                        bxxk = new bxve(f165197j);
                        f165198k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
