package p000;

/* renamed from: bpwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwx extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpwx f139583f;

    /* renamed from: g */
    private static volatile bxxk f139584g;

    /* renamed from: a */
    public int f139585a;

    /* renamed from: b */
    public String f139586b = "";

    /* renamed from: c */
    public long f139587c;

    /* renamed from: d */
    public long f139588d;

    /* renamed from: e */
    public int f139589e;

    static {
        bpwx bpwx = new bpwx();
        f139583f = bpwx;
        GeneratedMessageLite.m124024a(bpwx.class, bpwx);
    }

    private bpwx() {
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
            return GeneratedMessageLite.m124022a(f139583f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpwx();
        } else {
            if (i2 == 4) {
                return new bxvd(f139583f);
            }
            if (i2 == 5) {
                return f139583f;
            }
            bxxk bxxk = f139584g;
            if (bxxk == null) {
                synchronized (bpwx.class) {
                    bxxk = f139584g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139583f);
                        f139584g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
