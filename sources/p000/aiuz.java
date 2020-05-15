package p000;

import android.net.wifi.aware.PublishConfig;
import android.net.wifi.aware.PublishDiscoverySession;
import android.net.wifi.aware.WifiAwareSession;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiuz extends airo {

    /* renamed from: a */
    public final String f69830a;

    /* renamed from: b */
    public final aitq f69831b;

    /* renamed from: c */
    private final aiuw f69832c;

    /* renamed from: d */
    private final byte[] f69833d;

    /* renamed from: e */
    private final aivn f69834e;

    /* renamed from: f */
    private PublishDiscoverySession f69835f;

    public aiuz(aiuw aiuw, String str, byte[] bArr, aivn aivn, aitq aitq) {
        super(51);
        this.f69832c = aiuw;
        this.f69830a = str;
        this.f69833d = bArr;
        this.f69834e = aivn;
        this.f69831b = aitq;
    }

    /* renamed from: a */
    private static PublishConfig m57978a(String str, byte[] bArr, byte[] bArr2) {
        return new PublishConfig.Builder().setServiceName(aivd.m57990f(str)).setServiceSpecificInfo(bArr).setMatchFilter(Arrays.asList(bqcn.m112583a(1), bArr2)).setPublishType(0).setTerminateNotificationEnabled(true).build();
    }

    /* renamed from: c */
    private final boolean m57979c() {
        try {
            this.f69835f.updatePublish(m57978a(this.f69830a, new byte[0], this.f69832c.f69823c));
            return true;
        } catch (SecurityException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiuz", "c", 1293, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to invalidate the WiFi Aware publish.");
            return false;
        }
    }

    /* renamed from: b */
    public final int mo37568b() {
        WifiAwareSession a = this.f69832c.mo38073a();
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiuz", "b", 1187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to start WiFi Aware publishing because a WiFi Aware session could not be acquired.");
            return 4;
        }
        String a2 = ails.m57438a(this.f69833d);
        bqgy c = bqgy.m112818c();
        byte[] bArr = this.f69832c.f69823c;
        try {
            a.publish(m57978a(this.f69830a, this.f69833d, bArr), new aiuy(this, this.f69834e, this.f69830a, c, a2), null);
        } catch (IllegalArgumentException e) {
            c.mo69136a((Throwable) e);
        }
        try {
            PublishDiscoverySession publishDiscoverySession = (PublishDiscoverySession) c.get(cfnv.m140764Z(), TimeUnit.SECONDS);
            this.f69835f = publishDiscoverySession;
            this.f69831b.mo38018a(this.f69830a, publishDiscoverySession);
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aiuz", "b", 1240, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68425a("Successfully published WiFi Aware advertisement %s with service id %s and session id %s.", a2, this.f69830a, ails.m57438a(bArr));
            return 2;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68432a("aiuz", "b", 1247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Interrupted while waiting to start publishing.");
            return 4;
        } catch (ExecutionException e3) {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68437a(e3);
            bnsl4.mo68432a("aiuz", "b", 1249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68425a("Failed to start WiFi Aware publishing advertisement %s with service id %s with session id %s.", a2, this.f69830a, ails.m57438a(bArr));
            return 4;
        } catch (TimeoutException e4) {
            bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
            bnsl5.mo68437a(e4);
            bnsl5.mo68432a("aiuz", "b", 1254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68425a("Failed to publish %s over WiFi Aware in %d seconds with session id %s.", a2, Long.valueOf(cfnv.m140764Z()), ails.m57438a(bArr));
            return 4;
        }
    }

    /* renamed from: c */
    public final void mo37901c(int i) {
        boolean z = false;
        try {
            this.f69835f.updatePublish(m57978a(this.f69830a, new byte[0], this.f69832c.f69823c));
            z = true;
        } catch (SecurityException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiuz", "c", 1293, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to invalidate the WiFi Aware publish.");
        }
        this.f69831b.mo38014a(this.f69835f);
        if (!z || i == 2) {
            this.f69831b.mo38017a(this.f69830a);
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aiuz", "c", 1280, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Stopped publishing WiFi Aware advertisement.");
    }
}
