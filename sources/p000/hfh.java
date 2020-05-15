package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.credentialsaving.CredentialSavingChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: hfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hfh implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hff f19648a;

    public hfh(hff hff) {
        this.f19648a = hff;
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        try {
            this.f19648a.mo12449a(Status.f30107a, obj);
        } catch (RemoteException e) {
            hfi.f19649a.mo25417e("Unable to return the success result to the caller", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        try {
            adbe a = adbe.m50109a(th);
            if (a.f61236a == 8) {
                hfi.f19649a.mo25417e("Internal error.", a, new Object[0]);
            }
            this.f19648a.mo12449a(CredentialSavingChimeraService.m6357a(a), null);
        } catch (RemoteException e) {
            hfi.f19649a.mo25417e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
