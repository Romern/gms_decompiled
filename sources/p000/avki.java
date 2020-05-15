package p000;

import android.os.Parcel;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.phone.SystemUpdateChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: avki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avki extends dck implements avkj {

    /* renamed from: a */
    private final WeakReference f93291a;

    public avki() {
        super("com.google.android.gms.update.ISystemUpdateStatusCallback");
    }

    /* renamed from: a */
    public final void mo51332a(SystemUpdateStatus systemUpdateStatus) {
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = (SystemUpdateChimeraActivity) this.f93291a.get();
        if (systemUpdateChimeraActivity != null) {
            systemUpdateChimeraActivity.runOnUiThread(new avrj(systemUpdateStatus, systemUpdateChimeraActivity));
        }
    }

    public avki(SystemUpdateChimeraActivity systemUpdateChimeraActivity) {
        super("com.google.android.gms.update.ISystemUpdateStatusCallback");
        this.f93291a = new WeakReference(systemUpdateChimeraActivity);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo51332a((SystemUpdateStatus) dcl.m8163a(parcel, SystemUpdateStatus.CREATOR));
        return true;
    }
}
