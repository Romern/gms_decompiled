package p000;

import android.os.Handler;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: qod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qod extends ModuleManager.FeatureRequestProgressListener {

    /* renamed from: a */
    private Handler f41828a;

    /* renamed from: b */
    private ModuleManager f41829b;

    /* renamed from: c */
    private final ModuleManager.FeatureList f41830c;

    public qod(Handler handler, ModuleManager.FeatureList featureList, ModuleManager moduleManager) {
        this.f41828a = handler;
        this.f41830c = featureList;
        this.f41829b = moduleManager;
    }

    /* renamed from: b */
    public final synchronized void mo24150b() {
        this.f41828a = null;
        this.f41829b = null;
    }

    public final synchronized void onRequestComplete() {
        int i;
        ModuleManager moduleManager = this.f41829b;
        Handler handler = this.f41828a;
        if (!(handler == null || moduleManager == null)) {
            if (moduleManager.checkFeaturesAreAvailable(this.f41830c) != 0) {
                i = 3;
            } else {
                i = 1;
            }
            handler.obtainMessage(0, i, 0).sendToTarget();
        }
    }
}
