package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: aiwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiwz implements ComponentCallbacks2 {

    /* renamed from: a */
    final /* synthetic */ aixb f69967a;

    public aiwz(aixb aixb) {
        this.f69967a = aixb;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        this.f69967a.f69971d.mo72987c(new aiwy(this, "onTrimMemory", i));
    }
}
