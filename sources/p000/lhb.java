package p000;

import com.google.android.gms.autofill.data.Credential;

/* renamed from: lhb */
final /* synthetic */ class lhb implements bqeh {

    /* renamed from: a */
    private final lhe f26083a;

    /* renamed from: b */
    private final kel f26084b;

    /* renamed from: c */
    private final Credential f26085c;

    public lhb(lhe lhe, kel kel, Credential credential) {
        this.f26083a = lhe;
        this.f26084b = kel;
        this.f26085c = credential;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        lhe lhe = this.f26083a;
        kel kel = this.f26084b;
        Credential credential = this.f26085c;
        bmxv bmxv = (bmxv) obj;
        if (!bmxv.mo66813a()) {
            return lhe.m19050a(lhe.f26091c.mo14430a(new kem(kel, credential)));
        }
        return lhe.m19050a(lhe.f26091c.mo14430a(new kem(kel, new Credential((String) bmxv.mo66814b(), credential.f11609b, credential.f11610c, credential.f11611d))));
    }
}
