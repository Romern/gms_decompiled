package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.credentialsaving.CredentialSavingChimeraService;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hfg implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hwp f19647a;

    public hfg(hwp hwp) {
        this.f19647a = hwp;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) obj;
        try {
            hwp hwp = this.f19647a;
            Status status = Status.f30107a;
            sdo.m34959a(saveAccountLinkingTokenResult);
            hwp.mo12785a(status, saveAccountLinkingTokenResult);
        } catch (RemoteException e) {
            hfi.f19649a.mo25417e("Unable to return the success result to the caller.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        try {
            adbe a = adbe.m50109a(th);
            if (a.f61236a == 8) {
                hfi.f19649a.mo25417e("Internal error.", a, new Object[0]);
            }
            this.f19647a.mo12785a(CredentialSavingChimeraService.m6357a(a), (SaveAccountLinkingTokenResult) null);
        } catch (RemoteException e) {
            hfi.f19649a.mo25417e("Unable to return the failure result to the caller.", e, new Object[0]);
        }
    }
}
