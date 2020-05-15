package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.yolo.CredentialsChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: hqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hqx implements bqfp {

    /* renamed from: a */
    final /* synthetic */ hii f20261a;

    public hqx(hii hii) {
        this.f20261a = hii;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f20261a.mo12486a(Status.f30107a);
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
            this.f20261a.mo12486a(hqz.m14766a(a));
        } catch (RemoteException e) {
        }
    }
}
