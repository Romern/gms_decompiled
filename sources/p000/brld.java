package p000;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: brld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brld implements brlg {

    /* renamed from: a */
    final /* synthetic */ brli f142907a;

    public brld(brli brli) {
        this.f142907a = brli;
    }

    /* renamed from: a */
    public final void mo69679a(brpj brpj, Object... objArr) {
        String str = this.f142907a.f142918i;
        try {
            brpp brpp = brpj.f143129c;
            Parcel bj = brpp.mo8529bj();
            bj.writeString(str);
            brpp.mo8530c(11, bj);
        } catch (RemoteException e) {
            brpj.f143128b.mo25417e("RemoteException when sending auto retrieval timeout response.", e, new Object[0]);
        }
    }
}
