package p000;

/* renamed from: buna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buna extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final buna f154289i;

    /* renamed from: k */
    private static volatile bxxk f154290k;

    /* renamed from: a */
    public int f154291a;

    /* renamed from: b */
    public int f154292b;

    /* renamed from: c */
    public bums f154293c;

    /* renamed from: d */
    public bums f154294d;

    /* renamed from: e */
    public bumt f154295e;

    /* renamed from: f */
    public bumu f154296f;

    /* renamed from: g */
    public int f154297g;

    /* renamed from: h */
    public int f154298h;

    /* renamed from: j */
    private byte f154299j = 2;

    static {
        buna buna = new buna();
        f154289i = buna;
        GeneratedMessageLite.m124024a(buna.class, buna);
    }

    private buna() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f154299j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f154299j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f154289i, "\u0001\u0007\u0000\u0001\u0002\u000f\u0007\u0000\u0000\u0001\u0002ᔄ\u0000\u0003ဉ\u0001\u000bဉ\b\fဉ\t\rဉ\n\u000eင\u000b\u000fင\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new buna();
        } else {
            if (i2 == 4) {
                return new bxvd(f154289i);
            }
            if (i2 == 5) {
                return f154289i;
            }
            bxxk bxxk = f154290k;
            if (bxxk == null) {
                synchronized (buna.class) {
                    bxxk = f154290k;
                    if (bxxk == null) {
                        bxxk = new bxve(f154289i);
                        f154290k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
