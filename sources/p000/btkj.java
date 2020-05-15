package p000;

/* renamed from: btkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btkj f149261d;

    /* renamed from: e */
    private static volatile bxxk f149262e;

    /* renamed from: a */
    public btiy f149263a;

    /* renamed from: b */
    public int f149264b;

    /* renamed from: c */
    public String f149265c = "";

    static {
        btkj btkj = new btkj();
        f149261d = btkj;
        bxvk.m124024a(btkj.class, btkj);
    }

    private btkj() {
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
            return bxvk.m124022a(f149261d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0005Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btkj();
        } else {
            if (i2 == 4) {
                return new bxvd(f149261d);
            }
            if (i2 == 5) {
                return f149261d;
            }
            bxxk bxxk = f149262e;
            if (bxxk == null) {
                synchronized (btkj.class) {
                    bxxk = f149262e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149261d);
                        f149262e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
