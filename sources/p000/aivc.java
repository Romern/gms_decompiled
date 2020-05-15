package p000;

import android.net.wifi.aware.SubscribeConfig;
import android.net.wifi.aware.SubscribeDiscoverySession;
import android.net.wifi.aware.WifiAwareSession;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aivc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aivc extends airo {

    /* renamed from: a */
    public final String f69842a;

    /* renamed from: b */
    public final aitq f69843b;

    /* renamed from: c */
    public SubscribeDiscoverySession f69844c;

    /* renamed from: d */
    public final aiui f69845d;

    /* renamed from: e */
    private final aiuw f69846e;

    /* renamed from: f */
    private final aivn f69847f;

    public aivc(aiuw aiuw, String str, aivn aivn, aitq aitq, aiui aiui) {
        super(52);
        this.f69846e = aiuw;
        this.f69842a = str;
        this.f69847f = aivn;
        this.f69843b = aitq;
        this.f69845d = aiui;
    }

    /* renamed from: b */
    public final int mo37568b() {
        WifiAwareSession a = this.f69846e.mo38073a();
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aivc", "b", 1349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to start WiFi Aware subscribing because a WiFi Aware session could not be acquired.");
            return 4;
        }
        SubscribeConfig build = new SubscribeConfig.Builder().setServiceName(aivd.m57990f(this.f69842a)).setMatchFilter(Arrays.asList(null, null)).setSubscribeType(0).setTerminateNotificationEnabled(true).build();
        bqgy c = bqgy.m112818c();
        try {
            a.subscribe(build, new aivb(this, this.f69847f, this.f69842a, c), null);
        } catch (IllegalArgumentException e) {
            c.mo69136a((Throwable) e);
        }
        try {
            SubscribeDiscoverySession subscribeDiscoverySession = (SubscribeDiscoverySession) c.get(cfnv.m140765aa(), TimeUnit.SECONDS);
            this.f69844c = subscribeDiscoverySession;
            this.f69843b.mo38019a(this.f69842a, subscribeDiscoverySession);
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aivc", "b", 1422, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Successfully started WiFi Aware subscription for serviceId %s.", this.f69842a);
            return 2;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68432a("aivc", "b", 1427, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Interrupted while waiting to start subscribing.");
            return 4;
        } catch (ExecutionException e3) {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68437a(e3);
            bnsl4.mo68432a("aivc", "b", 1429, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Failed to start WiFi Aware subscribing for serviceId %s.", this.f69842a);
            return 4;
        } catch (TimeoutException e4) {
            bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
            bnsl5.mo68437a(e4);
            bnsl5.mo68432a("aivc", "b", 1432, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68423a("Failed to subscribe to %s over WiFi Aware in %d seconds.", this.f69842a, cfnv.m140765aa());
            return 4;
        }
    }

    /* renamed from: c */
    public final void mo37901c(int i) {
        this.f69843b.mo38015a(this.f69844c);
        if (i == 2) {
            this.f69843b.mo38023b(this.f69842a);
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aivc", "c", 1450, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Stopped subscribing for WiFi Aware advertisements.");
    }
}
