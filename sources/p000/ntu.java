package p000;

import android.os.RemoteException;
import android.telecom.AudioState;
import android.telecom.Call;
import android.telecom.Phone;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.car.CarCall;

/* renamed from: ntu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ntu extends Phone.Listener {

    /* renamed from: a */
    final /* synthetic */ ntv f36485a;

    public ntu(ntv ntv) {
        this.f36485a = ntv;
    }

    public final void onAudioStateChanged(Phone phone, AudioState audioState) {
        ntt ntt = this.f36485a.f36487b;
        if (ntt != null) {
            nhl nhl = new nhl(audioState);
            nkw nkw = ((nkr) ntt).f35916a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                for (nkv nkv : ((nkr) ntt).f35916a.f35924c.values()) {
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
    }

    public final void onCallAdded(Phone phone, Call call) {
        ntt ntt = this.f36485a.f36487b;
        if (ntt != null) {
            nid a = nid.m26370a(call);
            nkr nkr = (nkr) ntt;
            nkw nkw = nkr.f35916a;
            bnsn bnsn = nkw.f35922a;
            CarCall a2 = nkw.f35927f.mo21022a(a);
            bnsi d = nkw.f35922a.mo68390d();
            d.mo68432a("nkr", "a", 601, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("onCallAdded (%d)", a2.f29283a);
            a.mo20725a(nkr.f35916a.f35931j);
            synchronized (nkr.f35916a.f35923b) {
                for (nkv nkv : ((nkr) ntt).f35916a.f35924c.values()) {
                    try {
                        nkv.f35921b.mo21472a(a2);
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

    public final void onCallRemoved(Phone phone, Call call) {
        ntt ntt = this.f36485a.f36487b;
        if (ntt != null) {
            nid a = nid.m26370a(call);
            nkr nkr = (nkr) ntt;
            a.mo20727b(nkr.f35916a.f35931j);
            nkw nkw = nkr.f35916a;
            bnsn bnsn = nkw.f35922a;
            CarCall a2 = nkw.f35927f.mo21022a(a);
            bnsi d = nkw.f35922a.mo68390d();
            d.mo68432a("nkr", "b", 620, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("onCallRemoved (%d)", a2.f29283a);
            nla nla = nkr.f35916a.f35927f;
            if (((CarCall) nla.f35938b.get(a)) != null) {
                nla.f35938b.remove(a);
            } else {
                bnsi c = nla.f35936a.mo68388c();
                c.mo68432a("nla", "b", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("Unable to remove CarCall for %s", a);
            }
            synchronized (nkr.f35916a.f35923b) {
                for (nkv nkv : ((nkr) ntt).f35916a.f35924c.values()) {
                    try {
                        nkv.f35921b.mo21480b(a2);
                    } catch (RemoteException e) {
                        bnsi b = nkw.f35922a.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("nkr", "b", 628, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("RemoteException in CarCallListener.");
                    }
                }
            }
        }
    }
}
