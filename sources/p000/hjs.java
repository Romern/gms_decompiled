package p000;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hjs implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hwe f19913a;

    public hjs(hwe hwe) {
        this.f19913a = hwe;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        try {
            this.f19913a.mo12782a(Status.f30107a, new GetDefaultAccountResult((Account) ((bmxv) obj).mo66815c()));
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
            this.f19913a.mo12782a(a.mo33302b(), null);
        } catch (RemoteException e) {
            hju.f19915a.mo25417e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
