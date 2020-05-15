package p000;

/* renamed from: byli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byli extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final byli f166837f;

    /* renamed from: h */
    private static volatile bxxk f166838h;

    /* renamed from: a */
    public int f166839a;

    /* renamed from: b */
    public String f166840b = "";

    /* renamed from: c */
    public String f166841c = "";

    /* renamed from: d */
    public String f166842d = "";

    /* renamed from: e */
    public String f166843e = "";

    /* renamed from: g */
    private byte f166844g = 2;

    static {
        byli byli = new byli();
        f166837f = byli;
        GeneratedMessageLite.m124024a(byli.class, byli);
    }

    private byli() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166844g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166844g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f166837f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byli();
        } else {
            if (i2 == 4) {
                return new bxvd(f166837f);
            }
            if (i2 == 5) {
                return f166837f;
            }
            bxxk bxxk = f166838h;
            if (bxxk == null) {
                synchronized (byli.class) {
                    bxxk = f166838h;
                    if (bxxk == null) {
                        bxxk = new bxve(f166837f);
                        f166838h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
