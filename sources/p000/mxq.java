package p000;

import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxq */
public final /* synthetic */ class mxq implements Runnable {

    /* renamed from: a */
    private final PhotosBackupPreference f34901a;

    public mxq(PhotosBackupPreference photosBackupPreference) {
        this.f34901a = photosBackupPreference;
    }

    public final void run() {
        PhotosBackupPreference photosBackupPreference = this.f34901a;
        photosBackupPreference.f29186b.mo20294a(new mxi(photosBackupPreference.f29194j));
    }
}
