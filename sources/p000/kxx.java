package p000;

import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.data.PaymentCard;

/* renamed from: kxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kxx extends keo {

    /* renamed from: d */
    private static final bnhe f25375d;

    /* renamed from: a */
    public final kwu f25376a;

    /* renamed from: b */
    public final boolean f25377b;

    /* renamed from: c */
    public final int f25378c;

    /* renamed from: e */
    private final keo f25379e;

    /* renamed from: f */
    private final bmzq f25380f;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(Credential.class, laz.CREDENTIAL);
        h.mo67695b(PaymentCard.class, laz.PAYMENT_CARD);
        h.mo67695b(kde.class, laz.PERSON_NAME);
        h.mo67695b(kdg.class, laz.POSTAL_ADDRESS);
        h.mo67695b(kdf.class, laz.PHONE_NUMBER);
        h.mo67695b(kcy.class, laz.EMAIL_ADDRESS);
        f25375d = h.mo67618b();
    }

    public kxx(keo keo, bmzq bmzq, kwu kwu, int i, boolean z) {
        this.f25379e = keo;
        this.f25380f = bmzq;
        this.f25376a = kwu;
        this.f25378c = i;
        this.f25377b = z;
    }

    /* renamed from: a */
    public static laz m18759a(Class cls) {
        laz laz = (laz) f25375d.get(cls);
        return laz == null ? laz.UNKNOWN_DATA_TYPE : laz;
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        bmza b = bmza.m108659b(this.f25380f);
        bqgg a = this.f25379e.mo14429a(kej);
        a.mo741a(new kxt(this, b, a, kej), bqfb.INSTANCE);
        return a;
    }

    /* renamed from: a */
    public final bqgg mo14430a(kem kem) {
        bmza b = bmza.m108659b(this.f25380f);
        bqgg a = this.f25379e.mo14430a(kem);
        a.mo741a(new kxu(this, b, a, kem), bqfb.INSTANCE);
        return a;
    }
}
