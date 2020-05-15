package p000;

/* renamed from: bzon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzon extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzon f170839f;

    /* renamed from: g */
    private static volatile bxxk f170840g;

    /* renamed from: a */
    public bzoa f170841a;

    /* renamed from: b */
    public String f170842b = "";

    /* renamed from: c */
    public int f170843c;

    /* renamed from: d */
    public String f170844d = "";

    /* renamed from: e */
    public String f170845e = "";

    static {
        bzon bzon = new bzon();
        f170839f = bzon;
        bxvk.m124024a(bzon.class, bzon);
    }

    private bzon() {
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
            return bxvk.m124022a(f170839f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzon();
        } else {
            if (i2 == 4) {
                return new bxvd(f170839f);
            }
            if (i2 == 5) {
                return f170839f;
            }
            bxxk bxxk = f170840g;
            if (bxxk == null) {
                synchronized (bzon.class) {
                    bxxk = f170840g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170839f);
                        f170840g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
