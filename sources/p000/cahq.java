package p000;

/* renamed from: cahq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahq extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cahq f174586f;

    /* renamed from: g */
    private static volatile bxxk f174587g;

    /* renamed from: a */
    public int f174588a;

    /* renamed from: b */
    public String f174589b = "";

    /* renamed from: c */
    public String f174590c = "";

    /* renamed from: d */
    public int f174591d;

    /* renamed from: e */
    public boolean f174592e;

    static {
        cahq cahq = new cahq();
        f174586f = cahq;
        GeneratedMessageLite.m124024a(cahq.class, cahq);
    }

    private cahq() {
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
            return GeneratedMessageLite.m124022a(f174586f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cahq();
        } else {
            if (i2 == 4) {
                return new bxvd(f174586f);
            }
            if (i2 == 5) {
                return f174586f;
            }
            bxxk bxxk = f174587g;
            if (bxxk == null) {
                synchronized (cahq.class) {
                    bxxk = f174587g;
                    if (bxxk == null) {
                        bxxk = new bxve(f174586f);
                        f174587g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
