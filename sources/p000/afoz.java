package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: afoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afoz implements bqfp {

    /* renamed from: a */
    final /* synthetic */ afpa f64488a;

    public afoz(afpa afpa) {
        this.f64488a = afpa;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f64488a.f64489a.mo11797a(Status.f30107a);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during DownloadPendingGroupsOperation", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bbev.m87908a(th, "%s: Failed DownloadPendingGroupsOperation", "Service");
        try {
            this.f64488a.f64489a.mo11797a(Status.f30109c);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during DownloadPendingGroupsOperation", new Object[0]);
        }
    }
}
