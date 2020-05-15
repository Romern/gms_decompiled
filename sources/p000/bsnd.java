package p000;

/* renamed from: bsnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnd extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsnd f146232a;

    /* renamed from: b */
    private static volatile bxxk f146233b;

    static {
        bsnd bsnd = new bsnd();
        f146232a = bsnd;
        GeneratedMessageLite.m124024a(bsnd.class, bsnd);
    }

    private bsnd() {
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
            return GeneratedMessageLite.m124022a(f146232a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsnd();
        }
        if (i2 == 4) {
            return new bxvd(f146232a);
        }
        if (i2 == 5) {
            return f146232a;
        }
        bxxk bxxk = f146233b;
        if (bxxk == null) {
            synchronized (bsnd.class) {
                bxxk = f146233b;
                if (bxxk == null) {
                    bxxk = new bxve(f146232a);
                    f146233b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
