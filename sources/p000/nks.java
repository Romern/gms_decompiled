package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.telecom.DisconnectCause;
import android.telecom.GatewayInfo;
import com.google.android.gms.car.CarCall;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nks implements nib {

    /* renamed from: a */
    final /* synthetic */ nkw f35917a;

    public nks(nkw nkw) {
        this.f35917a = nkw;
    }

    /* renamed from: a */
    public final void mo20979a(nid nid) {
        CharSequence charSequence;
        String str;
        Uri uri;
        Uri uri2;
        nkw nkw = this.f35917a;
        bnsn bnsn = nkw.f35922a;
        synchronized (nkw.f35923b) {
            CarCall a = this.f35917a.f35927f.mo21022a(nid);
            int i = a.f29283a;
            GatewayInfo b = nid.mo20726b();
            DisconnectCause a2 = nid.mo20724a();
            if (a2 != null) {
                charSequence = a2.getLabel();
            } else {
                charSequence = null;
            }
            if (!ccwj.m131930b()) {
                Uri c = nid.mo20728c();
                String e = nid.mo20730e();
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                long d = nid.mo20729d();
                if (b != null) {
                    uri = nid.mo20726b().getOriginalAddress();
                } else {
                    uri = null;
                }
                if (b != null) {
                    uri2 = nid.mo20726b().getGatewayAddress();
                } else {
                    uri2 = null;
                }
                a.f29288f = new CarCall.Details(c, e, str, d, uri, uri2, 0, null, 0, null, null, 0, null);
            } else {
                a.f29288f = new CarCall.Details(nid.mo20728c(), nid.mo20730e(), charSequence != null ? charSequence.toString() : null, nid.mo20729d(), b != null ? b.getOriginalAddress() : null, b != null ? b.getGatewayAddress() : null, nid.mo20732f(), nid.mo20733g(), nid.mo20734h(), nid.mo20736i(), nid.mo20737j(), nid.mo20738k(), b);
            }
            for (nkv nkv : this.f35917a.f35924c.values()) {
                try {
                    nkv.f35921b.mo21474a(a, a.f29288f);
                } catch (RemoteException e2) {
                    bnsi b2 = nkw.f35922a.mo68387b();
                    b2.mo68437a(e2);
                    b2.mo68432a("nks", "a", 754, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo20985b(nid nid) {
        nkw nkw = this.f35917a;
        bnsn bnsn = nkw.f35922a;
        synchronized (nkw.f35923b) {
            CarCall a = this.f35917a.f35927f.mo21022a(nid);
            int i = a.f29283a;
            for (nkv nkv : this.f35917a.f35924c.values()) {
                try {
                    nkv.f35921b.mo21482c(a);
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nks", "b", 800, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo20987c(nid nid, List list) {
        nkw nkw = this.f35917a;
        bnsn bnsn = nkw.f35922a;
        synchronized (nkw.f35923b) {
            for (nkv nkv : this.f35917a.f35924c.values()) {
                try {
                    CarCall a = this.f35917a.f35927f.mo21022a(nid);
                    if (!ccwj.m131930b()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            CarCall a2 = this.f35917a.f35927f.mo21022a((nid) it.next());
                            int i = a.f29283a;
                            int i2 = a2.f29283a;
                            arrayList.add(a2);
                        }
                        nkv.f35921b.mo21483c(a, arrayList);
                    } else {
                        List a3 = this.f35917a.f35927f.mo21023a(list);
                        a.f29291i = a3;
                        nkv.f35921b.mo21483c(a, a3);
                    }
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nks", "c", 831, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo20986b(nid nid, List list) {
        nkw nkw = this.f35917a;
        bnsn bnsn = nkw.f35922a;
        synchronized (nkw.f35923b) {
            CarCall a = this.f35917a.f35927f.mo21022a(nid);
            a.f29285c = list;
            for (nkv nkv : this.f35917a.f35924c.values()) {
                try {
                    nkv.f35921b.mo21481b(a, list);
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nks", "b", 770, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20980a(nid nid, int i) {
        nkw nkw = this.f35917a;
        bnsn bnsn = nkw.f35922a;
        synchronized (nkw.f35923b) {
            CarCall a = this.f35917a.f35927f.mo21022a(nid);
            a.f29287e = i;
            int i2 = a.f29283a;
            for (nkv nkv : this.f35917a.f35924c.values()) {
                try {
                    nkv.f35921b.mo21473a(a, i);
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nks", "a", 649, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20981a(nid nid, String str) {
        nkw nkw = this.f35917a;
        bnsn bnsn = nkw.f35922a;
        synchronized (nkw.f35923b) {
            CarCall a = this.f35917a.f35927f.mo21022a(nid);
            a.f29286d = str;
            for (nkv nkv : this.f35917a.f35924c.values()) {
                try {
                    nkv.f35921b.mo21476a(a, str);
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nks", "a", 785, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20982a(nid nid, String str, Bundle bundle) {
        if (ccwj.m131930b()) {
            nkw nkw = this.f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                for (nkv nkv : this.f35917a.f35924c.values()) {
                    try {
                        nkv.f35921b.mo21477a(this.f35917a.f35927f.mo21022a(nid), str, bundle);
                    } catch (RemoteException e) {
                        bnsi b = nkw.f35922a.mo68387b();
                        b.mo68437a(e);
                        b.mo68432a("nks", "a", 846, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68405a("RemoteException in CarCallListener.");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20983a(nid nid, List list) {
        nkw nkw = this.f35917a;
        bnsn bnsn = nkw.f35922a;
        synchronized (nkw.f35923b) {
            CarCall a = this.f35917a.f35927f.mo21022a(nid);
            a.f29289g = !list.isEmpty();
            for (nkv nkv : this.f35917a.f35924c.values()) {
                try {
                    if (!ccwj.m131930b()) {
                        ArrayList arrayList = new ArrayList(list.size());
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            CarCall a2 = this.f35917a.f35927f.mo21022a((nid) it.next());
                            int i = a.f29283a;
                            arrayList.add(a2);
                        }
                        nkv.f35921b.mo21478a(a, arrayList);
                    } else {
                        List a3 = this.f35917a.f35927f.mo21023a(list);
                        a.f29290h = a3;
                        nkv.f35921b.mo21478a(a, a3);
                    }
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nks", "a", 699, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20984a(nid nid, nid nid2) {
        nkw nkw = this.f35917a;
        bnsn bnsn = nkw.f35922a;
        synchronized (nkw.f35923b) {
            CarCall a = this.f35917a.f35927f.mo21022a(nid);
            CarCall a2 = this.f35917a.f35927f.mo21022a(nid2);
            a.f29284b = a2;
            for (nkv nkv : this.f35917a.f35924c.values()) {
                try {
                    int i = a.f29283a;
                    nkv.f35921b.mo21475a(a, a2);
                } catch (RemoteException e) {
                    bnsi b = nkw.f35922a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("nks", "a", 668, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("RemoteException in CarCallListener.");
                }
            }
        }
    }
}
