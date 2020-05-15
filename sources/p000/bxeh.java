package p000;

/* renamed from: bxeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxeh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxeh f163098c;

    /* renamed from: e */
    private static volatile bxxk f163099e;

    /* renamed from: a */
    public int f163100a;

    /* renamed from: b */
    public long f163101b;

    /* renamed from: d */
    private int f163102d;

    static {
        bxeh bxeh = new bxeh();
        f163098c = bxeh;
        bxvk.m124024a(bxeh.class, bxeh);
    }

    private bxeh() {
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
            return bxvk.m124022a(f163098c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bxeh();
        } else {
            if (i2 == 4) {
                return new bxvd(f163098c);
            }
            if (i2 == 5) {
                return f163098c;
            }
            bxxk bxxk = f163099e;
            if (bxxk == null) {
                synchronized (bxeh.class) {
                    bxxk = f163099e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163098c);
                        f163099e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
