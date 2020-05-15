package p000;

/* renamed from: butu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butu extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final butu f154874f;

    /* renamed from: g */
    private static volatile bxxk f154875g;

    /* renamed from: a */
    public int f154876a;

    /* renamed from: b */
    public String f154877b = "";

    /* renamed from: c */
    public String f154878c = "";

    /* renamed from: d */
    public int f154879d;

    /* renamed from: e */
    public int f154880e;

    static {
        butu butu = new butu();
        f154874f = butu;
        GeneratedMessageLite.m124024a(butu.class, butu);
    }

    private butu() {
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
            return GeneratedMessageLite.m124022a(f154874f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new butu();
        } else {
            if (i2 == 4) {
                return new bxvd(f154874f);
            }
            if (i2 == 5) {
                return f154874f;
            }
            bxxk bxxk = f154875g;
            if (bxxk == null) {
                synchronized (butu.class) {
                    bxxk = f154875g;
                    if (bxxk == null) {
                        bxxk = new bxve(f154874f);
                        f154875g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
