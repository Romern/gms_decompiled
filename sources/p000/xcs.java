package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;

/* renamed from: xcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xcs implements bqfp {

    /* renamed from: a */
    final /* synthetic */ xct f51960a;

    public xcs(xct xct) {
        this.f51960a = xct;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        try {
            this.f51960a.f51963b.mo29955a(Status.f30107a, (KeyData) ((bmxv) obj).mo66815c());
        } catch (RemoteException e) {
            xct.f51961d.mo25416d("Client died during GetKeyOperation", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        try {
            this.f51960a.f51963b.mo29955a(adbe.m50109a(th).mo33302b(), null);
        } catch (RemoteException e) {
            xct.f51961d.mo25416d("Client died during GetKeyOperation", new Object[0]);
        }
    }
}
