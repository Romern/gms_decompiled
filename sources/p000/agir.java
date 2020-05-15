package p000;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: agir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agir implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ServiceConnection f65641a;

    /* renamed from: b */
    final /* synthetic */ agis f65642b;

    /* renamed from: c */
    final /* synthetic */ emk f65643c;

    public agir(agis agis, emk emk, ServiceConnection serviceConnection) {
        this.f65642b = agis;
        this.f65643c = emk;
        this.f65641a = serviceConnection;
    }

    public final void run() {
        agis agis = this.f65642b;
        agit agit = agis.f65645b;
        String str = agis.f65644a;
        emk emk = this.f65643c;
        ServiceConnection serviceConnection = this.f65641a;
        agit.f65646a.mo35512p();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Parcel bj = emk.mo8529bj();
            dcl.m8165a(bj, bundle);
            Parcel a = emk.mo8526a(1, bj);
            Bundle bundle3 = (Bundle) dcl.m8163a(a, Bundle.CREATOR);
            a.recycle();
            if (bundle3 == null) {
                agit.f65646a.mo35497E().f65564c.mo35435a("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundle3;
            }
        } catch (Exception e) {
            agit.f65646a.mo35497E().f65564c.mo35436a("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        agit.f65646a.mo35512p();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                agit.f65646a.mo35497E().f65564c.mo35435a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    agit.f65646a.mo35497E().f65572k.mo35436a("InstallReferrer API result", string);
                    Bundle a2 = agit.f65646a.mo35502f().mo35722a(Uri.parse(string.length() == 0 ? new String("?") : "?".concat(string)));
                    if (a2 == null) {
                        agit.f65646a.mo35497E().f65564c.mo35435a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = a2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                agit.f65646a.mo35497E().f65564c.mo35435a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == agit.f65646a.mo35499a().f65625j.mo35458a()) {
                            agje agje = agit.f65646a;
                            if (!agje.f65690f.f65291a) {
                                agje.mo35497E().f65572k.mo35435a("Install Referrer campaign has already been logged");
                            } else {
                                agje.mo35497E().f65572k.mo35435a("Logging Install Referrer campaign from module while it may have already been logged.");
                            }
                        }
                        if (!cfja.f184196a.mo6606a().mo81332a() || !agit.f65646a.f65691g.mo35314a(aghn.f65491aq) || agit.f65646a.mo35513q()) {
                            agit.f65646a.mo35499a().f65625j.mo35459a(j);
                            agje agje2 = agit.f65646a;
                            if (agje2.f65690f.f65291a) {
                                agje2.mo35497E().f65572k.mo35436a("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                a2.putString("_cis", "referrer API v2");
                                agit.f65646a.mo35501e().mo35571a("auto", "_cmp", a2, str);
                            } else {
                                agje2.mo35497E().f65572k.mo35436a("Logging Install Referrer campaign from sdk with ", "referrer API");
                                a2.putString("_cis", "referrer API");
                                agit.f65646a.mo35501e().mo35570a("auto", "_cmp", a2);
                            }
                        }
                    }
                } else {
                    agit.f65646a.mo35497E().f65564c.mo35435a("No referrer defined in Install Referrer response");
                }
            }
        }
        skh.m35531a().mo25689a(agit.f65646a.f65685a, serviceConnection);
    }
}
