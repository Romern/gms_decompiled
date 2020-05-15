package p000;

/* renamed from: bxir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxir extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxir f163558c;

    /* renamed from: d */
    private static volatile bxxk f163559d;

    /* renamed from: a */
    public int f163560a;

    /* renamed from: b */
    public bxjc f163561b;

    static {
        bxir bxir = new bxir();
        f163558c = bxir;
        GeneratedMessageLite.m124024a(bxir.class, bxir);
    }

    private bxir() {
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
            return GeneratedMessageLite.m124022a(f163558c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxir();
        } else {
            if (i2 == 4) {
                return new bxvd(f163558c);
            }
            if (i2 == 5) {
                return f163558c;
            }
            bxxk bxxk = f163559d;
            if (bxxk == null) {
                synchronized (bxir.class) {
                    bxxk = f163559d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163558c);
                        f163559d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
