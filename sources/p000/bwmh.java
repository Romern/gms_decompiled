package p000;

/* renamed from: bwmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwmh f160270d;

    /* renamed from: g */
    private static volatile bxxk f160271g;

    /* renamed from: a */
    public bwmj f160272a;

    /* renamed from: b */
    public ByteString f160273b;

    /* renamed from: c */
    public bxwc f160274c;

    /* renamed from: e */
    private int f160275e;

    /* renamed from: f */
    private byte f160276f = 2;

    static {
        bwmh bwmh = new bwmh();
        f160270d = bwmh;
        GeneratedMessageLite.m124024a(bwmh.class, bwmh);
    }

    private bwmh() {
        bxxn bxxn = bxxn.f165040b;
        this.f160273b = ByteString.f164797b;
        bxvm bxvm = bxvm.f164965b;
        this.f160274c = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160276f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160276f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160270d, "\u0001\u0003\u0000\u0001\u0002\r\u0003\u0000\u0001\u0001\u0002ᐉ\u0001\u0005ည\u0002\r\u001b", new Object[]{"e", "a", "b", "c", bxaz.class});
        } else if (i2 == 3) {
            return new bwmh();
        } else {
            if (i2 == 4) {
                return new bxvd(f160270d);
            }
            if (i2 == 5) {
                return f160270d;
            }
            bxxk bxxk = f160271g;
            if (bxxk == null) {
                synchronized (bwmh.class) {
                    bxxk = f160271g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160270d);
                        f160271g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
