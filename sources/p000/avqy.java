package p000;

import com.google.android.gms.update.phone.SystemUpdateChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: avqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avqy implements aubq {

    /* renamed from: a */
    private final WeakReference f93808a;

    public avqy(SystemUpdateChimeraActivity systemUpdateChimeraActivity) {
        this.f93808a = new WeakReference(systemUpdateChimeraActivity);
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = (SystemUpdateChimeraActivity) this.f93808a.get();
        if (systemUpdateChimeraActivity != null) {
            systemUpdateChimeraActivity.runOnUiThread(new avqx(aucb, systemUpdateChimeraActivity));
        }
    }
}
