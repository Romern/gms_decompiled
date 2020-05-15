package p000;

/* renamed from: birg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxvu f121408e = new bird();

    /* renamed from: g */
    public static final birg f121409g;

    /* renamed from: j */
    private static volatile bxxk f121410j;

    /* renamed from: a */
    public bxvt f121411a = bxvm.f164965b;

    /* renamed from: b */
    public bxwc f121412b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f121413c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f121414d = bxvm.f164965b;

    /* renamed from: f */
    public int f121415f;

    /* renamed from: h */
    private int f121416h;

    /* renamed from: i */
    private byte f121417i = 2;

    static {
        birg birg = new birg();
        f121409g = birg;
        bxvk.m124024a(birg.class, birg);
    }

    private birg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121417i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121417i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121409g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0002\u0001'\u0002Л\u0003Л\u0004\u001e\u0005ဋ\u0000", new Object[]{"h", "a", "b", birf.class, "c", bire.class, "d", biqh.m102725b(), "f"});
        } else if (i2 == 3) {
            return new birg();
        } else {
            if (i2 == 4) {
                return new bxvd(f121409g);
            }
            if (i2 == 5) {
                return f121409g;
            }
            bxxk bxxk = f121410j;
            if (bxxk == null) {
                synchronized (birg.class) {
                    bxxk = f121410j;
                    if (bxxk == null) {
                        bxxk = new bxve(f121409g);
                        f121410j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
