package p000;

/* renamed from: bzmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmm extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzmm f170622e;

    /* renamed from: f */
    private static volatile bxxk f170623f;

    /* renamed from: a */
    public int f170624a;

    /* renamed from: b */
    public int f170625b;

    /* renamed from: c */
    public int f170626c;

    /* renamed from: d */
    public String f170627d = "";

    static {
        bzmm bzmm = new bzmm();
        f170622e = bzmm;
        GeneratedMessageLite.m124024a(bzmm.class, bzmm);
    }

    private bzmm() {
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
            return GeneratedMessageLite.m124022a(f170622e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", bzmi.f170620a, "c", bzmk.f170621a, "d"});
        } else if (i2 == 3) {
            return new bzmm();
        } else {
            if (i2 == 4) {
                return new bxvd(f170622e);
            }
            if (i2 == 5) {
                return f170622e;
            }
            bxxk bxxk = f170623f;
            if (bxxk == null) {
                synchronized (bzmm.class) {
                    bxxk = f170623f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170622e);
                        f170623f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
