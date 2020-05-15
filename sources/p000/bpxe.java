package p000;

/* renamed from: bpxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxe extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bpxe f139685g;

    /* renamed from: h */
    private static volatile bxxk f139686h;

    /* renamed from: a */
    public int f139687a;

    /* renamed from: b */
    public int f139688b;

    /* renamed from: c */
    public long f139689c;

    /* renamed from: d */
    public long f139690d;

    /* renamed from: e */
    public long f139691e;

    /* renamed from: f */
    public boolean f139692f;

    static {
        bpxe bpxe = new bpxe();
        f139685g = bpxe;
        bxvk.m124024a(bpxe.class, bpxe);
    }

    private bpxe() {
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
            return bxvk.m124022a(f139685g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", bpzj.f139998a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpxe();
        } else {
            if (i2 == 4) {
                return new bxvd(f139685g);
            }
            if (i2 == 5) {
                return f139685g;
            }
            bxxk bxxk = f139686h;
            if (bxxk == null) {
                synchronized (bpxe.class) {
                    bxxk = f139686h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139685g);
                        f139686h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
