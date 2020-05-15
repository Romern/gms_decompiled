package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* renamed from: ba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0042ba extends C1531z {

    /* renamed from: a */
    final /* synthetic */ C0043bb f2751a;

    public C0042ba(C0043bb bbVar) {
        this.f2751a = bbVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
    }

    public final void onActivityPaused(Activity activity) {
        C0043bb bbVar = this.f2751a;
        int i = bbVar.f2822b - 1;
        bbVar.f2822b = i;
        if (i == 0) {
            bbVar.f2825e.postDelayed(bbVar.f2827g, 700);
        }
    }

    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new C0040az(this));
    }

    public final void onActivityStopped(Activity activity) {
        C0043bb bbVar = this.f2751a;
        bbVar.f2821a--;
        bbVar.mo2973a();
    }
}
