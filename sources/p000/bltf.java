package p000;

/* renamed from: bltf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltf extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bltf f127682j;

    /* renamed from: k */
    private static volatile bxxk f127683k;

    /* renamed from: a */
    public int f127684a;

    /* renamed from: b */
    public bltr f127685b;

    /* renamed from: c */
    public bltl f127686c;

    /* renamed from: d */
    public blto f127687d;

    /* renamed from: e */
    public bltj f127688e;

    /* renamed from: f */
    public String f127689f = "";

    /* renamed from: g */
    public blte f127690g;

    /* renamed from: h */
    public bltg f127691h;

    /* renamed from: i */
    public bltd f127692i;

    static {
        bltf bltf = new bltf();
        f127682j = bltf;
        GeneratedMessageLite.m124024a(bltf.class, bltf);
    }

    private bltf() {
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
            return GeneratedMessageLite.m124022a(f127682j, "\u0001\b\u0000\u0001\u0004ϯ\b\u0000\u0000\u0000\u0004ဉ\u0000\u0006ဉ\u0002\u0007ဉ\u0004\nဈ\u0005\u000fဉ\u0003ϩဉ\u0007ϫဉ\bϯဉ\t", new Object[]{"a", "b", "c", "e", "f", "d", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bltf();
        } else {
            if (i2 == 4) {
                return new bxvd(f127682j);
            }
            if (i2 == 5) {
                return f127682j;
            }
            bxxk bxxk = f127683k;
            if (bxxk == null) {
                synchronized (bltf.class) {
                    bxxk = f127683k;
                    if (bxxk == null) {
                        bxxk = new bxve(f127682j);
                        f127683k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
