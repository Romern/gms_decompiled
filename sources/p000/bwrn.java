package p000;

/* renamed from: bwrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwrn f160782a;

    /* renamed from: b */
    public static final bxvj f160783b;

    /* renamed from: c */
    private static volatile bxxk f160784c;

    static {
        bwrn bwrn = new bwrn();
        f160782a = bwrn;
        GeneratedMessageLite.m124024a(bwrn.class, bwrn);
        bwny bwny = bwny.f160414k;
        bwrn bwrn2 = f160782a;
        f160783b = GeneratedMessageLite.m124006a(bwny, bwrn2, bwrn2, 262235235, bxzf.MESSAGE);
    }

    private bwrn() {
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
            return GeneratedMessageLite.m124022a(f160782a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwrn();
        }
        if (i2 == 4) {
            return new bxvd(f160782a);
        }
        if (i2 == 5) {
            return f160782a;
        }
        bxxk bxxk = f160784c;
        if (bxxk == null) {
            synchronized (bwrn.class) {
                bxxk = f160784c;
                if (bxxk == null) {
                    bxxk = new bxve(f160782a);
                    f160784c = bxxk;
                }
            }
        }
        return bxxk;
    }
}
