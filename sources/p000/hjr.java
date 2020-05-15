package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hjr implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hwo f19912a;

    public hjr(hwo hwo) {
        this.f19912a = hwo;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        MatchPasswordResult matchPasswordResult = (MatchPasswordResult) obj;
        try {
            hwo hwo = this.f19912a;
            Status status = Status.f30107a;
            sdo.m34959a(matchPasswordResult);
            hwo.mo12784a(status, matchPasswordResult);
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
            this.f19912a.mo12784a(a.mo33302b(), null);
        } catch (RemoteException e) {
            hju.f19915a.mo25417e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
