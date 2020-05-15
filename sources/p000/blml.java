package p000;

/* renamed from: blml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blml extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final blml f126850k;

    /* renamed from: l */
    private static volatile bxxk f126851l;

    /* renamed from: a */
    public int f126852a;

    /* renamed from: b */
    public int f126853b;

    /* renamed from: c */
    public int f126854c;

    /* renamed from: d */
    public int f126855d;

    /* renamed from: e */
    public int f126856e;

    /* renamed from: f */
    public long f126857f;

    /* renamed from: g */
    public long f126858g;

    /* renamed from: h */
    public int f126859h;

    /* renamed from: i */
    public long f126860i;

    /* renamed from: j */
    public int f126861j;

    static {
        blml blml = new blml();
        f126850k = blml;
        GeneratedMessageLite.m124024a(blml.class, blml);
    }

    private blml() {
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
            return GeneratedMessageLite.m124022a(f126850k, "\u0001\t\u0000\u0001\u0001Ɛ\t\u0000\u0000\u0000\u0001ဌ\u0000dဋ\u0001Èင\u0002Éင\u0003Êဃ\u0004Ëဃ\u0005Ìင\u0006Ĭဃ\u0007Ɛဌ\b", new Object[]{"a", "b", blmk.f126849a, "c", "d", "e", "f", "g", "h", "i", "j", blmj.f126848a});
        } else if (i2 == 3) {
            return new blml();
        } else {
            if (i2 == 4) {
                return new bxvd(f126850k);
            }
            if (i2 == 5) {
                return f126850k;
            }
            bxxk bxxk = f126851l;
            if (bxxk == null) {
                synchronized (blml.class) {
                    bxxk = f126851l;
                    if (bxxk == null) {
                        bxxk = new bxve(f126850k);
                        f126851l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
