package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;

/* renamed from: brnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnx implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143052a;

    public brnx(brpj brpj) {
        this.f143052a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        CreateAuthUriResponse createAuthUriResponse = (CreateAuthUriResponse) obj;
        brpj brpj = this.f143052a;
        try {
            brpp brpp = brpj.f143129c;
            Parcel bj = brpp.mo8529bj();
            dcl.m8165a(bj, createAuthUriResponse);
            brpp.mo8530c(3, bj);
        } catch (RemoteException e) {
            brpj.f143128b.mo25417e("RemoteException when sending create auth uri response.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143052a.mo69680a(brrv.m114516a(str));
    }
}
