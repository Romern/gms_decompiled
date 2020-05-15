package p000;

/* renamed from: bwsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwsr f160910b;

    /* renamed from: c */
    public static final bxvj f160911c;

    /* renamed from: e */
    private static volatile bxxk f160912e;

    /* renamed from: a */
    public int f160913a;

    /* renamed from: d */
    private int f160914d;

    static {
        bwsr bwsr = new bwsr();
        f160910b = bwsr;
        GeneratedMessageLite.m124024a(bwsr.class, bwsr);
        bwny bwny = bwny.f160414k;
        bwsr bwsr2 = f160910b;
        f160911c = GeneratedMessageLite.m124006a(bwny, bwsr2, bwsr2, 297159458, bxzf.MESSAGE);
    }

    private bwsr() {
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
            return GeneratedMessageLite.m124022a(f160910b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "a"});
        } else if (i2 == 3) {
            return new bwsr();
        } else {
            if (i2 == 4) {
                return new bxvd(f160910b);
            }
            if (i2 == 5) {
                return f160910b;
            }
            bxxk bxxk = f160912e;
            if (bxxk == null) {
                synchronized (bwsr.class) {
                    bxxk = f160912e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160910b);
                        f160912e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
