package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: gws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gws implements bqfp {

    /* renamed from: a */
    final /* synthetic */ gwu f19131a;

    public gws(gwu gwu) {
        this.f19131a = gwu;
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        try {
            this.f19131a.mo12286a(Status.f30107a, obj);
        } catch (RemoteException e) {
            gwt.f19132a.mo25417e("Unable to return the success result to the caller", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        Status status;
        try {
            adbe a = adbe.m50109a(th);
            if (a.f61236a == 8) {
                gwt.f19132a.mo25417e("Internal error.", a, new Object[0]);
            }
            gwu gwu = this.f19131a;
            int i = a.f61236a;
            if (i == 7) {
                status = new Status(7);
            } else if (i == 11000) {
                status = new Status(6, "Passphrase required.");
            } else if (i == 28433) {
                status = new Status(16, "Cannot find a matching credential.");
            } else if (i == 28436) {
                status = new Status(16, "Caller has been temporarily blacklisted due to too many canceled sign-in prompts");
            } else if (i == 28442) {
                status = new Status(10, "Invalid calling package");
            } else if (i != 28443) {
                status = Status.f30109c;
            } else {
                status = new Status(10, "Caller not whitelisted to call SignIn APIs");
            }
            gwu.mo12286a(status, null);
        } catch (RemoteException e) {
            gwt.f19132a.mo25417e("Unable to return the failure result to the caller", e, new Object[0]);
        }
    }
}
