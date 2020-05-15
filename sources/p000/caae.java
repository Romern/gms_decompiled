package p000;

/* renamed from: caae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caae extends GeneratedMessageLite implements caaf {

    /* renamed from: i */
    public static final caae f172323i;

    /* renamed from: j */
    private static volatile bxxk f172324j;

    /* renamed from: a */
    public int f172325a;

    /* renamed from: b */
    public String f172326b = "";

    /* renamed from: c */
    public String f172327c = "";

    /* renamed from: d */
    public String f172328d = "";

    /* renamed from: e */
    public int f172329e;

    /* renamed from: f */
    public caah f172330f;

    /* renamed from: g */
    public caaq f172331g;

    /* renamed from: h */
    public bzzz f172332h;

    static {
        caae caae = new caae();
        f172323i = caae;
        GeneratedMessageLite.m124024a(caae.class, caae);
    }

    private caae() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f172323i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဌ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006", new Object[]{"a", "b", "c", "d", "e", caad.m126391b(), "f", "g", "h"});
        } else if (i2 == 3) {
            return new caae();
        } else {
            if (i2 == 4) {
                return new caab();
            }
            if (i2 == 5) {
                return f172323i;
            }
            bxxk bxxk = f172324j;
            if (bxxk == null) {
                synchronized (caae.class) {
                    bxxk = f172324j;
                    if (bxxk == null) {
                        bxxk = new bxve(f172323i);
                        f172324j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: n */
    public final boolean mo74587n() {
        return (this.f172325a & 4) != 0;
    }

    /* renamed from: o */
    public final String mo74588o() {
        return this.f172328d;
    }

    /* renamed from: p */
    public final caad mo74589p() {
        caad a = caad.m126389a(this.f172329e);
        return a == null ? caad.RAW : a;
    }

    /* renamed from: q */
    public final caah mo74590q() {
        caah caah = this.f172330f;
        return caah == null ? caah.f172333d : caah;
    }

    /* renamed from: r */
    public final boolean mo74591r() {
        return (this.f172325a & 32) != 0;
    }

    /* renamed from: s */
    public final caaq mo74592s() {
        caaq caaq = this.f172331g;
        return caaq == null ? caaq.f172356h : caaq;
    }

    /* renamed from: t */
    public final bzzz mo74593t() {
        bzzz bzzz = this.f172332h;
        return bzzz == null ? bzzz.f172298f : bzzz;
    }
}
