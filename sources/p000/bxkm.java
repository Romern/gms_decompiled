package p000;

/* renamed from: bxkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxkm f163763d;

    /* renamed from: e */
    private static volatile bxxk f163764e;

    /* renamed from: a */
    public int f163765a;

    /* renamed from: b */
    public String f163766b = "";

    /* renamed from: c */
    public String f163767c = "";

    static {
        bxkm bxkm = new bxkm();
        f163763d = bxkm;
        GeneratedMessageLite.m124024a(bxkm.class, bxkm);
    }

    private bxkm() {
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
            return GeneratedMessageLite.m124022a(f163763d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxkm();
        } else {
            if (i2 == 4) {
                return new bxvd(f163763d);
            }
            if (i2 == 5) {
                return f163763d;
            }
            bxxk bxxk = f163764e;
            if (bxxk == null) {
                synchronized (bxkm.class) {
                    bxxk = f163764e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163763d);
                        f163764e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
