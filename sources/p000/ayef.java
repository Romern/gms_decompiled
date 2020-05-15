package p000;

/* renamed from: ayef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayef extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final ayef f97291e;

    /* renamed from: g */
    private static volatile bxxk f97292g;

    /* renamed from: a */
    public int f97293a;

    /* renamed from: b */
    public String f97294b = "";

    /* renamed from: c */
    public ayee f97295c;

    /* renamed from: d */
    public int f97296d = 1;

    /* renamed from: f */
    private byte f97297f = 2;

    static {
        ayef ayef = new ayef();
        f97291e = ayef;
        GeneratedMessageLite.m124024a(ayef.class, ayef);
    }

    private ayef() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97297f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97297f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f97291e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔉ\u0001\u0003ᔌ\u0002", new Object[]{"a", "b", "c", "d", ayed.f97285a});
        } else if (i2 == 3) {
            return new ayef();
        } else {
            if (i2 == 4) {
                return new bxvd(f97291e);
            }
            if (i2 == 5) {
                return f97291e;
            }
            bxxk bxxk = f97292g;
            if (bxxk == null) {
                synchronized (ayef.class) {
                    bxxk = f97292g;
                    if (bxxk == null) {
                        bxxk = new bxve(f97291e);
                        f97292g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
