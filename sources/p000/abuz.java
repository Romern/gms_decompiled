package p000;

/* renamed from: abuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final abuz f58503b;

    /* renamed from: c */
    private static volatile bxxk f58504c;

    /* renamed from: a */
    public String f58505a = "";

    static {
        abuz abuz = new abuz();
        f58503b = abuz;
        GeneratedMessageLite.m124024a(abuz.class, abuz);
    }

    private abuz() {
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
            return GeneratedMessageLite.m124022a(f58503b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new abuz();
        } else {
            if (i2 == 4) {
                return new bxvd(f58503b);
            }
            if (i2 == 5) {
                return f58503b;
            }
            bxxk bxxk = f58504c;
            if (bxxk == null) {
                synchronized (abuz.class) {
                    bxxk = f58504c;
                    if (bxxk == null) {
                        bxxk = new bxve(f58503b);
                        f58504c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
