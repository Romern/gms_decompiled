package p000;

/* renamed from: cblu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cblu f177563d;

    /* renamed from: e */
    private static volatile bxxk f177564e;

    /* renamed from: a */
    public int f177565a = 0;

    /* renamed from: b */
    public Object f177566b;

    /* renamed from: c */
    public int f177567c;

    static {
        cblu cblu = new cblu();
        f177563d = cblu;
        bxvk.m124024a(cblu.class, cblu);
    }

    private cblu() {
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
            return bxvk.m124022a(f177563d, "\u0000\u0010\u0001\u0000\u0001w\u0010\u0000\u0000\u0000\u0001\fg<\u0000h<\u0000j<\u0000k<\u0000l<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000v<\u0000w<\u0000", new Object[]{"b", "a", "c", cbnh.class, cbng.class, cbnl.class, cbni.class, cbnf.class, cbnq.class, cbnd.class, cbnp.class, cbne.class, cbnv.class, cbnk.class, cbnj.class, cbnn.class, cbnu.class, cbnm.class});
        } else if (i2 == 3) {
            return new cblu();
        } else {
            if (i2 == 4) {
                return new bxvd(f177563d);
            }
            if (i2 == 5) {
                return f177563d;
            }
            bxxk bxxk = f177564e;
            if (bxxk == null) {
                synchronized (cblu.class) {
                    bxxk = f177564e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177563d);
                        f177564e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
