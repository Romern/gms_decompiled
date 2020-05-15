package p000;

/* renamed from: kzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxvu f25444c = new kze();

    /* renamed from: d */
    public static final kzf f25445d;

    /* renamed from: e */
    private static volatile bxxk f25446e;

    /* renamed from: a */
    public int f25447a;

    /* renamed from: b */
    public bxvt f25448b = bxvm.f164965b;

    static {
        kzf kzf = new kzf();
        f25445d = kzf;
        GeneratedMessageLite.m124024a(kzf.class, kzf);
    }

    private kzf() {
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
            return GeneratedMessageLite.m124022a(f25445d, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0006\u0002,", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kzf();
        } else {
            if (i2 == 4) {
                return new bxvd(f25445d);
            }
            if (i2 == 5) {
                return f25445d;
            }
            bxxk bxxk = f25446e;
            if (bxxk == null) {
                synchronized (kzf.class) {
                    bxxk = f25446e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25445d);
                        f25446e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
