package p000;

import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxm */
public final /* synthetic */ class mxm implements Runnable {

    /* renamed from: a */
    private final PhotosBackupPreference f34893a;

    /* renamed from: b */
    private final String f34894b;

    public mxm(PhotosBackupPreference photosBackupPreference, String str) {
        this.f34893a = photosBackupPreference;
        this.f34894b = str;
    }

    public final void run() {
        this.f34893a.mo17273a(this.f34894b);
    }
}
