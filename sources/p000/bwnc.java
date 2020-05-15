package p000;

/* renamed from: bwnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwnc f160343c;

    /* renamed from: d */
    public static final bxvj f160344d;

    /* renamed from: e */
    private static volatile bxxk f160345e;

    /* renamed from: a */
    public int f160346a;

    /* renamed from: b */
    public String f160347b = "";

    static {
        bwnc bwnc = new bwnc();
        f160343c = bwnc;
        bxvk.m124024a(bwnc.class, bwnc);
        bwog bwog = bwog.f160437f;
        bwnc bwnc2 = f160343c;
        f160344d = bxvk.m124006a(bwog, bwnc2, bwnc2, 204201689, bxzf.MESSAGE);
    }

    private bwnc() {
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
            return bxvk.m124022a(f160343c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwnc();
        } else {
            if (i2 == 4) {
                return new bxvd(f160343c);
            }
            if (i2 == 5) {
                return f160343c;
            }
            bxxk bxxk = f160345e;
            if (bxxk == null) {
                synchronized (bwnc.class) {
                    bxxk = f160345e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160343c);
                        f160345e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
