package p000;

/* renamed from: bwog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwog extends bxvg implements bxvh {

    /* renamed from: f */
    public static final bwog f160437f;

    /* renamed from: h */
    private static volatile bxxk f160438h;

    /* renamed from: a */
    public int f160439a;

    /* renamed from: b */
    public long f160440b;

    /* renamed from: c */
    public bwof f160441c;

    /* renamed from: d */
    public String f160442d = "";

    /* renamed from: e */
    public int f160443e;

    /* renamed from: g */
    private byte f160444g = 2;

    static {
        bwog bwog = new bwog();
        f160437f = bwog;
        bxvk.m124024a(bwog.class, bwog);
    }

    private bwog() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160444g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160444g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160437f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဉ\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwog();
        } else {
            if (i2 == 4) {
                return new bxvf(f160437f);
            }
            if (i2 == 5) {
                return f160437f;
            }
            bxxk bxxk = f160438h;
            if (bxxk == null) {
                synchronized (bwog.class) {
                    bxxk = f160438h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160437f);
                        f160438h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
