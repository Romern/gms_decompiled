package p000;

import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxn */
final /* synthetic */ class mxn implements Runnable {

    /* renamed from: a */
    private final PhotosBackupPreference f34895a;

    /* renamed from: b */
    private final String f34896b;

    public mxn(PhotosBackupPreference photosBackupPreference, String str) {
        this.f34895a = photosBackupPreference;
        this.f34896b = str;
    }

    public final void run() {
        this.f34895a.mo17273a(this.f34896b);
    }
}
