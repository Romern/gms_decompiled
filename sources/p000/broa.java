package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: broa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class broa implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143055a;

    public broa(brpj brpj) {
        this.f143055a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        brpj brpj = this.f143055a;
        try {
            brpp brpp = brpj.f143129c;
            Parcel bj = brpp.mo8529bj();
            dcl.m8165a(bj, getTokenResponse);
            brpp.mo8530c(1, bj);
        } catch (RemoteException e) {
            brpj.f143128b.mo25417e("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143055a.mo69680a(brrv.m114516a(str));
    }
}
