package p000;

/* renamed from: cbjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbjg f177325a;

    /* renamed from: b */
    private static volatile bxxk f177326b;

    static {
        cbjg cbjg = new cbjg();
        f177325a = cbjg;
        GeneratedMessageLite.m124024a(cbjg.class, cbjg);
    }

    private cbjg() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f177325a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbjg();
        }
        if (i2 == 4) {
            return new bxvd(f177325a);
        }
        if (i2 == 5) {
            return f177325a;
        }
        bxxk bxxk = f177326b;
        if (bxxk == null) {
            synchronized (cbjg.class) {
                bxxk = f177326b;
                if (bxxk == null) {
                    bxxk = new bxve(f177325a);
                    f177326b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
