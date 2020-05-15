package p000;

/* renamed from: cbld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbld extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cbld f177471h;

    /* renamed from: i */
    private static volatile bxxk f177472i;

    /* renamed from: a */
    public cblz f177473a;

    /* renamed from: b */
    public String f177474b = "";

    /* renamed from: c */
    public cbml f177475c;

    /* renamed from: d */
    public String f177476d;

    /* renamed from: e */
    public String f177477e;

    /* renamed from: f */
    public bxvt f177478f;

    /* renamed from: g */
    public bxtx f177479g;

    static {
        cbld cbld = new cbld();
        f177471h = cbld;
        bxvk.m124024a(cbld.class, cbld);
    }

    private cbld() {
        bxtx bxtx = bxtx.f164797b;
        this.f177476d = "";
        this.f177477e = "";
        this.f177478f = bxvm.f164965b;
        this.f177479g = bxtx.f164797b;
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
            return bxvk.m124022a(f177471h, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0001\u0000\u0001\t\u0003Ȉ\u0006\t\u0007Ȉ\bȈ\t'\n\n", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new cbld();
        } else {
            if (i2 == 4) {
                return new cblc();
            }
            if (i2 == 5) {
                return f177471h;
            }
            bxxk bxxk = f177472i;
            if (bxxk == null) {
                synchronized (cbld.class) {
                    bxxk = f177472i;
                    if (bxxk == null) {
                        bxxk = new bxve(f177471h);
                        f177472i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
