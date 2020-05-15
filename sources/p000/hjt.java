package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: hjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hjt implements bqfp {

    /* renamed from: a */
    final /* synthetic */ rnt f19914a;

    public hjt(rnt rnt) {
        this.f19914a = rnt;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f19914a.mo11797a(Status.f30107a);
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
            this.f19914a.mo11797a(a.mo33302b());
        } catch (RemoteException e) {
            hju.f19915a.mo25417e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
