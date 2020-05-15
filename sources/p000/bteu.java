package p000;

/* renamed from: bteu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bteu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bteu f148568d;

    /* renamed from: f */
    private static volatile bxxk f148569f;

    /* renamed from: a */
    public String f148570a = "";

    /* renamed from: b */
    public String f148571b = "";

    /* renamed from: c */
    public btec f148572c;

    /* renamed from: e */
    private byte f148573e = 2;

    static {
        bteu bteu = new bteu();
        f148568d = bteu;
        GeneratedMessageLite.m124024a(bteu.class, bteu);
    }

    private bteu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148573e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148573e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f148568d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003Љ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bteu();
        } else {
            if (i2 == 4) {
                return new bxvd(f148568d);
            }
            if (i2 == 5) {
                return f148568d;
            }
            bxxk bxxk = f148569f;
            if (bxxk == null) {
                synchronized (bteu.class) {
                    bxxk = f148569f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148568d);
                        f148569f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
