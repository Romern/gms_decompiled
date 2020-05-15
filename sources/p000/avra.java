package p000;

import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.phone.SystemUpdateChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: avra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avra implements aubw {

    /* renamed from: a */
    private final WeakReference f93811a;

    public avra(SystemUpdateChimeraActivity systemUpdateChimeraActivity) {
        this.f93811a = new WeakReference(systemUpdateChimeraActivity);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) obj;
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = (SystemUpdateChimeraActivity) this.f93811a.get();
        if (systemUpdateChimeraActivity != null) {
            systemUpdateChimeraActivity.runOnUiThread(new avqz(systemUpdateChimeraActivity, systemUpdateStatus));
        }
    }
}
