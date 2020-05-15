package p000;

/* renamed from: brbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final brbx f142330e;

    /* renamed from: f */
    private static volatile bxxk f142331f;

    /* renamed from: a */
    public int f142332a;

    /* renamed from: b */
    public brak f142333b;

    /* renamed from: c */
    public bxwc f142334c = bxxn.f165040b;

    /* renamed from: d */
    public String f142335d = "";

    static {
        brbx brbx = new brbx();
        f142330e = brbx;
        GeneratedMessageLite.m124024a(brbx.class, brbx);
    }

    private brbx() {
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
            return GeneratedMessageLite.m124022a(f142330e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "b", "c", brbw.class, "d"});
        } else if (i2 == 3) {
            return new brbx();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f142330e;
            }
            bxxk bxxk = f142331f;
            if (bxxk == null) {
                synchronized (brbx.class) {
                    bxxk = f142331f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142330e);
                        f142331f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
