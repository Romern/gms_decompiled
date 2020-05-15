package p000;

/* renamed from: bslh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bslh f144916f;

    /* renamed from: g */
    private static volatile bxxk f144917g;

    /* renamed from: a */
    public int f144918a;

    /* renamed from: b */
    public String f144919b = "me";

    /* renamed from: c */
    public bsli f144920c;

    /* renamed from: d */
    public String f144921d = "";

    /* renamed from: e */
    public int f144922e;

    static {
        bslh bslh = new bslh();
        f144916f = bslh;
        GeneratedMessageLite.m124024a(bslh.class, bslh);
    }

    private bslh() {
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
            return GeneratedMessageLite.m124022a(f144916f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bsln.f144930a});
        } else if (i2 == 3) {
            return new bslh();
        } else {
            if (i2 == 4) {
                return new bxvd(f144916f);
            }
            if (i2 == 5) {
                return f144916f;
            }
            bxxk bxxk = f144917g;
            if (bxxk == null) {
                synchronized (bslh.class) {
                    bxxk = f144917g;
                    if (bxxk == null) {
                        bxxk = new bxve(f144916f);
                        f144917g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
