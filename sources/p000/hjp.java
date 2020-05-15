package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.ListSignInCredentialsResult;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: hjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hjp implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hwl f19910a;

    public hjp(hwl hwl) {
        this.f19910a = hwl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        List list = (List) obj;
        sdo.m34974b(!list.isEmpty());
        try {
            this.f19910a.mo12783a(Status.f30107a, new ListSignInCredentialsResult(list));
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
            this.f19910a.mo12783a(a.mo33302b(), null);
        } catch (RemoteException e) {
            hju.f19915a.mo25417e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
