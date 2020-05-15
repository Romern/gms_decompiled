package p000;

/* renamed from: btmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btmh f149485e;

    /* renamed from: f */
    private static volatile bxxk f149486f;

    /* renamed from: a */
    public btiy f149487a;

    /* renamed from: b */
    public bxtx f149488b = bxtx.f164797b;

    /* renamed from: c */
    public String f149489c = "";

    /* renamed from: d */
    public bxtx f149490d = bxtx.f164797b;

    static {
        btmh btmh = new btmh();
        f149485e = btmh;
        bxvk.m124024a(btmh.class, btmh);
    }

    private btmh() {
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
            return bxvk.m124022a(f149485e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\n\u0003Ȉ\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btmh();
        } else {
            if (i2 == 4) {
                return new bxvd(f149485e);
            }
            if (i2 == 5) {
                return f149485e;
            }
            bxxk bxxk = f149486f;
            if (bxxk == null) {
                synchronized (btmh.class) {
                    bxxk = f149486f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149485e);
                        f149486f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
