package p000;

/* renamed from: bpsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsu extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpsu f139013e;

    /* renamed from: g */
    private static volatile bxxk f139014g;

    /* renamed from: a */
    public int f139015a;

    /* renamed from: b */
    public String f139016b = "";

    /* renamed from: c */
    public String f139017c = "";

    /* renamed from: d */
    public long f139018d;

    /* renamed from: f */
    private byte f139019f = 2;

    static {
        bpsu bpsu = new bpsu();
        f139013e = bpsu;
        GeneratedMessageLite.m124024a(bpsu.class, bpsu);
    }

    private bpsu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139019f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139019f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f139013e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpsu();
        } else {
            if (i2 == 4) {
                return new bxvd(f139013e);
            }
            if (i2 == 5) {
                return f139013e;
            }
            bxxk bxxk = f139014g;
            if (bxxk == null) {
                synchronized (bpsu.class) {
                    bxxk = f139014g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139013e);
                        f139014g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
