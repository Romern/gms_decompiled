package p000;

import android.os.RemoteException;

/* renamed from: brow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brow implements brpv {

    /* renamed from: a */
    final /* synthetic */ brpv f143103a;

    /* renamed from: b */
    final /* synthetic */ brox f143104b;

    public brow(brox brox, brpv brpv) {
        this.f143104b = brox;
        this.f143103a = brpv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69749a(Object obj) {
        Void voidR = (Void) obj;
        brpj brpj = this.f143104b.f143105a;
        try {
            brpp brpp = brpj.f143129c;
            brpp.mo8530c(6, brpp.mo8529bj());
        } catch (RemoteException e) {
            brpj.f143128b.mo25417e("RemoteException when sending delete account response.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo69750a(String str) {
        this.f143103a.mo69750a(str);
    }
}
