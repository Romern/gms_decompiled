package p000;

/* renamed from: bmto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmto extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bmto f130881k;

    /* renamed from: l */
    private static volatile bxxk f130882l;

    /* renamed from: a */
    public bxwc f130883a = bxxn.f165040b;

    /* renamed from: b */
    public String f130884b = "";

    /* renamed from: c */
    public String f130885c = "";

    /* renamed from: d */
    public String f130886d = "";

    /* renamed from: e */
    public String f130887e = "";

    /* renamed from: f */
    public bmtj f130888f;

    /* renamed from: g */
    public bmtq f130889g;

    /* renamed from: h */
    public bmtr f130890h;

    /* renamed from: i */
    public bmtm f130891i;

    /* renamed from: j */
    public String f130892j = "";

    static {
        bmto bmto = new bmto();
        f130881k = bmto;
        GeneratedMessageLite.m124024a(bmto.class, bmto);
    }

    private bmto() {
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
            return GeneratedMessageLite.m124022a(f130881k, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\u001b\u0002\b\u0003\b\u0005\b\u0006\b\u0007\t\b\t\t\t\n\t\u000bȈ", new Object[]{"a", bmtf.class, "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bmto();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f130881k;
            }
            bxxk bxxk = f130882l;
            if (bxxk == null) {
                synchronized (bmto.class) {
                    bxxk = f130882l;
                    if (bxxk == null) {
                        bxxk = new bxve(f130881k);
                        f130882l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
