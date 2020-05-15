package p000;

/* renamed from: btvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvu extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btvu f152642a;

    /* renamed from: b */
    private static volatile bxxk f152643b;

    static {
        btvu btvu = new btvu();
        f152642a = btvu;
        GeneratedMessageLite.m124024a(btvu.class, btvu);
    }

    private btvu() {
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
            return GeneratedMessageLite.m124022a(f152642a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btvu();
        }
        if (i2 == 4) {
            return new bxvd(f152642a);
        }
        if (i2 == 5) {
            return f152642a;
        }
        bxxk bxxk = f152643b;
        if (bxxk == null) {
            synchronized (btvu.class) {
                bxxk = f152643b;
                if (bxxk == null) {
                    bxxk = new bxve(f152642a);
                    f152643b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
