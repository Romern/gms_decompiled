package p000;

import com.google.android.gms.auth.cryptauth.SignedBlob;

/* renamed from: xdt */
final /* synthetic */ class xdt implements aubw {

    /* renamed from: a */
    private final aucb f52022a;

    /* renamed from: b */
    private final xpj f52023b;

    /* renamed from: c */
    private final xeb f52024c;

    public xdt(aucb aucb, xeb xeb, xpj xpj) {
        this.f52022a = aucb;
        this.f52024c = xeb;
        this.f52023b = xpj;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        aucb aucb = this.f52022a;
        SignedBlob signedBlob = (SignedBlob) obj;
        this.f52024c.mo29678a(((SignedBlob) aucb.mo50386d()).f10557b, this.f52023b);
    }
}
