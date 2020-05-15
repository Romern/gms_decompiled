package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: xuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xuo implements bqfp {

    /* renamed from: a */
    final /* synthetic */ xup f53175a;

    public xuo(xup xup) {
        this.f53175a = xup;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        try {
            this.f53175a.f53177a.mo29966a(((bmxv) obj).mo66813a());
        } catch (RemoteException e) {
            xup.f53176b.mo25417e("Remote error.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        xup.f53176b.mo25417e("Error when getting the key.", th, new Object[0]);
        try {
            this.f53175a.f53177a.mo29965a(Status.f30109c);
        } catch (RemoteException e) {
            xup.f53176b.mo25417e("Remote error.", e, new Object[0]);
        }
    }
}
