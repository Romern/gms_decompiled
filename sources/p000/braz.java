package p000;

/* renamed from: braz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class braz extends bxvk implements bxxd {

    /* renamed from: f */
    public static final braz f142213f;

    /* renamed from: g */
    private static volatile bxxk f142214g;

    /* renamed from: a */
    public int f142215a;

    /* renamed from: b */
    public brak f142216b;

    /* renamed from: c */
    public int f142217c;

    /* renamed from: d */
    public String f142218d = "";

    /* renamed from: e */
    public bxtx f142219e = bxtx.f164797b;

    static {
        braz braz = new braz();
        f142213f = braz;
        bxvk.m124024a(braz.class, braz);
    }

    private braz() {
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
            return bxvk.m124022a(f142213f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", brcj.f142386a, "d", "e"});
        } else if (i2 == 3) {
            return new braz();
        } else {
            if (i2 == 4) {
                return new bxvd(f142213f);
            }
            if (i2 == 5) {
                return f142213f;
            }
            bxxk bxxk = f142214g;
            if (bxxk == null) {
                synchronized (braz.class) {
                    bxxk = f142214g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142213f);
                        f142214g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
