package p000;

import com.google.android.chimera.config.ModuleManager;
import java.lang.ref.WeakReference;

/* renamed from: dew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dew extends djj {

    /* renamed from: a */
    private final WeakReference f12987a;

    public dew(ModuleManager.FeatureRequestProgressListener featureRequestProgressListener) {
        this.f12987a = new WeakReference(featureRequestProgressListener);
    }

    /* renamed from: a */
    public final void mo8635a(int i) {
        ModuleManager.FeatureRequestProgressListener featureRequestProgressListener;
        synchronized (this) {
            featureRequestProgressListener = (ModuleManager.FeatureRequestProgressListener) this.f12987a.get();
        }
        if (featureRequestProgressListener != null) {
            featureRequestProgressListener.onRequestComplete(i);
        }
    }
}
