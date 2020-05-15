package p000;

/* renamed from: bpio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpio extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpio f137781f;

    /* renamed from: g */
    private static volatile bxxk f137782g;

    /* renamed from: a */
    public int f137783a;

    /* renamed from: b */
    public int f137784b;

    /* renamed from: c */
    public int f137785c;

    /* renamed from: d */
    public int f137786d;

    /* renamed from: e */
    public int f137787e = -1;

    static {
        bpio bpio = new bpio();
        f137781f = bpio;
        GeneratedMessageLite.m124024a(bpio.class, bpio);
    }

    private bpio() {
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
            return GeneratedMessageLite.m124022a(f137781f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", bpim.f137780a, "d", bphy.f137713a, "e"});
        } else if (i2 == 3) {
            return new bpio();
        } else {
            if (i2 == 4) {
                return new bxvd(f137781f);
            }
            if (i2 == 5) {
                return f137781f;
            }
            bxxk bxxk = f137782g;
            if (bxxk == null) {
                synchronized (bpio.class) {
                    bxxk = f137782g;
                    if (bxxk == null) {
                        bxxk = new bxve(f137781f);
                        f137782g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
