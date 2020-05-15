package p000;

/* renamed from: bsah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsah extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bsah f143839f;

    /* renamed from: h */
    private static volatile bxxk f143840h;

    /* renamed from: a */
    public String f143841a = "";

    /* renamed from: b */
    public int f143842b;

    /* renamed from: c */
    public String f143843c = "";

    /* renamed from: d */
    public String f143844d = "";

    /* renamed from: e */
    public String f143845e = "";

    /* renamed from: g */
    private int f143846g;

    static {
        bsah bsah = new bsah();
        f143839f = bsah;
        GeneratedMessageLite.m124024a(bsah.class, bsah);
    }

    private bsah() {
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
            return GeneratedMessageLite.m124022a(f143839f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0005", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsah();
        } else {
            if (i2 == 4) {
                return new bxvd(f143839f);
            }
            if (i2 == 5) {
                return f143839f;
            }
            bxxk bxxk = f143840h;
            if (bxxk == null) {
                synchronized (bsah.class) {
                    bxxk = f143840h;
                    if (bxxk == null) {
                        bxxk = new bxve(f143839f);
                        f143840h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
