package p000;

/* renamed from: bqre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqre extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqre f141426b;

    /* renamed from: c */
    private static volatile bxxk f141427c;

    /* renamed from: a */
    public int f141428a;

    static {
        bqre bqre = new bqre();
        f141426b = bqre;
        GeneratedMessageLite.m124024a(bqre.class, bqre);
    }

    private bqre() {
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
            return GeneratedMessageLite.m124022a(f141426b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqre();
        } else {
            if (i2 == 4) {
                return new bxvd(f141426b);
            }
            if (i2 == 5) {
                return f141426b;
            }
            bxxk bxxk = f141427c;
            if (bxxk == null) {
                synchronized (bqre.class) {
                    bxxk = f141427c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141426b);
                        f141427c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
