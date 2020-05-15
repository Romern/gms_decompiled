package p000;

import com.google.android.gms.autofill.data.Credential;

/* renamed from: kfq */
final /* synthetic */ class kfq implements bqeh {

    /* renamed from: a */
    private final kcv f24002a;

    public kfq(kcv kcv) {
        this.f24002a = kcv;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        kcv kcv = this.f24002a;
        bnia j = bnic.m109500j();
        bnrd a = ((bnic) obj).iterator();
        while (a.hasNext()) {
            kct kct = (kct) a.next();
            if (kct.mo14368a() instanceof Credential) {
                Credential credential = (Credential) kct.mo14368a();
                if (credential.f11611d.contains(kcv)) {
                    j.mo67629b(credential);
                }
            }
        }
        return bqga.m112775a((Object) j.mo67751a());
    }
}
