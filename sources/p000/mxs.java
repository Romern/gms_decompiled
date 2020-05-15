package p000;

import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxs */
final /* synthetic */ class mxs implements Runnable {

    /* renamed from: a */
    private final PhotosBackupPreference f34904a;

    /* renamed from: b */
    private final String f34905b;

    public mxs(PhotosBackupPreference photosBackupPreference, String str) {
        this.f34904a = photosBackupPreference;
        this.f34905b = str;
    }

    public final void run() {
        PhotosBackupPreference photosBackupPreference = this.f34904a;
        photosBackupPreference.f29190f = this.f34905b;
        photosBackupPreference.mo17275w();
    }
}
