package p000;

/* renamed from: bsaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsaf extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsaf f143836a;

    /* renamed from: b */
    private static volatile bxxk f143837b;

    static {
        bsaf bsaf = new bsaf();
        f143836a = bsaf;
        GeneratedMessageLite.m124024a(bsaf.class, bsaf);
    }

    private bsaf() {
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
            return GeneratedMessageLite.m124022a(f143836a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsaf();
        }
        if (i2 == 4) {
            return new bxvd(f143836a);
        }
        if (i2 == 5) {
            return f143836a;
        }
        bxxk bxxk = f143837b;
        if (bxxk == null) {
            synchronized (bsaf.class) {
                bxxk = f143837b;
                if (bxxk == null) {
                    bxxk = new bxve(f143836a);
                    f143837b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
