package p000;

/* renamed from: btom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btom extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btom f149774c;

    /* renamed from: d */
    private static volatile bxxk f149775d;

    /* renamed from: a */
    public String f149776a = "";

    /* renamed from: b */
    public String f149777b = "";

    static {
        btom btom = new btom();
        f149774c = btom;
        GeneratedMessageLite.m124024a(btom.class, btom);
    }

    private btom() {
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
            return GeneratedMessageLite.m124022a(f149774c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btom();
        } else {
            if (i2 == 4) {
                return new bxvd(f149774c);
            }
            if (i2 == 5) {
                return f149774c;
            }
            bxxk bxxk = f149775d;
            if (bxxk == null) {
                synchronized (btom.class) {
                    bxxk = f149775d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149774c);
                        f149775d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
