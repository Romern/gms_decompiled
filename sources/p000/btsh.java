package p000;

/* renamed from: btsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btsh f150206f;

    /* renamed from: h */
    private static volatile bxxk f150207h;

    /* renamed from: a */
    public int f150208a;

    /* renamed from: b */
    public btsf f150209b;

    /* renamed from: c */
    public btrw f150210c;

    /* renamed from: d */
    public btsb f150211d;

    /* renamed from: e */
    public String f150212e = "";

    /* renamed from: g */
    private byte f150213g = 2;

    static {
        btsh btsh = new btsh();
        f150206f = btsh;
        GeneratedMessageLite.m124024a(btsh.class, btsh);
    }

    private btsh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f150213g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f150213g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f150206f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0001\u0002ᐉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btsh();
        } else {
            if (i2 == 4) {
                return new bxvd(f150206f);
            }
            if (i2 == 5) {
                return f150206f;
            }
            bxxk bxxk = f150207h;
            if (bxxk == null) {
                synchronized (btsh.class) {
                    bxxk = f150207h;
                    if (bxxk == null) {
                        bxxk = new bxve(f150206f);
                        f150207h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
