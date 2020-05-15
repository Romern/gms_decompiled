package p000;

/* renamed from: bvki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvki extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvki f156415c;

    /* renamed from: d */
    private static volatile bxxk f156416d;

    /* renamed from: a */
    public String f156417a = "";

    /* renamed from: b */
    public String f156418b = "";

    static {
        bvki bvki = new bvki();
        f156415c = bvki;
        GeneratedMessageLite.m124024a(bvki.class, bvki);
    }

    private bvki() {
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
            return GeneratedMessageLite.m124022a(f156415c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvki();
        } else {
            if (i2 == 4) {
                return new bxvd(f156415c);
            }
            if (i2 == 5) {
                return f156415c;
            }
            bxxk bxxk = f156416d;
            if (bxxk == null) {
                synchronized (bvki.class) {
                    bxxk = f156416d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156415c);
                        f156416d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
