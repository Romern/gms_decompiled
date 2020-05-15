package p000;

/* renamed from: bkoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkoc {

    /* renamed from: a */
    public static final blgm f124981a;

    /* renamed from: b */
    public static final blgm f124982b;

    /* renamed from: c */
    public static final blgm f124983c;

    /* renamed from: d */
    public static final blgm f124984d;

    /* renamed from: e */
    public final int f124985e;

    /* renamed from: f */
    public final blgm f124986f;

    /* renamed from: g */
    public final String f124987g;

    /* renamed from: h */
    public final long f124988h;

    /* renamed from: i */
    public final Object f124989i;

    static {
        blgk f = blgm.m107133f();
        f.mo66489a("noop");
        f124981a = f.mo66486a();
        blgk f2 = blgm.m107133f();
        f2.mo66489a("c");
        f124982b = f2.mo66486a();
        blgk f3 = blgm.m107133f();
        f3.mo66489a("stop");
        f124983c = f3.mo66486a();
        blgk f4 = blgm.m107133f();
        f4.mo66487a(3.0d);
        f124984d = f4.mo66486a();
    }

    private bkoc(int i, String str, long j, Object obj, blgm blgm) {
        this.f124985e = i;
        this.f124987g = str;
        this.f124988h = j;
        this.f124989i = obj;
        bkww.m106781a(blgm, "payloadType");
        this.f124986f = blgm;
        if (i < 0) {
            throw new IllegalArgumentException("envelopeId < 0");
        }
    }

    /* renamed from: a */
    public static bkoc m106225a(bkxi bkxi) {
        Object obj;
        long j;
        String str;
        bkxi.mo66430c();
        int b = bkxi.mo66429b();
        bkxi.mo66430c();
        blgm blgm = (blgm) bkxi.mo66427a(bkqh.f125111a);
        if (blgm.equals(f124984d)) {
            long longValue = ((Number) bkxi.mo66427a(bkxg.f125375a)).longValue();
            obj = bkti.m106597a(bkxi);
            str = null;
            j = longValue;
        } else if (blgm.equals(f124982b)) {
            obj = null;
            j = 0;
            str = bkxi.mo66434g();
        } else {
            blgl blgl = blgm.f126445b;
            if (blgl == blgl.NUMBER_VALUE) {
                obj = null;
                j = 0;
                str = null;
            } else if (blgl == blgl.STRING_VALUE) {
                obj = null;
                j = 0;
                str = null;
            } else {
                String valueOf = String.valueOf(blgl);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Payload type should be number or string, but was: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        bkxi.mo66431d();
        bkxi.mo66431d();
        return new bkoc(b, str, j, obj, blgm);
    }
}
