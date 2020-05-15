package p000;

/* renamed from: btju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btju extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btju f149180c;

    /* renamed from: d */
    private static volatile bxxk f149181d;

    /* renamed from: a */
    public String f149182a = "";

    /* renamed from: b */
    public String f149183b = "";

    static {
        btju btju = new btju();
        f149180c = btju;
        GeneratedMessageLite.m124024a(btju.class, btju);
    }

    private btju() {
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
            return GeneratedMessageLite.m124022a(f149180c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btju();
        } else {
            if (i2 == 4) {
                return new bxvd(f149180c);
            }
            if (i2 == 5) {
                return f149180c;
            }
            bxxk bxxk = f149181d;
            if (bxxk == null) {
                synchronized (btju.class) {
                    bxxk = f149181d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149180c);
                        f149181d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
