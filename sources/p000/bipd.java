package p000;

/* renamed from: bipd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bipd f121143d;

    /* renamed from: f */
    private static volatile bxxk f121144f;

    /* renamed from: a */
    public int f121145a;

    /* renamed from: b */
    public String f121146b = "";

    /* renamed from: c */
    public int f121147c = -1;

    /* renamed from: e */
    private byte f121148e = 2;

    static {
        bipd bipd = new bipd();
        f121143d = bipd;
        GeneratedMessageLite.m124024a(bipd.class, bipd);
    }

    private bipd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121148e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121148e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121143d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔌ\u0001", new Object[]{"a", "b", "c", bipc.m102688b()});
        } else if (i2 == 3) {
            return new bipd();
        } else {
            if (i2 == 4) {
                return new bxvd(f121143d);
            }
            if (i2 == 5) {
                return f121143d;
            }
            bxxk bxxk = f121144f;
            if (bxxk == null) {
                synchronized (bipd.class) {
                    bxxk = f121144f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121143d);
                        f121144f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
