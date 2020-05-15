package p000;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: ajfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfg extends buqn {

    /* renamed from: a */
    final /* synthetic */ NearbyMessagesChimeraService f70518a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfg(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str) {
        super(str);
        this.f70518a = nearbyMessagesChimeraService;
    }

    public final void run() {
        this.f70518a.mo44373b();
        NearbyMessagesChimeraService nearbyMessagesChimeraService = this.f70518a;
        srn srn = ahfq.f67120a;
        int i = 0;
        if (cfoj.m141574x()) {
            aeat a = aeat.m51532a(nearbyMessagesChimeraService);
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.nearby.messages.offline.OfflineCachingService";
            aebl.mo34024a(cfop.m141877g() ? 1 : 0, (cdny.m134339d() || cfop.m141877g()) ? 1 : 0);
            aebl.f63099k = "OfflineCachingTask";
            aebl.f63070a = cfop.f185115a.mo6606a().mo82205I();
            aebm a2 = aebl.mo33974b();
            try {
                a.mo33986a("OfflineCachingTask", "com.google.android.gms.nearby.messages.offline.OfflineCachingService");
                a.mo33984a(a2);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("OfflineCache: Failed to schedule task");
            }
        } else {
            ((bnsl) ahfq.f67120a.mo68390d()).mo68405a("OfflineCache: old scanner cache is not enabled");
        }
        if (cfoj.m141521B()) {
            aeat a3 = aeat.m51532a(nearbyMessagesChimeraService);
            aebl aebl2 = new aebl();
            aebl2.f63097i = "com.google.android.gms.nearby.messages.offline.OfflineCachingService";
            boolean D = cfoj.m141523D();
            if (cdny.m134339d() || cfoj.m141523D()) {
                i = 1;
            }
            aebl2.mo34024a(D ? 1 : 0, i);
            aebl2.f63099k = "OfflineCachingTask";
            aebl2.f63070a = cfog.f184854a.mo6606a().mo81958T();
            aebm a4 = aebl2.mo33974b();
            try {
                a3.mo33986a("OfflineCachingTask", "com.google.android.gms.nearby.messages.offline.OfflineCachingService");
                a3.mo33984a(a4);
            } catch (IllegalArgumentException e2) {
                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("NewOfflineCache: Failed to schedule task");
            }
        } else {
            ((bnsl) ahfq.f67120a.mo68390d()).mo68405a("NewOfflineCache: new scanner cache is not enabled");
        }
    }
}
