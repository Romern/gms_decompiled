package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;
import com.google.android.libraries.photos.backup.api.StatusResult;
import java.util.Date;

/* renamed from: mxt */
public final /* synthetic */ class mxt implements Runnable {

    /* renamed from: a */
    private final StatusResult f34906a;

    /* renamed from: b */
    private final beba f34907b;

    public mxt(beba beba, StatusResult statusResult) {
        this.f34907b = beba;
        this.f34906a = statusResult;
    }

    public final void run() {
        mvp mvp;
        beba beba = this.f34907b;
        StatusResult statusResult = this.f34906a;
        PhotosBackupPreference photosBackupPreference = beba.f106857a;
        lvn lvn = PhotosBackupPreference.f29184a;
        int i = statusResult.f111404a;
        if (i > 0) {
            photosBackupPreference.f29192h = photosBackupPreference.f1595k.getResources().getQuantityString(C0126R.plurals.drive_backup_content_photos_items_left, i, Integer.valueOf(i));
        } else {
            long j = statusResult.f111405b;
            if (j != -1) {
                mvp = mvp.m25669b(new Date(j));
            } else {
                mvp = mvp.f34814a;
            }
            photosBackupPreference.f29192h = mvp.mo20275a(photosBackupPreference.f1595k);
        }
        photosBackupPreference.mo17275w();
    }
}
