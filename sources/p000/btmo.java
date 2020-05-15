package p000;

/* renamed from: btmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btmo f149520c;

    /* renamed from: d */
    private static volatile bxxk f149521d;

    /* renamed from: a */
    public String f149522a = "";

    /* renamed from: b */
    public String f149523b = "";

    static {
        btmo btmo = new btmo();
        f149520c = btmo;
        GeneratedMessageLite.m124024a(btmo.class, btmo);
    }

    private btmo() {
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
            return GeneratedMessageLite.m124022a(f149520c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btmo();
        } else {
            if (i2 == 4) {
                return new bxvd(f149520c);
            }
            if (i2 == 5) {
                return f149520c;
            }
            bxxk bxxk = f149521d;
            if (bxxk == null) {
                synchronized (btmo.class) {
                    bxxk = f149521d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149520c);
                        f149521d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
