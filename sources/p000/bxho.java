package p000;

/* renamed from: bxho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxho extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxho f163438f;

    /* renamed from: g */
    private static volatile bxxk f163439g;

    /* renamed from: a */
    public int f163440a;

    /* renamed from: b */
    public String f163441b = "";

    /* renamed from: c */
    public String f163442c = "";

    /* renamed from: d */
    public long f163443d;

    /* renamed from: e */
    public String f163444e = "";

    static {
        bxho bxho = new bxho();
        f163438f = bxho;
        GeneratedMessageLite.m124024a(bxho.class, bxho);
    }

    private bxho() {
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
            return GeneratedMessageLite.m124022a(f163438f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bxho();
        } else {
            if (i2 == 4) {
                return new bxvd(f163438f);
            }
            if (i2 == 5) {
                return f163438f;
            }
            bxxk bxxk = f163439g;
            if (bxxk == null) {
                synchronized (bxho.class) {
                    bxxk = f163439g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163438f);
                        f163439g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
