package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: afou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afou implements bqfp {

    /* renamed from: a */
    final /* synthetic */ afov f64470a;

    public afou(afov afov) {
        this.f64470a = afov;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f64470a.f64471a.mo11797a(Status.f30107a);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during AddConfigsForDownloadOperation", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bbev.m87908a(th, "%s: Failed AddConfigsForDownloadOperation", "Service");
        try {
            this.f64470a.f64471a.mo11797a(Status.f30109c);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during AddConfigsForDownloadOperation", new Object[0]);
        }
    }
}
