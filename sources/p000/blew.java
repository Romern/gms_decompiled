package p000;

/* renamed from: blew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blew extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final blew f126288f;

    /* renamed from: g */
    private static volatile bxxk f126289g;

    /* renamed from: a */
    public int f126290a;

    /* renamed from: b */
    public int f126291b = 1;

    /* renamed from: c */
    public bxvw f126292c;

    /* renamed from: d */
    public blec f126293d;

    /* renamed from: e */
    public bxwc f126294e;

    static {
        blew blew = new blew();
        f126288f = blew;
        GeneratedMessageLite.m124024a(blew.class, blew);
    }

    private blew() {
        bxxn bxxn = bxxn.f165040b;
        this.f126292c = bxwq.f165002b;
        bxvm bxvm = bxvm.f164965b;
        this.f126294e = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f126288f, "\u0001\u0004\u0000\u0001\u0006\u001c\u0004\u0000\u0002\u0000\u0006\u0014\u0016ဉ\u0007\u0019ဌ\u0000\u001c\u001b", new Object[]{"a", "c", "d", "b", blev.f126287a, "e", blds.class});
        } else if (i2 == 3) {
            return new blew();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f126288f;
            }
            bxxk bxxk = f126289g;
            if (bxxk == null) {
                synchronized (blew.class) {
                    bxxk = f126289g;
                    if (bxxk == null) {
                        bxxk = new bxve(f126288f);
                        f126289g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
