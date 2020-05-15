package p000;

/* renamed from: bryh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bryh {

    /* renamed from: a */
    public static final bryh f143647a = new bryh(bryf.PROCEED, null, null, null);

    /* renamed from: b */
    public static final bryh f143648b = new bryh(bryf.DELAY_START, null, null, null);

    /* renamed from: c */
    public final bryf f143649c;

    /* renamed from: d */
    public final bryg f143650d = null;

    /* renamed from: e */
    public final bryc f143651e;

    /* renamed from: f */
    public final chqo f143652f;

    /* renamed from: g */
    private final bqgg f143653g;

    private bryh(bryf bryf, bryc bryc, bqgg bqgg, chqo chqo) {
        bmxy.m108581a(bryf);
        this.f143649c = bryf;
        this.f143651e = bryc;
        this.f143653g = bqgg;
        this.f143652f = chqo;
    }

    /* renamed from: a */
    public static bryh m114872a(bqgg bqgg) {
        bmxy.m108581a(bqgg);
        return new bryh(bryf.CONTINUE_AFTER, null, bqgg, null);
    }

    /* renamed from: a */
    public static bryh m114873a(chqo chqo) {
        bmxy.m108581a(chqo);
        return new bryh(bryf.PROCEED, null, null, chqo);
    }

    /* renamed from: a */
    public static bryh m114874a(chuv chuv, chtr chtr) {
        bmxy.m108581a(chuv);
        bmxy.m108581a(chtr);
        bmxy.m108601b(!chuv.mo85689a(), "Error status must not be ok");
        return new bryh(bryf.ABORT_WITH_EXCEPTION, new bryc(chuv, chtr), null, null);
    }

    /* renamed from: a */
    public final bqgg mo70080a() {
        bmxy.m108600b(this.f143649c == bryf.CONTINUE_AFTER);
        return this.f143653g;
    }
}
