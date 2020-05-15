package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import java.util.ArrayList;

/* renamed from: hrd */
final /* synthetic */ class hrd implements bqeh {

    /* renamed from: a */
    private final hre f20292a;

    /* renamed from: b */
    private final hez f20293b;

    public hrd(hre hre, hez hez) {
        this.f20292a = hre;
        this.f20293b = hez;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hre hre = this.f20292a;
        hez hez = this.f20293b;
        ArrayList arrayList = new ArrayList();
        for (InternalCredentialWrapper internalCredentialWrapper : (Iterable) obj) {
            Account account = internalCredentialWrapper.f10140b;
            sdo.m34959a(account);
            adbj adbj = adbj.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_REMOVE;
            hky hky = hre.f20294a;
            acyr a = heb.m14255a(account);
            String str = hre.f20295b;
            Credential credential = internalCredentialWrapper.f10139a;
            bqgg a2 = bqdx.m112673a(((hms) hky).f20042b.mo12618b(a, hmt.m14618a(credential, str)), new hmm(credential), bqfb.INSTANCE);
            hez.mo12448a(adbj, a2);
            arrayList.add(a2);
        }
        return bqga.m112785c(arrayList).mo69216a(bqel.m112709a(), bqfb.INSTANCE);
    }
}
