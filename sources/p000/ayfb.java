package p000;

/* renamed from: ayfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final ayfb f97441e;

    /* renamed from: g */
    private static volatile bxxk f97442g;

    /* renamed from: a */
    public int f97443a;

    /* renamed from: b */
    public String f97444b = "";

    /* renamed from: c */
    public ayeb f97445c;

    /* renamed from: d */
    public ByteString f97446d = ByteString.f164797b;

    /* renamed from: f */
    private byte f97447f = 2;

    static {
        ayfb ayfb = new ayfb();
        f97441e = ayfb;
        GeneratedMessageLite.m124024a(ayfb.class, ayfb);
    }

    private ayfb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97447f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97447f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f97441e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ည\u0002\u0003ᐉ\u0001", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new ayfb();
        } else {
            if (i2 == 4) {
                return new bxvd(f97441e);
            }
            if (i2 == 5) {
                return f97441e;
            }
            bxxk bxxk = f97442g;
            if (bxxk == null) {
                synchronized (ayfb.class) {
                    bxxk = f97442g;
                    if (bxxk == null) {
                        bxxk = new bxve(f97441e);
                        f97442g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
