package p000;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: brpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpf implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143122a;

    public brpf(brpj brpj) {
        this.f143122a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brpj brpj = this.f143122a;
        String str = ((brrb) obj).f143212a;
        try {
            brpp brpp = brpj.f143129c;
            Parcel bj = brpp.mo8529bj();
            bj.writeString(str);
            brpp.mo8530c(8, bj);
        } catch (RemoteException e) {
            brpj.f143128b.mo25417e("RemoteException when sending set account info response.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143122a.mo69680a(brrv.m114516a(str));
    }
}
