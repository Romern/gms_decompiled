package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.telecom.Call;
import android.telecom.DisconnectCause;
import android.telecom.GatewayInfo;
import com.google.android.gms.car.CarCall;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nic extends Call.Listener {

    /* renamed from: a */
    final /* synthetic */ nid f35687a;

    public nic(nid nid) {
        this.f35687a = nid;
    }

    public final void onCallDestroyed(Call call) {
        nid nid = this.f35687a;
        nib nib = nid.f35689b;
        if (nib != null) {
            nkw nkw = ((nks) nib).f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                CarCall a = ((nks) nib).f35917a.f35927f.mo21022a(nid);
                int i = a.f29283a;
                for (nkv nkv : ((nks) nib).f35917a.f35924c.values()) {
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
    }

    public final void onCannedTextResponsesLoaded(Call call, List list) {
        nid nid = this.f35687a;
        nib nib = nid.f35689b;
        if (nib != null) {
            nkw nkw = ((nks) nib).f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                CarCall a = ((nks) nib).f35917a.f35927f.mo21022a(nid);
                a.f29285c = list;
                for (nkv nkv : ((nks) nib).f35917a.f35924c.values()) {
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
    }

    public final void onChildrenChanged(Call call, List list) {
        nid nid = this.f35687a;
        nib nib = nid.f35689b;
        if (nib != null) {
            List<nid> a = nid.m26369a(list);
            nkw nkw = ((nks) nib).f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                CarCall a2 = ((nks) nib).f35917a.f35927f.mo21022a(nid);
                a2.f29289g = !a.isEmpty();
                for (nkv nkv : ((nks) nib).f35917a.f35924c.values()) {
                    try {
                        if (!ccwj.m131930b()) {
                            ArrayList arrayList = new ArrayList(a.size());
                            for (nid nid2 : a) {
                                CarCall a3 = ((nks) nib).f35917a.f35927f.mo21022a(nid2);
                                int i = a2.f29283a;
                                arrayList.add(a3);
                            }
                            nkv.f35921b.mo21478a(a2, arrayList);
                        } else {
                            List a4 = ((nks) nib).f35917a.f35927f.mo21023a(a);
                            a2.f29290h = a4;
                            nkv.f35921b.mo21478a(a2, a4);
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
    }

    public final void onConferenceableCallsChanged(Call call, List list) {
        nid nid = this.f35687a;
        nib nib = nid.f35689b;
        if (nib != null) {
            List<nid> a = nid.m26369a(list);
            nkw nkw = ((nks) nib).f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                for (nkv nkv : ((nks) nib).f35917a.f35924c.values()) {
                    try {
                        CarCall a2 = ((nks) nib).f35917a.f35927f.mo21022a(nid);
                        if (!ccwj.m131930b()) {
                            ArrayList arrayList = new ArrayList();
                            for (nid nid2 : a) {
                                CarCall a3 = ((nks) nib).f35917a.f35927f.mo21022a(nid2);
                                int i = a2.f29283a;
                                int i2 = a3.f29283a;
                                arrayList.add(a3);
                            }
                            nkv.f35921b.mo21483c(a2, arrayList);
                        } else {
                            List a4 = ((nks) nib).f35917a.f35927f.mo21023a(a);
                            a2.f29291i = a4;
                            nkv.f35921b.mo21483c(a2, a4);
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
    }

    public final void onConnectionEvent(Call call, String str, Bundle bundle) {
        nid nid = this.f35687a;
        nib nib = nid.f35689b;
        if (nib != null && ccwj.m131930b()) {
            nkw nkw = ((nks) nib).f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                for (nkv nkv : ((nks) nib).f35917a.f35924c.values()) {
                    try {
                        nkv.f35921b.mo21477a(((nks) nib).f35917a.f35927f.mo21022a(nid), str, bundle);
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

    public final void onDetailsChanged(Call call, Call.Details details) {
        CharSequence charSequence;
        String str;
        Uri uri;
        Uri uri2;
        nid nid = this.f35687a;
        nib nib = nid.f35689b;
        if (nib != null) {
            nkw nkw = ((nks) nib).f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                CarCall a = ((nks) nib).f35917a.f35927f.mo21022a(nid);
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
                for (nkv nkv : ((nks) nib).f35917a.f35924c.values()) {
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
    }

    public final void onParentChanged(Call call, Call call2) {
        nid nid = this.f35687a;
        nib nib = nid.f35689b;
        if (nib != null) {
            nid a = nid.m26370a(call2);
            nkw nkw = ((nks) nib).f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                CarCall a2 = ((nks) nib).f35917a.f35927f.mo21022a(nid);
                CarCall a3 = ((nks) nib).f35917a.f35927f.mo21022a(a);
                a2.f29284b = a3;
                for (nkv nkv : ((nks) nib).f35917a.f35924c.values()) {
                    try {
                        int i = a2.f29283a;
                        nkv.f35921b.mo21475a(a2, a3);
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

    public final void onPostDialWait(Call call, String str) {
        nid nid = this.f35687a;
        nib nib = nid.f35689b;
        if (nib != null) {
            nkw nkw = ((nks) nib).f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                CarCall a = ((nks) nib).f35917a.f35927f.mo21022a(nid);
                a.f29286d = str;
                for (nkv nkv : ((nks) nib).f35917a.f35924c.values()) {
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
    }

    public final void onStateChanged(Call call, int i) {
        nid nid = this.f35687a;
        nib nib = nid.f35689b;
        if (nib != null) {
            nkw nkw = ((nks) nib).f35917a;
            bnsn bnsn = nkw.f35922a;
            synchronized (nkw.f35923b) {
                CarCall a = ((nks) nib).f35917a.f35927f.mo21022a(nid);
                a.f29287e = i;
                int i2 = a.f29283a;
                for (nkv nkv : ((nks) nib).f35917a.f35924c.values()) {
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
    }
}
