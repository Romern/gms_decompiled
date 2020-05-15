package p000;

/* renamed from: bpdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdr extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bpdr f136363k;

    /* renamed from: l */
    private static volatile bxxk f136364l;

    /* renamed from: a */
    public int f136365a;

    /* renamed from: b */
    public int f136366b;

    /* renamed from: c */
    public int f136367c;

    /* renamed from: d */
    public int f136368d;

    /* renamed from: e */
    public int f136369e;

    /* renamed from: f */
    public int f136370f;

    /* renamed from: g */
    public int f136371g;

    /* renamed from: h */
    public int f136372h;

    /* renamed from: i */
    public int f136373i;

    /* renamed from: j */
    public int f136374j;

    static {
        bpdr bpdr = new bpdr();
        f136363k = bpdr;
        bxvk.m124024a(bpdr.class, bpdr);
    }

    private bpdr() {
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
            return bxvk.m124022a(f136363k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001င\u0000\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bpdr();
        } else {
            if (i2 == 4) {
                return new bxvd(f136363k);
            }
            if (i2 == 5) {
                return f136363k;
            }
            bxxk bxxk = f136364l;
            if (bxxk == null) {
                synchronized (bpdr.class) {
                    bxxk = f136364l;
                    if (bxxk == null) {
                        bxxk = new bxve(f136363k);
                        f136364l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
