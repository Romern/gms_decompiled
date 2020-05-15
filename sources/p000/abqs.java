package p000;

/* renamed from: abqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqs extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final abqs f58008c;

    /* renamed from: d */
    private static volatile bxxk f58009d;

    /* renamed from: a */
    public String f58010a = "";

    /* renamed from: b */
    public String f58011b = "";

    static {
        abqs abqs = new abqs();
        f58008c = abqs;
        GeneratedMessageLite.m124024a(abqs.class, abqs);
    }

    private abqs() {
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
            return GeneratedMessageLite.m124022a(f58008c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new abqs();
        } else {
            if (i2 == 4) {
                return new bxvd(f58008c);
            }
            if (i2 == 5) {
                return f58008c;
            }
            bxxk bxxk = f58009d;
            if (bxxk == null) {
                synchronized (abqs.class) {
                    bxxk = f58009d;
                    if (bxxk == null) {
                        bxxk = new bxve(f58008c);
                        f58009d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
