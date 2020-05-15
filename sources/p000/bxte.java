package p000;

/* renamed from: bxte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxte extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxte f164763c;

    /* renamed from: d */
    private static volatile bxxk f164764d;

    /* renamed from: a */
    public String f164765a = "";

    /* renamed from: b */
    public ByteString f164766b = ByteString.f164797b;

    static {
        bxte bxte = new bxte();
        f164763c = bxte;
        GeneratedMessageLite.m124024a(bxte.class, bxte);
    }

    private bxte() {
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
            return GeneratedMessageLite.m124022a(f164763c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxte();
        } else {
            if (i2 == 4) {
                return new bxvd(f164763c);
            }
            if (i2 == 5) {
                return f164763c;
            }
            bxxk bxxk = f164764d;
            if (bxxk == null) {
                synchronized (bxte.class) {
                    bxxk = f164764d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164763c);
                        f164764d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
