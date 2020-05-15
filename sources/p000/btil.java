package p000;

/* renamed from: btil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btil extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btil f148989c;

    /* renamed from: d */
    private static volatile bxxk f148990d;

    /* renamed from: a */
    public int f148991a = 0;

    /* renamed from: b */
    public Object f148992b;

    static {
        btil btil = new btil();
        f148989c = btil;
        GeneratedMessageLite.m124024a(btil.class, btil);
    }

    private btil() {
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
            return GeneratedMessageLite.m124022a(f148989c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new btil();
        } else {
            if (i2 == 4) {
                return new bxvd(f148989c);
            }
            if (i2 == 5) {
                return f148989c;
            }
            bxxk bxxk = f148990d;
            if (bxxk == null) {
                synchronized (btil.class) {
                    bxxk = f148990d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148989c);
                        f148990d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
