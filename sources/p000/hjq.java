package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hjq implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hvw f19911a;

    public hjq(hvw hvw) {
        this.f19911a = hvw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        CompleteSignInResult completeSignInResult = (CompleteSignInResult) obj;
        try {
            hvw hvw = this.f19911a;
            Status status = Status.f30107a;
            sdo.m34959a(completeSignInResult);
            hvw.mo12779a(status, completeSignInResult);
        } catch (RemoteException e) {
            hju.f19915a.mo25417e("Unable to return the success result to the caller", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        adbe a = adbe.m50109a(th);
        if (a.f61236a == 8) {
            hju.f19915a.mo25417e("Internal error.", a, new Object[0]);
        }
        try {
            this.f19911a.mo12779a(a.mo33302b(), null);
        } catch (RemoteException e) {
            hju.f19915a.mo25417e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
