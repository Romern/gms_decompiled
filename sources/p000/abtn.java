package p000;

/* renamed from: abtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final abtn f58271c;

    /* renamed from: e */
    private static volatile bxxk f58272e;

    /* renamed from: a */
    public bpyk f58273a;

    /* renamed from: b */
    public bpyt f58274b;

    /* renamed from: d */
    private int f58275d;

    static {
        abtn abtn = new abtn();
        f58271c = abtn;
        bxvk.m124024a(abtn.class, abtn);
    }

    private abtn() {
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
            return bxvk.m124022a(f58271c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new abtn();
        } else {
            if (i2 == 4) {
                return new bxvd(f58271c);
            }
            if (i2 == 5) {
                return f58271c;
            }
            bxxk bxxk = f58272e;
            if (bxxk == null) {
                synchronized (abtn.class) {
                    bxxk = f58272e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58271c);
                        f58272e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
