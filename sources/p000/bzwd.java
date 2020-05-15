package p000;

/* renamed from: bzwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzwd f171604b;

    /* renamed from: d */
    private static volatile bxxk f171605d;

    /* renamed from: a */
    public bzwe f171606a;

    /* renamed from: c */
    private int f171607c;

    static {
        bzwd bzwd = new bzwd();
        f171604b = bzwd;
        bxvk.m124024a(bzwd.class, bzwd);
    }

    private bzwd() {
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
            return bxvk.m124022a(f171604b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzwd();
        } else {
            if (i2 == 4) {
                return new bxvd(f171604b);
            }
            if (i2 == 5) {
                return f171604b;
            }
            bxxk bxxk = f171605d;
            if (bxxk == null) {
                synchronized (bzwd.class) {
                    bxxk = f171605d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171604b);
                        f171605d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
