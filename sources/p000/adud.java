package p000;

import com.google.android.chimera.config.ModuleManager;

/* renamed from: adud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adud extends ModuleManager.FeatureRequestProgressListener {

    /* renamed from: a */
    final /* synthetic */ adug f62743a;

    public adud(adug adug) {
        this.f62743a = adug;
    }

    public final void onRequestComplete() {
        this.f62743a.mo33828a(adue.ERROR_KM_UNAVAILABLE_AFTER_DOWNLOAD);
    }
}
