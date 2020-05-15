package p000;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiov implements NsdManager.RegistrationListener {

    /* renamed from: a */
    public final NsdServiceInfo f69377a;

    /* renamed from: b */
    public final ahgq f69378b;

    /* renamed from: c */
    private final bqgy f69379c = bqgy.m112818c();

    /* renamed from: d */
    private final bqgy f69380d = bqgy.m112818c();

    public aiov(ahgq ahgq, NsdServiceInfo nsdServiceInfo) {
        this.f69377a = nsdServiceInfo;
        this.f69378b = ahgq;
    }

    /* renamed from: c */
    private final void m57581c() {
        try {
            this.f69380d.get(cfnv.f184625a.mo6606a().mo81804bJ(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiov", "c", 860, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Interrupted while stopping MDNS advertising");
        } catch (ExecutionException e2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("aiov", "c", 862, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to stop MDNS advertising");
        } catch (TimeoutException e3) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("aiov", "c", 864, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Timed out waiting for MDNS advertising to stop");
        }
    }

    /* renamed from: a */
    public final boolean mo37762a() {
        try {
            this.f69379c.get(cfnv.f184625a.mo6606a().mo81803bI(), TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiov", "a", 838, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Interrupted while starting MDNS advertising");
            return false;
        } catch (ExecutionException e2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("aiov", "a", 840, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to start MDNS advertising");
            return false;
        } catch (TimeoutException e3) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("aiov", "a", 842, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Timed out waiting for MDNS advertising to start");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37763b() {
        NsdManager nsdManager = this.f69378b.f67180a;
        if (nsdManager != null) {
            try {
                nsdManager.unregisterService(this);
                m57581c();
            } catch (IllegalArgumentException e) {
            }
        } else {
            throw new RuntimeException("NsdManagerCompat.unregisterService can only be called on P+.");
        }
    }

    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        bqgy bqgy = this.f69379c;
        String valueOf = String.valueOf(ailc.m57409a(i));
        bqgy.mo69136a((Throwable) new Exception(valueOf.length() == 0 ? new String("Failed to register service: ") : "Failed to register service: ".concat(valueOf)));
    }

    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        if (!this.f69377a.getServiceName().equals(nsdServiceInfo.getServiceName())) {
            this.f69379c.mo69136a((Throwable) new Exception("Failed to register service because another device is already using that service name."));
        } else {
            this.f69379c.mo69138b((Object) null);
        }
    }

    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        this.f69380d.mo69138b((Object) null);
    }

    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        bqgy bqgy = this.f69380d;
        String valueOf = String.valueOf(ailc.m57409a(i));
        bqgy.mo69136a((Throwable) new Exception(valueOf.length() == 0 ? new String("Failed to unregister service: ") : "Failed to unregister service: ".concat(valueOf)));
    }
}
