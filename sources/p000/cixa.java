package p000;

/* renamed from: cixa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixa extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cixa f191640e;

    /* renamed from: f */
    private static volatile bxxk f191641f;

    /* renamed from: a */
    public int f191642a;

    /* renamed from: b */
    public int f191643b;

    /* renamed from: c */
    public int f191644c;

    /* renamed from: d */
    public ByteString f191645d = ByteString.f164797b;

    static {
        cixa cixa = new cixa();
        f191640e = cixa;
        GeneratedMessageLite.m124024a(cixa.class, cixa);
    }

    private cixa() {
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
            return GeneratedMessageLite.m124022a(f191640e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0002\u0003င\u0001", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new cixa();
        } else {
            if (i2 == 4) {
                return new bxvd(f191640e);
            }
            if (i2 == 5) {
                return f191640e;
            }
            bxxk bxxk = f191641f;
            if (bxxk == null) {
                synchronized (cixa.class) {
                    bxxk = f191641f;
                    if (bxxk == null) {
                        bxxk = new bxve(f191640e);
                        f191641f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
