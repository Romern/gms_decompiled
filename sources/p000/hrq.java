package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: hrq */
final /* synthetic */ class hrq implements bqeh {

    /* renamed from: a */
    private final hrr f20316a;

    /* renamed from: b */
    private final Boolean f20317b;

    /* renamed from: c */
    private final bngx f20318c;

    public hrq(hrr hrr, Boolean bool, bngx bngx) {
        this.f20316a = hrr;
        this.f20317b = bool;
        this.f20318c = bngx;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hrr hrr = this.f20316a;
        Boolean bool = this.f20317b;
        bngx bngx = this.f20318c;
        if (!((Boolean) obj).booleanValue()) {
            return hrr.mo12690a(bool.booleanValue());
        }
        InternalCredentialWrapper internalCredentialWrapper = (InternalCredentialWrapper) bnjd.m109587b(bngx);
        boolean booleanValue = bool.booleanValue();
        Account account = internalCredentialWrapper.f10140b;
        sdo.m34959a(account);
        hky hky = hrr.f20320b;
        acyr a = heb.m14255a(account);
        String str = hrr.f20321c;
        Credential credential = internalCredentialWrapper.f10139a;
        CredentialRequest credentialRequest = hrr.f20322d;
        return bqdx.m112673a(hky.mo12599a(a, str, credential, credentialRequest.f10109f, (String) bmxu.m108565a(credentialRequest.f10110g, str), hrr.f20322d.f10111h), new hrm(hrr, booleanValue, internalCredentialWrapper), bqfb.INSTANCE);
    }
}
