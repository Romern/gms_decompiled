package p000;

/* renamed from: bole */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bole extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bole f133504i;

    /* renamed from: j */
    private static volatile bxxk f133505j;

    /* renamed from: a */
    public int f133506a;

    /* renamed from: b */
    public boolean f133507b;

    /* renamed from: c */
    public boolean f133508c;

    /* renamed from: d */
    public boolean f133509d;

    /* renamed from: e */
    public boolean f133510e;

    /* renamed from: f */
    public boolean f133511f;

    /* renamed from: g */
    public boolean f133512g;

    /* renamed from: h */
    public boolean f133513h;

    static {
        bole bole = new bole();
        f133504i = bole;
        bxvk.m124024a(bole.class, bole);
    }

    private bole() {
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
            return bxvk.m124022a(f133504i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0006\u0007ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g"});
        } else if (i2 == 3) {
            return new bole();
        } else {
            if (i2 == 4) {
                return new bxvd(f133504i);
            }
            if (i2 == 5) {
                return f133504i;
            }
            bxxk bxxk = f133505j;
            if (bxxk == null) {
                synchronized (bole.class) {
                    bxxk = f133505j;
                    if (bxxk == null) {
                        bxxk = new bxve(f133504i);
                        f133505j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
