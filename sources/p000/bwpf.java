package p000;

/* renamed from: bwpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpf extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bwpf f160532g;

    /* renamed from: h */
    public static final bxvj f160533h;

    /* renamed from: i */
    private static volatile bxxk f160534i;

    /* renamed from: a */
    public int f160535a;

    /* renamed from: b */
    public String f160536b = "";

    /* renamed from: c */
    public String f160537c = "";

    /* renamed from: d */
    public String f160538d = "";

    /* renamed from: e */
    public String f160539e = "";

    /* renamed from: f */
    public String f160540f = "";

    static {
        bwpf bwpf = new bwpf();
        f160532g = bwpf;
        bxvk.m124024a(bwpf.class, bwpf);
        bwny bwny = bwny.f160414k;
        bwpf bwpf2 = f160532g;
        f160533h = bxvk.m124006a(bwny, bwpf2, bwpf2, 279018859, bxzf.MESSAGE);
    }

    private bwpf() {
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
            return bxvk.m124022a(f160532g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bwpf();
        } else {
            if (i2 == 4) {
                return new bxvd(f160532g);
            }
            if (i2 == 5) {
                return f160532g;
            }
            bxxk bxxk = f160534i;
            if (bxxk == null) {
                synchronized (bwpf.class) {
                    bxxk = f160534i;
                    if (bxxk == null) {
                        bxxk = new bxve(f160532g);
                        f160534i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
