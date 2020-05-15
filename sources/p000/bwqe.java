package p000;

/* renamed from: bwqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqe extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwqe f160648e;

    /* renamed from: f */
    public static final bxvj f160649f;

    /* renamed from: g */
    private static volatile bxxk f160650g;

    /* renamed from: a */
    public int f160651a;

    /* renamed from: b */
    public ByteString f160652b = ByteString.f164797b;

    /* renamed from: c */
    public int f160653c;

    /* renamed from: d */
    public String f160654d = "";

    static {
        bwqe bwqe = new bwqe();
        f160648e = bwqe;
        GeneratedMessageLite.m124024a(bwqe.class, bwqe);
        bwny bwny = bwny.f160414k;
        bwqe bwqe2 = f160648e;
        f160649f = GeneratedMessageLite.m124006a(bwny, bwqe2, bwqe2, 268341327, bxzf.MESSAGE);
    }

    private bwqe() {
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
            return GeneratedMessageLite.m124022a(f160648e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ည\u0000\u0003င\u0001\u0005ဈ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwqe();
        } else {
            if (i2 == 4) {
                return new bxvd(f160648e);
            }
            if (i2 == 5) {
                return f160648e;
            }
            bxxk bxxk = f160650g;
            if (bxxk == null) {
                synchronized (bwqe.class) {
                    bxxk = f160650g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160648e);
                        f160650g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
