package p000;

/* renamed from: abdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final abdg f57085a;

    /* renamed from: b */
    private static volatile bxxk f57086b;

    static {
        abdg abdg = new abdg();
        f57085a = abdg;
        GeneratedMessageLite.m124024a(abdg.class, abdg);
    }

    private abdg() {
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
            return GeneratedMessageLite.m124022a(f57085a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abdg();
        }
        if (i2 == 4) {
            return new bxvd(f57085a);
        }
        if (i2 == 5) {
            return f57085a;
        }
        bxxk bxxk = f57086b;
        if (bxxk == null) {
            synchronized (abdg.class) {
                bxxk = f57086b;
                if (bxxk == null) {
                    bxxk = new bxve(f57085a);
                    f57086b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
