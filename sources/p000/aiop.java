package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;

/* renamed from: aiop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiop extends airo {

    /* renamed from: a */
    public final NsdServiceInfo f69361a;

    /* renamed from: b */
    private final Context f69362b;

    /* renamed from: c */
    private final ConnectivityManager f69363c;

    /* renamed from: d */
    private final ahgq f69364d;

    /* renamed from: e */
    private aiov f69365e;

    public aiop(Context context, ConnectivityManager connectivityManager, ahgq ahgq, NsdServiceInfo nsdServiceInfo) {
        super(41);
        this.f69362b = context;
        this.f69363c = connectivityManager;
        this.f69364d = ahgq;
        this.f69361a = nsdServiceInfo;
    }

    /* renamed from: a */
    public final void mo37566a() {
        aiov aiov = this.f69365e;
        if (aiov != null) {
            aiov.mo37763b();
            this.f69365e = null;
            return;
        }
        srn srn = ailf.f69111a;
    }

    /* renamed from: b */
    public final int mo37568b() {
        if (aiox.m57587a(this.f69363c)) {
            int i = Build.VERSION.SDK_INT;
            if (aiox.m57588c() && this.f69364d != null) {
                Intent registerReceiver = this.f69362b.registerReceiver(null, new IntentFilter("android.net.nsd.STATE_CHANGED"));
                if (registerReceiver == null || !"android.net.nsd.STATE_CHANGED".equals(registerReceiver.getAction()) || registerReceiver.getIntExtra("nsd_state", -1) != 2) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                    bnsl.mo68432a("aiop", "b", 945, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Can't advertise over the local area network because NSD isn't enabled.");
                    return 4;
                }
                aiov aiov = new aiov(this.f69364d, this.f69361a);
                ahgq ahgq = aiov.f69378b;
                NsdServiceInfo nsdServiceInfo = aiov.f69377a;
                NsdManager nsdManager = ahgq.f67180a;
                if (nsdManager != null) {
                    try {
                        nsdManager.registerService(nsdServiceInfo, 1, aiov);
                        if (!aiov.mo37762a()) {
                            aiov.mo37763b();
                            return 4;
                        }
                        this.f69365e = aiov;
                        return 2;
                    } catch (IllegalArgumentException e) {
                    }
                } else {
                    throw new RuntimeException("NsdManagerCompat.registerService can only be called on P+.");
                }
            } else {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aiop", "b", 939, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Can't advertise over the local area network because mDNS isn't available.");
                return 4;
            }
        } else {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aiop", "b", 932, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Can't advertise over the local area network because we're not connected over Wifi.");
            return 4;
        }
    }
}
