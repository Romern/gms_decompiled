package p000;

/* renamed from: bttj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bttj f150351c;

    /* renamed from: e */
    private static volatile bxxk f150352e;

    /* renamed from: a */
    public int f150353a;

    /* renamed from: b */
    public String f150354b = "";

    /* renamed from: d */
    private int f150355d;

    static {
        bttj bttj = new bttj();
        f150351c = bttj;
        GeneratedMessageLite.m124024a(bttj.class, bttj);
    }

    private bttj() {
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
            return GeneratedMessageLite.m124022a(f150351c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", btti.m117121b(), "b"});
        } else if (i2 == 3) {
            return new bttj();
        } else {
            if (i2 == 4) {
                return new bxvd(f150351c);
            }
            if (i2 == 5) {
                return f150351c;
            }
            bxxk bxxk = f150352e;
            if (bxxk == null) {
                synchronized (bttj.class) {
                    bxxk = f150352e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150351c);
                        f150352e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
