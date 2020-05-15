package p000;

/* renamed from: bpqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqa extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpqa f138688d;

    /* renamed from: g */
    private static volatile bxxk f138689g;

    /* renamed from: a */
    public int f138690a;

    /* renamed from: b */
    public String f138691b = "";

    /* renamed from: c */
    public bppt f138692c;

    /* renamed from: e */
    private bpli f138693e;

    /* renamed from: f */
    private byte f138694f = 2;

    static {
        bpqa bpqa = new bpqa();
        f138688d = bpqa;
        bxvk.m124024a(bpqa.class, bpqa);
    }

    private bpqa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138694f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138694f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f138688d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "e", "c"});
        } else if (i2 == 3) {
            return new bpqa();
        } else {
            if (i2 == 4) {
                return new bxvd(f138688d);
            }
            if (i2 == 5) {
                return f138688d;
            }
            bxxk bxxk = f138689g;
            if (bxxk == null) {
                synchronized (bpqa.class) {
                    bxxk = f138689g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138688d);
                        f138689g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
