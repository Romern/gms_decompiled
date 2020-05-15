package p000;

import android.content.SyncResult;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: uea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uea implements vcd {

    /* renamed from: a */
    final /* synthetic */ ueb f47335a;

    public uea(ueb ueb) {
        this.f47335a = ueb;
    }

    /* renamed from: a */
    public final void mo26997a(SyncResult syncResult) {
        vcv g = this.f47335a.f47239c.mo28306g();
        if (syncResult != null) {
            try {
                if (!syncResult.hasHardError()) {
                    if (!syncResult.hasSoftError()) {
                        this.f47335a.f47238b.mo27971a();
                    } else {
                        g.mo28257b(7);
                        this.f47335a.f47238b.mo27107a(new Status(7, "Network error occurred while syncing."));
                    }
                    g.mo28254a();
                    vcy vcy = this.f47335a.f47239c;
                    vcy.mo28307h();
                    vcy.mo28274a();
                }
            } catch (RemoteException e) {
                ueb.f47336f.mo25378c("RequestSyncOperation", "Unable to report sync result.", e);
                g.mo28256b();
            }
        }
        g.mo28257b(8);
        this.f47335a.f47238b.mo27107a(Status.f30109c);
        g.mo28254a();
        vcy vcy2 = this.f47335a.f47239c;
        vcy2.mo28307h();
        vcy2.mo28274a();
    }
}
