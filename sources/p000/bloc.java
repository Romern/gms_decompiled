package p000;

/* renamed from: bloc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bloc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bloc f127061f;

    /* renamed from: h */
    private static volatile bxxk f127062h;

    /* renamed from: a */
    public int f127063a;

    /* renamed from: b */
    public String f127064b = "";

    /* renamed from: c */
    public int f127065c = 1;

    /* renamed from: d */
    public blno f127066d;

    /* renamed from: e */
    public blnm f127067e;

    /* renamed from: g */
    private byte f127068g = 2;

    static {
        bloc bloc = new bloc();
        f127061f = bloc;
        bxvk.m124024a(bloc.class, bloc);
    }

    private bloc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127068g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127068g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127061f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0004ᐉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", bloa.f127060a, "d", "e"});
        } else if (i2 == 3) {
            return new bloc();
        } else {
            if (i2 == 4) {
                return new bxvd(f127061f);
            }
            if (i2 == 5) {
                return f127061f;
            }
            bxxk bxxk = f127062h;
            if (bxxk == null) {
                synchronized (bloc.class) {
                    bxxk = f127062h;
                    if (bxxk == null) {
                        bxxk = new bxve(f127061f);
                        f127062h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
