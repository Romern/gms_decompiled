package p000;

/* renamed from: booz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class booz extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final booz f134072l;

    /* renamed from: m */
    private static volatile bxxk f134073m;

    /* renamed from: a */
    public long f134074a;

    /* renamed from: b */
    public int f134075b;

    /* renamed from: c */
    public int f134076c;

    /* renamed from: d */
    public String f134077d = "";

    /* renamed from: e */
    public String f134078e = "";

    /* renamed from: f */
    public int f134079f;

    /* renamed from: g */
    public bxyk f134080g;

    /* renamed from: h */
    public long f134081h;

    /* renamed from: i */
    public long f134082i;

    /* renamed from: j */
    public bxwc f134083j;

    /* renamed from: k */
    public int f134084k;

    static {
        booz booz = new booz();
        f134072l = booz;
        GeneratedMessageLite.m124024a(booz.class, booz);
    }

    private booz() {
        bxxn bxxn = bxxn.f165040b;
        this.f134083j = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f134072l, "\u0000\u000b\u0000\u0000\u0001\r\u000b\u0000\u0001\u0000\u0001\u0002\u0002\f\u0003\f\u0004Ȉ\u0005Ȉ\u0007\f\b\t\t\u0002\n\u0002\f\u001b\r\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", boov.class, "k"});
        } else if (i2 == 3) {
            return new booz();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f134072l;
            }
            bxxk bxxk = f134073m;
            if (bxxk == null) {
                synchronized (booz.class) {
                    bxxk = f134073m;
                    if (bxxk == null) {
                        bxxk = new bxve(f134072l);
                        f134073m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
