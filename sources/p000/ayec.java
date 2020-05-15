package p000;

/* renamed from: ayec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayec extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ayec f97279d;

    /* renamed from: f */
    private static volatile bxxk f97280f;

    /* renamed from: a */
    public int f97281a;

    /* renamed from: b */
    public String f97282b = "";

    /* renamed from: c */
    public String f97283c = "";

    /* renamed from: e */
    private byte f97284e = 2;

    static {
        ayec ayec = new ayec();
        f97279d = ayec;
        GeneratedMessageLite.m124024a(ayec.class, ayec);
    }

    private ayec() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97284e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97284e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f97279d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ayec();
        } else {
            if (i2 == 4) {
                return new bxvd(f97279d);
            }
            if (i2 == 5) {
                return f97279d;
            }
            bxxk bxxk = f97280f;
            if (bxxk == null) {
                synchronized (ayec.class) {
                    bxxk = f97280f;
                    if (bxxk == null) {
                        bxxk = new bxve(f97279d);
                        f97280f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
