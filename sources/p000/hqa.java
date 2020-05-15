package p000;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: hqa */
final /* synthetic */ class hqa implements bqeh {

    /* renamed from: a */
    private final hqb f20213a;

    /* renamed from: b */
    private final hez f20214b;

    public hqa(hqb hqb, hez hez) {
        this.f20213a = hqb;
        this.f20214b = hez;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hqb hqb = this.f20213a;
        hez hez = this.f20214b;
        Context context = hqb.f20215a;
        String str = hqb.f20216b;
        CredentialRequest credentialRequest = hqb.f20217c;
        return new hoh(context, str, (bngx) obj, credentialRequest.f10105b, credentialRequest.mo7408a()).mo12291a(hez);
    }
}
