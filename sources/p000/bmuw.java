package p000;

/* renamed from: bmuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmuw extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bmuw f130975l;

    /* renamed from: n */
    private static volatile bxxk f130976n;

    /* renamed from: a */
    public String f130977a = "";

    /* renamed from: b */
    public String f130978b = "";

    /* renamed from: c */
    public int f130979c;

    /* renamed from: d */
    public bmur f130980d;

    /* renamed from: e */
    public String f130981e = "";

    /* renamed from: f */
    public String f130982f = "";

    /* renamed from: g */
    public int f130983g;

    /* renamed from: h */
    public String f130984h = "";

    /* renamed from: i */
    public int f130985i;

    /* renamed from: j */
    public String f130986j = "";

    /* renamed from: k */
    public int f130987k;

    /* renamed from: m */
    private int f130988m;

    static {
        bmuw bmuw = new bmuw();
        f130975l = bmuw;
        bxvk.m124024a(bmuw.class, bmuw);
    }

    private bmuw() {
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
            return bxvk.m124022a(f130975l, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0006ဈ\u0007\u0007ဌ\b\bဉ\u0003\tဌ\u0006\nဈ\t\u000bဌ\n\fဌ\u0002", new Object[]{"m", "a", "b", "e", "f", "h", "i", btoa.m116972b(), "d", "g", bmuu.f130974a, "j", "k", bmus.f130973a, "c", btof.m116980b()});
        } else if (i2 == 3) {
            return new bmuw();
        } else {
            if (i2 == 4) {
                return new bxvd(f130975l);
            }
            if (i2 == 5) {
                return f130975l;
            }
            bxxk bxxk = f130976n;
            if (bxxk == null) {
                synchronized (bmuw.class) {
                    bxxk = f130976n;
                    if (bxxk == null) {
                        bxxk = new bxve(f130975l);
                        f130976n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
