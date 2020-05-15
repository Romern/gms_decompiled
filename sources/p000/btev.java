package p000;

/* renamed from: btev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btev extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final btev f148574h;

    /* renamed from: j */
    private static volatile bxxk f148575j;

    /* renamed from: a */
    public String f148576a = "";

    /* renamed from: b */
    public bler f148577b;

    /* renamed from: c */
    public bxuw f148578c;

    /* renamed from: d */
    public int f148579d;

    /* renamed from: e */
    public boolean f148580e;

    /* renamed from: f */
    public bxwc f148581f;

    /* renamed from: g */
    public btcz f148582g;

    /* renamed from: i */
    private byte f148583i = 2;

    static {
        btev btev = new btev();
        f148574h = btev;
        GeneratedMessageLite.m124024a(btev.class, btev);
    }

    private btev() {
        bxvm bxvm = bxvm.f164965b;
        this.f148581f = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148583i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148583i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f148574h, "\u0000\u0007\u0000\u0000\u0001\r\u0007\u0000\u0001\u0001\u0001Ȉ\u0002Љ\u0003\t\u0004\f\b\u0007\u000bȚ\r\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new btev();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f148574h;
            }
            bxxk bxxk = f148575j;
            if (bxxk == null) {
                synchronized (btev.class) {
                    bxxk = f148575j;
                    if (bxxk == null) {
                        bxxk = new bxve(f148574h);
                        f148575j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
