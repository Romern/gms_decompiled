package p000;

/* renamed from: boty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boty extends bxvk implements bxxd {

    /* renamed from: g */
    public static final boty f134893g;

    /* renamed from: i */
    private static volatile bxxk f134894i;

    /* renamed from: a */
    public int f134895a;

    /* renamed from: b */
    public botw f134896b;

    /* renamed from: c */
    public botx f134897c;

    /* renamed from: d */
    public botv f134898d;

    /* renamed from: e */
    public botu f134899e;

    /* renamed from: f */
    public botz f134900f;

    /* renamed from: h */
    private byte f134901h = 2;

    static {
        boty boty = new boty();
        f134893g = boty;
        bxvk.m124024a(boty.class, boty);
    }

    private boty() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f134901h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f134901h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f134893g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new boty();
        } else {
            if (i2 == 4) {
                return new bxvd(f134893g);
            }
            if (i2 == 5) {
                return f134893g;
            }
            bxxk bxxk = f134894i;
            if (bxxk == null) {
                synchronized (boty.class) {
                    bxxk = f134894i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134893g);
                        f134894i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
