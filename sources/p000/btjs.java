package p000;

/* renamed from: btjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjs extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btjs f149175a;

    /* renamed from: b */
    private static volatile bxxk f149176b;

    static {
        btjs btjs = new btjs();
        f149175a = btjs;
        GeneratedMessageLite.m124024a(btjs.class, btjs);
    }

    private btjs() {
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
            return GeneratedMessageLite.m124022a(f149175a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btjs();
        }
        if (i2 == 4) {
            return new bxvd(f149175a);
        }
        if (i2 == 5) {
            return f149175a;
        }
        bxxk bxxk = f149176b;
        if (bxxk == null) {
            synchronized (btjs.class) {
                bxxk = f149176b;
                if (bxxk == null) {
                    bxxk = new bxve(f149175a);
                    f149176b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
