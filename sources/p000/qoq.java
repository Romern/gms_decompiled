package p000;

import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.debug.ChimeraDebugChimeraActivity;

/* renamed from: qoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qoq extends ModuleManager.FeatureRequestProgressListener {

    /* renamed from: a */
    final /* synthetic */ ChimeraDebugChimeraActivity f41888a;

    public qoq(ChimeraDebugChimeraActivity chimeraDebugChimeraActivity) {
        this.f41888a = chimeraDebugChimeraActivity;
    }

    public final void onRequestComplete(int i) {
        this.f41888a.runOnUiThread(new qop(this, i));
    }
}
