package p000;

/* renamed from: boir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boir extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final boir f133211o;

    /* renamed from: p */
    private static volatile bxxk f133212p;

    /* renamed from: a */
    public int f133213a;

    /* renamed from: b */
    public String f133214b = "";

    /* renamed from: c */
    public int f133215c;

    /* renamed from: d */
    public bojk f133216d;

    /* renamed from: e */
    public bojo f133217e;

    /* renamed from: f */
    public boja f133218f;

    /* renamed from: g */
    public boix f133219g;

    /* renamed from: h */
    public bojf f133220h;

    /* renamed from: i */
    public bojh f133221i;

    /* renamed from: j */
    public boji f133222j;

    /* renamed from: k */
    public boin f133223k;

    /* renamed from: l */
    public boim f133224l;

    /* renamed from: m */
    public boip f133225m;

    /* renamed from: n */
    public boiu f133226n;

    static {
        boir boir = new boir();
        f133211o = boir;
        GeneratedMessageLite.m124024a(boir.class, boir);
    }

    private boir() {
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
            return GeneratedMessageLite.m124022a(f133211o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f", new Object[]{"a", "b", "c", boiq.f133210a, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i2 == 3) {
            return new boir();
        } else {
            if (i2 == 4) {
                return new bxvd(f133211o);
            }
            if (i2 == 5) {
                return f133211o;
            }
            bxxk bxxk = f133212p;
            if (bxxk == null) {
                synchronized (boir.class) {
                    bxxk = f133212p;
                    if (bxxk == null) {
                        bxxk = new bxve(f133211o);
                        f133212p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
