package p000;

import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.car.CarCall;

/* renamed from: nkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nkr implements ntt {

    /* renamed from: a */
    final /* synthetic */ nkw f35916a;

    public nkr(nkw nkw) {
        this.f35916a = nkw;
    }

    /* renamed from: a */
    public final void mo20976a(ntv ntv, nhl nhl) {
        nkw nkw = this.f35916a;
        bnsn bnsn = nkw.f35922a;
        synchronized (nkw.f35923b) {
            for (nkv nkv : this.f35916a.f35924c.values()) {
                try {
                    nkv.f35921b.mo21479a(nhl.mo20683a(), nhl.mo20685c(), nhl.mo20684b());
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nkr", "a", 590, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo20978b(ntv ntv, nid nid) {
        nid.mo20727b(this.f35916a.f35931j);
        nkw nkw = this.f35916a;
        bnsn bnsn = nkw.f35922a;
        CarCall a = nkw.f35927f.mo21022a(nid);
        bnsi d = nkw.f35922a.mo68390d();
        d.mo68432a("nkr", "b", 620, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("onCallRemoved (%d)", a.f29283a);
        nla nla = this.f35916a.f35927f;
        if (((CarCall) nla.f35938b.get(nid)) != null) {
            nla.f35938b.remove(nid);
        } else {
            bnsi c = nla.f35936a.mo68388c();
            c.mo68432a("nla", "b", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("Unable to remove CarCall for %s", nid);
        }
        synchronized (this.f35916a.f35923b) {
            for (nkv nkv : this.f35916a.f35924c.values()) {
                try {
                    nkv.f35921b.mo21480b(a);
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nkr", "b", 628, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20977a(ntv ntv, nid nid) {
        nkw nkw = this.f35916a;
        bnsn bnsn = nkw.f35922a;
        CarCall a = nkw.f35927f.mo21022a(nid);
        bnsi d = nkw.f35922a.mo68390d();
        d.mo68432a("nkr", "a", 601, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("onCallAdded (%d)", a.f29283a);
        nid.mo20725a(this.f35916a.f35931j);
        synchronized (this.f35916a.f35923b) {
            for (nkv nkv : this.f35916a.f35924c.values()) {
                try {
                    nkv.f35921b.mo21472a(a);
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nkr", "a", 609, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }
}
