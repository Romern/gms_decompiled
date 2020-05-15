package p000;

import android.os.RemoteException;

/* renamed from: broz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class broz implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143108a;

    public broz(brpj brpj) {
        this.f143108a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        brqp brqp = (brqp) obj;
        brpj brpj = this.f143108a;
        try {
            brpp brpp = brpj.f143129c;
            brpp.mo8530c(7, brpp.mo8529bj());
        } catch (RemoteException e) {
            brpj.f143128b.mo25417e("RemoteException when sending email verification response.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143108a.mo69680a(brrv.m114516a(str));
    }
}
