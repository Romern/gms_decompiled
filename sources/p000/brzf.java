package p000;

/* renamed from: brzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brzf f143727c;

    /* renamed from: d */
    private static volatile bxxk f143728d;

    /* renamed from: a */
    public int f143729a;

    /* renamed from: b */
    public int f143730b;

    static {
        brzf brzf = new brzf();
        f143727c = brzf;
        GeneratedMessageLite.m124024a(brzf.class, brzf);
    }

    private brzf() {
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
            return GeneratedMessageLite.m124022a(f143727c, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဌ\u0000", new Object[]{"a", "b", brze.f143726a});
        } else if (i2 == 3) {
            return new brzf();
        } else {
            if (i2 == 4) {
                return new bxvd(f143727c);
            }
            if (i2 == 5) {
                return f143727c;
            }
            bxxk bxxk = f143728d;
            if (bxxk == null) {
                synchronized (brzf.class) {
                    bxxk = f143728d;
                    if (bxxk == null) {
                        bxxk = new bxve(f143727c);
                        f143728d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
