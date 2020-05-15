package p000;

import android.os.RemoteException;

/* renamed from: bihm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bihm implements afcs {

    /* renamed from: a */
    final /* synthetic */ biht f120603a;

    public bihm(biht biht) {
        this.f120603a = biht;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        this.f120603a.f120618f = afcn;
        try {
            afcn.f64181a.mo34813g();
            try {
                afcn.f64181a.mo34815i();
                afcn.mo34754a(true);
                afcn.mo34750a((afck) this.f120603a);
                afcn.mo34752a((afcm) this.f120603a);
                afcn.mo34751a((afcl) this.f120603a);
                afcn.mo34758d().mo34771c();
                afcn.mo34758d().mo34772d();
                afcn.mo34758d().mo34771c();
                afcn.mo34758d().mo34769a(true);
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        } catch (RemoteException e2) {
            throw new afhl(e2);
        }
    }
}
