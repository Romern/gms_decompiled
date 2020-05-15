package p000;

import android.os.RemoteException;

/* renamed from: broy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class broy implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpj f143107a;

    public broy(brpj brpj) {
        this.f143107a = brpj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        Void voidR = (Void) obj;
        brpj brpj = this.f143107a;
        try {
            brpp brpp = brpj.f143129c;
            brpp.mo8530c(13, brpp.mo8529bj());
        } catch (RemoteException e) {
            brpj.f143128b.mo25417e("RemoteException when setting FirebaseUI Version", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143107a.mo69680a(brrv.m114516a(str));
    }
}
