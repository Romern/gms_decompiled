package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hbd implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hvq f19399a;

    public hbd(hvq hvq) {
        this.f19399a = hvq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        try {
            hvq hvq = this.f19399a;
            Status status = Status.f30107a;
            sdo.m34959a(authorizationResult);
            hvq.mo12778a(status, authorizationResult);
        } catch (RemoteException e) {
            hbe.f19400a.mo25417e("Unable to return the success result to the caller", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        Status status;
        try {
            adbe a = adbe.m50109a(th);
            if (a.f61236a == 8) {
                hbe.f19400a.mo25417e("Internal error.", a, new Object[0]);
            }
            hvq hvq = this.f19399a;
            int i = a.f61236a;
            if (i == 7) {
                status = new Status(7);
            } else if (i == 28433) {
                status = new Status(16, "Cannot find a matching credential.");
            } else if (i == 28436) {
                status = new Status(16, "Caller has been temporarily blacklisted due to too many canceled sign-in prompts");
            } else if (i == 28442) {
                status = new Status(10, "Invalid calling package");
            } else if (i != 28443) {
                status = Status.f30109c;
            } else {
                status = new Status(10, "Caller not whitelisted to call Authorization APIs");
            }
            hvq.mo12778a(status, (AuthorizationResult) null);
        } catch (RemoteException e) {
            hbe.f19400a.mo25417e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
