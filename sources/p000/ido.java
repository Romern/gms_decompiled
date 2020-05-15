package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: ido */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ido implements bqfp {

    /* renamed from: a */
    final /* synthetic */ idp f20766a;

    public ido(idp idp) {
        this.f20766a = idp;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        try {
            this.f20766a.f20768b.mo12919a((GoogleSignInAccount) ((bmxv) obj).mo66815c(), Status.f30107a);
            this.f20766a.mo12947a(0);
        } catch (RemoteException e) {
            idp.f20767a.mo25415d("RemoteException when calling back onSilentSignedInToGoogle().", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        try {
            Status b = idw.m15306b(idw.m15305a(th));
            this.f20766a.mo6503a(b);
            this.f20766a.mo12947a(b.f30115i);
        } catch (RemoteException e) {
            idp.f20767a.mo25415d("RemoteException when calling back onSilentSignedInToGoogle", e, new Object[0]);
        }
    }
}
