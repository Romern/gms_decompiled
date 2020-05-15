package p000;

import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedIdpSignInAidlResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: brph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brph {

    /* renamed from: a */
    public static final Logger f143124a = new Logger("FBAuthApiDispatcher", new String[0]);

    /* renamed from: b */
    public final brpw f143125b;

    /* renamed from: c */
    public final brpi f143126c;

    public brph(brpw brpw, brpi brpi) {
        sdo.m34959a(brpw);
        this.f143125b = brpw;
        sdo.m34959a(brpi);
        this.f143126c = brpi;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m114351a(GetTokenResponse getTokenResponse, String str, String str2, Boolean bool, DefaultOAuthCredential defaultOAuthCredential, brpj brpj, brpu brpu) {
        sdo.m34959a(getTokenResponse);
        sdo.m34959a(brpu);
        sdo.m34959a(brpj);
        this.f143125b.mo69781a(new brqk(getTokenResponse.f152527b), new brnw(brpu, str2, str, bool, defaultOAuthCredential, brpj, getTokenResponse));
    }

    /* renamed from: a */
    public final void mo69751a(brpj brpj, GetTokenResponse getTokenResponse, brra brra, brpu brpu) {
        sdo.m34959a(brpj);
        sdo.m34959a(getTokenResponse);
        sdo.m34959a(brra);
        sdo.m34959a(brpu);
        this.f143125b.mo69781a(new brqk(getTokenResponse.f152527b), new brnu(this, brpu, brpj, getTokenResponse, brra));
    }

    /* renamed from: a */
    public final void mo69752a(brpj brpj, GetTokenResponse getTokenResponse, GetAccountInfoUser getAccountInfoUser, brra brra, brpu brpu) {
        sdo.m34959a(brpj);
        sdo.m34959a(getTokenResponse);
        sdo.m34959a(getAccountInfoUser);
        sdo.m34959a(brra);
        sdo.m34959a(brpu);
        this.f143125b.mo69784a(brra, new brnv(brra, getAccountInfoUser, brpj, getTokenResponse, brpu));
    }

    /* renamed from: a */
    public final void mo69753a(brqc brqc, brpj brpj) {
        sdo.m34959a(brqc);
        sdo.m34959a(brpj);
        this.f143125b.mo69774a(brqc, new brqd(), cdxz.m135248c(), "emailLinkSignin").mo50371a(new brlo(new brnt(this, brpj)));
    }

    /* renamed from: a */
    public final void mo69754a(brqo brqo, brpj brpj) {
        sdo.m34959a(brqo);
        sdo.m34959a(brpj);
        this.f143125b.mo69782a(brqo, new broz(brpj));
    }

    /* renamed from: a */
    public final void mo69755a(brrk brrk, brpj brpj, brpu brpu) {
        Status status;
        if (!brrk.f143234a && TextUtils.isEmpty(brrk.f143242i)) {
            m114351a(new GetTokenResponse(brrk.f143236c, brrk.f143235b, Long.valueOf(brrk.f143237d), "Bearer"), brrk.f143240g, brrk.f143239f, Boolean.valueOf(brrk.f143241h), brrk.mo69819c(), brpj, brpu);
            return;
        }
        DefaultOAuthCredential c = brrk.mo69819c();
        String str = brrk.f143238e;
        String str2 = brrk.f143243j;
        if (brrk.f143234a) {
            status = new Status(17012);
        } else {
            status = brrv.m114516a(brrk.f143242i);
        }
        if (this.f143126c.mo69757a()) {
            OnFailedIdpSignInAidlResponse onFailedIdpSignInAidlResponse = new OnFailedIdpSignInAidlResponse(status, c, str, str2);
            try {
                brpp brpp = brpj.f143129c;
                Parcel bj = brpp.mo8529bj();
                dcl.m8165a(bj, onFailedIdpSignInAidlResponse);
                brpp.mo8530c(14, bj);
            } catch (RemoteException e) {
                brpj.f143128b.mo25417e("RemoteException when sending failure result with credential", e, new Object[0]);
            }
        } else {
            brpj.mo69680a(status);
        }
    }

    /* renamed from: a */
    public final void mo69756a(String str, brpv brpv) {
        sdo.m34959a(brpv);
        sdo.m34977c(str);
        GetTokenResponse a = GetTokenResponse.m118899a(str);
        if (System.currentTimeMillis() + 300000 < a.f152530e.longValue() + (a.f152528c.longValue() * 1000)) {
            brpv.mo69749a(a);
            return;
        }
        this.f143125b.mo69780a(new brqj(a.f152526a), new brpg(brpv));
    }
}
