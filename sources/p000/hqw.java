package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.CredentialsChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: hqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hqw implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hii f20260a;

    public hqw(hii hii) {
        this.f20260a = hii;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        try {
            this.f20260a.mo12487a(Status.f30107a, (Credential) obj);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        try {
            adbe a = adbe.m50109a(th);
            if (a.f61236a == 8) {
                CredentialsChimeraService.f10144a.mo25417e("Internal error.", a, new Object[0]);
            }
            this.f20260a.mo12487a(hqz.m14766a(a), (Credential) null);
        } catch (RemoteException e) {
        }
    }
}
