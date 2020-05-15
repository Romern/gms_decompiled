package p000;

/* renamed from: byyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyh extends bxvg implements bxvh {

    /* renamed from: c */
    public static final byyh f168933c;

    /* renamed from: f */
    private static volatile bxxk f168934f;

    /* renamed from: a */
    public int f168935a;

    /* renamed from: b */
    public String f168936b = "";

    /* renamed from: d */
    private boolean f168937d;

    /* renamed from: e */
    private byte f168938e = 2;

    static {
        byyh byyh = new byyh();
        f168933c = byyh;
        bxvk.m124024a(byyh.class, byyh);
    }

    private byyh() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125517a(byyh byyh) {
        byyh.f168935a |= 1;
        byyh.f168937d = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168938e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168938e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f168933c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဈ\u0001", new Object[]{"a", "d", "b"});
        } else if (i2 == 3) {
            return new byyh();
        } else {
            if (i2 == 4) {
                return new bxvf(f168933c);
            }
            if (i2 == 5) {
                return f168933c;
            }
            bxxk bxxk = f168934f;
            if (bxxk == null) {
                synchronized (byyh.class) {
                    bxxk = f168934f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168933c);
                        f168934f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
