package p000;

import android.os.RemoteException;

/* renamed from: bihe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bihe implements afcs {

    /* renamed from: a */
    final /* synthetic */ boolean f120593a;

    public bihe(boolean z) {
        this.f120593a = z;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        afcw d = afcn.mo34758d();
        try {
            d.f64189a.mo34828a(this.f120593a);
            try {
                d.f64189a.mo34829b(this.f120593a);
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        } catch (RemoteException e2) {
            throw new afhl(e2);
        }
    }
}
