package p000;

/* renamed from: beza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beza extends bxvk implements bxxd {

    /* renamed from: n */
    public static final beza f113089n;

    /* renamed from: o */
    private static volatile bxxk f113090o;

    /* renamed from: a */
    public int f113091a;

    /* renamed from: b */
    public double f113092b;

    /* renamed from: c */
    public double f113093c;

    /* renamed from: d */
    public float f113094d;

    /* renamed from: e */
    public double f113095e;

    /* renamed from: f */
    public float f113096f;

    /* renamed from: g */
    public float f113097g;

    /* renamed from: h */
    public long f113098h;

    /* renamed from: i */
    public float f113099i;

    /* renamed from: j */
    public float f113100j;

    /* renamed from: k */
    public long f113101k;

    /* renamed from: l */
    public float f113102l;

    /* renamed from: m */
    public String f113103m = "";

    static {
        beza beza = new beza();
        f113089n = beza;
        bxvk.m124024a(beza.class, beza);
    }

    private beza() {
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
            return bxvk.m124022a(f113089n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ခ\u0002\u0004က\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဂ\u0006\tခ\b\nခ\t\u000bဂ\n\fခ\u000b\rဈ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new beza();
        } else {
            if (i2 == 4) {
                return new bxvd(f113089n);
            }
            if (i2 == 5) {
                return f113089n;
            }
            bxxk bxxk = f113090o;
            if (bxxk == null) {
                synchronized (beza.class) {
                    bxxk = f113090o;
                    if (bxxk == null) {
                        bxxk = new bxve(f113089n);
                        f113090o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
