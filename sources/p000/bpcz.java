package p000;

/* renamed from: bpcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpcz f135895c;

    /* renamed from: d */
    private static volatile bxxk f135896d;

    /* renamed from: a */
    public int f135897a;

    /* renamed from: b */
    public String f135898b = "";

    static {
        bpcz bpcz = new bpcz();
        f135895c = bpcz;
        bxvk.m124024a(bpcz.class, bpcz);
    }

    private bpcz() {
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
            return bxvk.m124022a(f135895c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpcz();
        } else {
            if (i2 == 4) {
                return new bxvd(f135895c);
            }
            if (i2 == 5) {
                return f135895c;
            }
            bxxk bxxk = f135896d;
            if (bxxk == null) {
                synchronized (bpcz.class) {
                    bxxk = f135896d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135895c);
                        f135896d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
