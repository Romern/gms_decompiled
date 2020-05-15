package p000;

import android.app.PendingIntent;
import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mxw implements mvt {

    /* renamed from: a */
    final /* synthetic */ PhotosBackupPreference f34912a;

    public mxw(PhotosBackupPreference photosBackupPreference) {
        this.f34912a = photosBackupPreference;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        return (PendingIntent) this.f34912a.f29186b.mo20294a(mxe.f34883a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        PendingIntent pendingIntent = (PendingIntent) obj;
        if (pendingIntent != null) {
            PhotosBackupPreference photosBackupPreference = this.f34912a;
            photosBackupPreference.f1600p = new mxp(photosBackupPreference, pendingIntent);
            this.f34912a.mo1981a(true);
        }
    }
}
