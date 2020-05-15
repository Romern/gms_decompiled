package p000;

/* renamed from: bqkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqkz f141066c;

    /* renamed from: d */
    private static volatile bxxk f141067d;

    /* renamed from: a */
    public bqli f141068a;

    /* renamed from: b */
    public bxwc f141069b = bxxn.f165040b;

    static {
        bqkz bqkz = new bqkz();
        f141066c = bqkz;
        GeneratedMessageLite.m124024a(bqkz.class, bqkz);
    }

    private bqkz() {
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
            return GeneratedMessageLite.m124022a(f141066c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", bqlc.class});
        } else if (i2 == 3) {
            return new bqkz();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f141066c;
            }
            bxxk bxxk = f141067d;
            if (bxxk == null) {
                synchronized (bqkz.class) {
                    bxxk = f141067d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141066c);
                        f141067d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
