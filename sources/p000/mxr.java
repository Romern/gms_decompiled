package p000;

import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxr */
final /* synthetic */ class mxr implements Runnable {

    /* renamed from: a */
    private final PhotosBackupPreference f34902a;

    /* renamed from: b */
    private final String f34903b;

    public mxr(PhotosBackupPreference photosBackupPreference, String str) {
        this.f34902a = photosBackupPreference;
        this.f34903b = str;
    }

    public final void run() {
        String str;
        PhotosBackupPreference photosBackupPreference = this.f34902a;
        String str2 = this.f34903b;
        boolean a = photosBackupPreference.f29186b.mo20295a(str2);
        lvn lvn = PhotosBackupPreference.f29184a;
        if (!a) {
            str = "Could not change";
        } else {
            str = "Changed";
        }
        lvn.mo25412b(str.concat(" the photos backup account"), new Object[0]);
        if (a) {
            photosBackupPreference.f29187c.post(new mxs(photosBackupPreference, str2));
        }
    }
}
