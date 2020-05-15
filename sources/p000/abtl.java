package p000;

/* renamed from: abtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtl extends bxvk implements bxxd {

    /* renamed from: g */
    public static final abtl f58251g;

    /* renamed from: h */
    private static volatile bxxk f58252h;

    /* renamed from: a */
    public int f58253a;

    /* renamed from: b */
    public boolean f58254b;

    /* renamed from: c */
    public boolean f58255c;

    /* renamed from: d */
    public boolean f58256d;

    /* renamed from: e */
    public boolean f58257e;

    /* renamed from: f */
    public boolean f58258f;

    static {
        abtl abtl = new abtl();
        f58251g = abtl;
        bxvk.m124024a(abtl.class, abtl);
    }

    private abtl() {
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
            return bxvk.m124022a(f58251g, "\u0001\u0005\u0000\u0001\n\u0014\u0005\u0000\u0000\u0000\nဇ\u0000\fဇ\u0001\u0011ဇ\u0003\u0013ဇ\u0004\u0014ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new abtl();
        } else {
            if (i2 == 4) {
                return new bxvd(f58251g);
            }
            if (i2 == 5) {
                return f58251g;
            }
            bxxk bxxk = f58252h;
            if (bxxk == null) {
                synchronized (abtl.class) {
                    bxxk = f58252h;
                    if (bxxk == null) {
                        bxxk = new bxve(f58251g);
                        f58252h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
