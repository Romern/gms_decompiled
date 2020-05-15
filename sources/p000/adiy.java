package p000;

/* renamed from: adiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adiy extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final adiy f61854f;

    /* renamed from: g */
    private static volatile bxxk f61855g;

    /* renamed from: a */
    public String f61856a = "";

    /* renamed from: b */
    public String f61857b = "";

    /* renamed from: c */
    public int f61858c;

    /* renamed from: d */
    public int f61859d;

    /* renamed from: e */
    public boolean f61860e;

    static {
        adiy adiy = new adiy();
        f61854f = adiy;
        GeneratedMessageLite.m124024a(adiy.class, adiy);
    }

    private adiy() {
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
            return GeneratedMessageLite.m124022a(f61854f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0007\u0005\u0004", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new adiy();
        } else {
            if (i2 == 4) {
                return new bxvd(f61854f);
            }
            if (i2 == 5) {
                return f61854f;
            }
            bxxk bxxk = f61855g;
            if (bxxk == null) {
                synchronized (adiy.class) {
                    bxxk = f61855g;
                    if (bxxk == null) {
                        bxxk = new bxve(f61854f);
                        f61855g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
