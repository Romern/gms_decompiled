package p000;

/* renamed from: bvpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpf extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bvpf f157278g;

    /* renamed from: h */
    private static volatile bxxk f157279h;

    /* renamed from: a */
    public int f157280a;

    /* renamed from: b */
    public bvpd f157281b;

    /* renamed from: c */
    public bxwc f157282c = bxxn.f165040b;

    /* renamed from: d */
    public int f157283d;

    /* renamed from: e */
    public int f157284e;

    /* renamed from: f */
    public bvpb f157285f;

    static {
        bvpf bvpf = new bvpf();
        f157278g = bvpf;
        bxvk.m124024a(bvpf.class, bvpf);
    }

    private bvpf() {
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
            return bxvk.m124022a(f157278g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0003\u001b\u0004င\u0002\u0005င\u0003\u0006ဉ\u0004", new Object[]{"a", "b", "c", bvpi.class, "d", "e", "f"});
        } else if (i2 == 3) {
            return new bvpf();
        } else {
            if (i2 == 4) {
                return new bxvd(f157278g);
            }
            if (i2 == 5) {
                return f157278g;
            }
            bxxk bxxk = f157279h;
            if (bxxk == null) {
                synchronized (bvpf.class) {
                    bxxk = f157279h;
                    if (bxxk == null) {
                        bxxk = new bxve(f157278g);
                        f157279h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
