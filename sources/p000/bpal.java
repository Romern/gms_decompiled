package p000;

/* renamed from: bpal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpal extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpal f135491d;

    /* renamed from: e */
    private static volatile bxxk f135492e;

    /* renamed from: a */
    public int f135493a;

    /* renamed from: b */
    public int f135494b;

    /* renamed from: c */
    public int f135495c;

    static {
        bpal bpal = new bpal();
        f135491d = bpal;
        GeneratedMessageLite.m124024a(bpal.class, bpal);
    }

    private bpal() {
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
            return GeneratedMessageLite.m124022a(f135491d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", bpak.f135490a, "c"});
        } else if (i2 == 3) {
            return new bpal();
        } else {
            if (i2 == 4) {
                return new bxvd(f135491d);
            }
            if (i2 == 5) {
                return f135491d;
            }
            bxxk bxxk = f135492e;
            if (bxxk == null) {
                synchronized (bpal.class) {
                    bxxk = f135492e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135491d);
                        f135492e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
