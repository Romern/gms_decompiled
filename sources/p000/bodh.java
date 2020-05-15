package p000;

/* renamed from: bodh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodh extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bodh f132682k;

    /* renamed from: l */
    private static volatile bxxk f132683l;

    /* renamed from: a */
    public int f132684a;

    /* renamed from: b */
    public String f132685b = "";

    /* renamed from: c */
    public int f132686c;

    /* renamed from: d */
    public String f132687d = "";

    /* renamed from: e */
    public int f132688e;

    /* renamed from: f */
    public int f132689f;

    /* renamed from: g */
    public int f132690g;

    /* renamed from: h */
    public botr f132691h;

    /* renamed from: i */
    public boolean f132692i;

    /* renamed from: j */
    public bocr f132693j;

    static {
        bodh bodh = new bodh();
        f132682k = bodh;
        bxvk.m124024a(bodh.class, bodh);
    }

    private bodh() {
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
            return bxvk.m124022a(f132682k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဉ\u0006\bဇ\u0007\tဉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bodh();
        } else {
            if (i2 == 4) {
                return new bxvd(f132682k);
            }
            if (i2 == 5) {
                return f132682k;
            }
            bxxk bxxk = f132683l;
            if (bxxk == null) {
                synchronized (bodh.class) {
                    bxxk = f132683l;
                    if (bxxk == null) {
                        bxxk = new bxve(f132682k);
                        f132683l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
