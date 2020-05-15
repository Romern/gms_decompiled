package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.manager.yolo.CredentialsInternalChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: hpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class hpz implements bqfp {

    /* renamed from: a */
    private final hih f20203a;

    /* renamed from: b */
    private final Object f20204b;

    public hpz(hih hih, Object obj) {
        this.f20203a = hih;
        this.f20204b = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract gwo mo12674a(Status status, Object obj);

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        try {
            this.f20203a.mo12276a(mo12674a(Status.f30107a, obj).mo12266b());
        } catch (RemoteException e) {
            CredentialsInternalChimeraService.f10143a.mo25417e("Error when triggering the callbacks.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        try {
            adbe a = adbe.m50109a(th);
            if (a.f61236a == 8) {
                CredentialsInternalChimeraService.f10143a.mo25417e("Internal error.", a, new Object[0]);
            }
            this.f20203a.mo12276a(mo12674a(a.mo33302b(), this.f20204b).mo12266b());
        } catch (RemoteException e) {
            CredentialsInternalChimeraService.f10143a.mo25417e("Error when triggering the callbacks.", e, new Object[0]);
        }
    }
}
