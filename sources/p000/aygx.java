package p000;

import android.util.Log;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: aygx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aygx extends ModuleManager.FeatureRequestProgressListener {
    public final void onRequestComplete() {
        if (Log.isLoggable("Wear_Controller", 3)) {
            Log.d("Wear_Controller", "feature request is complete");
        }
    }
}
