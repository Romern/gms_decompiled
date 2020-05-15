package p000;

import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: ahus */
final /* synthetic */ class ahus implements Runnable {

    /* renamed from: a */
    private final ahuu f68114a;

    /* renamed from: b */
    private final ModuleManager.FeatureRequestProgressListener f68115b;

    public ahus(ahuu ahuu, ModuleManager.FeatureRequestProgressListener featureRequestProgressListener) {
        this.f68114a = ahuu;
        this.f68115b = featureRequestProgressListener;
    }

    public final void run() {
        ahuu ahuu = this.f68114a;
        ModuleManager.FeatureRequestProgressListener featureRequestProgressListener = this.f68115b;
        if (SystemClock.elapsedRealtime() - ahuu.f68117b < cfog.m141297y()) {
            srn srn = ahsd.f67925a;
            cfog.m141297y();
            return;
        }
        ahuu.f68117b = SystemClock.elapsedRealtime();
        if (ahuu.mo37180b()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("loadFastPairModule: FastPair module is downloaded.");
            return;
        }
        ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
        featureRequest.setUrgent(featureRequestProgressListener);
        featureRequest.requestFeatureAtLatestVersion("fast_pair");
        if (ModuleManager.get(ahuu.f68116a).requestFeatures(featureRequest)) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("loadFastPairModule: feature request succeeded.");
            ahuu.m56679a(ahuu.f68116a, bvin.FAST_PAIR_OPTIONAL_MODULE_REQUEST_SUCCEEDED);
            return;
        }
        ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("loadFastPairModule: feature request failed.");
        ahuu.m56679a(ahuu.f68116a, bvin.FAST_PAIR_OPTIONAL_MODULE_REQUEST_FAILED);
    }
}
