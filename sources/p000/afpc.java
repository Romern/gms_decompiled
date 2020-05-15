package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: afpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afpc implements bqfp {

    /* renamed from: a */
    final /* synthetic */ afpd f64493a;

    public afpc(afpd afpd) {
        this.f64493a = afpd;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        try {
            this.f64493a.f64494a.mo34904a(Status.f30107a, (List) obj);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during FileGroupListForDebugUIOperation", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bbev.m87907a(th, "FileGroupListForDebugUIOperation failed");
        try {
            this.f64493a.f64494a.mo34904a(Status.f30109c, null);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during FileGroupsListForDebugUIOperation", new Object[0]);
        }
    }
}
