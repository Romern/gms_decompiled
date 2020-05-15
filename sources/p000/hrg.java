package p000;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: hrg */
final /* synthetic */ class hrg implements bqeh {

    /* renamed from: a */
    private final hrr f20300a;

    /* renamed from: b */
    private final hez f20301b;

    public hrg(hrr hrr, hez hez) {
        this.f20300a = hrr;
        this.f20301b = hez;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hrr hrr = this.f20300a;
        hez hez = this.f20301b;
        bngx bngx = (bngx) obj;
        if (!bngx.isEmpty()) {
            Context context = hrr.f20319a;
            String str = hrr.f20321c;
            CredentialRequest credentialRequest = hrr.f20322d;
            return new hoh(context, str, bngx, credentialRequest.f10105b, credentialRequest.mo7408a()).mo12291a(hez);
        }
        throw adbe.m50106a(28434);
    }
}
