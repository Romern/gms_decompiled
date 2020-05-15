package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: arfu */
final /* synthetic */ class arfu implements aubq {

    /* renamed from: a */
    private final arfv f87618a;

    public arfu(arfv arfv) {
        this.f87618a = arfv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        arfv arfv = this.f87618a;
        if (!aucb.mo50384b()) {
            arge.f87642a.mo25410a((Throwable) aucb.mo50387e());
            try {
                arfv.f87619a.mo48601a(Status.f30109c, (List) null);
            } catch (RemoteException e) {
                arge.f87642a.mo25410a((Throwable) e);
            }
        } else {
            try {
                arfv.f87619a.mo48601a(Status.f30107a, (List) aucb.mo50386d());
            } catch (RemoteException e2) {
                arge.f87642a.mo25410a((Throwable) e2);
            }
        }
    }
}
