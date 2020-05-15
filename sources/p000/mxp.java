package p000;

import android.app.PendingIntent;
import androidx.preference.Preference;
import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxp */
final /* synthetic */ class mxp implements aoa {

    /* renamed from: a */
    private final PhotosBackupPreference f34899a;

    /* renamed from: b */
    private final PendingIntent f34900b;

    public mxp(PhotosBackupPreference photosBackupPreference, PendingIntent pendingIntent) {
        this.f34899a = photosBackupPreference;
        this.f34900b = pendingIntent;
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        this.f34899a.mo17272a(this.f34900b);
        return true;
    }
}
