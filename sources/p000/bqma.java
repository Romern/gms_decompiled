package p000;

/* renamed from: bqma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqma extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqma f141183c;

    /* renamed from: d */
    private static volatile bxxk f141184d;

    /* renamed from: a */
    public int f141185a;

    /* renamed from: b */
    public String f141186b = "";

    static {
        bqma bqma = new bqma();
        f141183c = bqma;
        bxvk.m124024a(bqma.class, bqma);
    }

    private bqma() {
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
            return bxvk.m124022a(f141183c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqma();
        } else {
            if (i2 == 4) {
                return new bxvd(f141183c);
            }
            if (i2 == 5) {
                return f141183c;
            }
            bxxk bxxk = f141184d;
            if (bxxk == null) {
                synchronized (bqma.class) {
                    bxxk = f141184d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141183c);
                        f141184d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
