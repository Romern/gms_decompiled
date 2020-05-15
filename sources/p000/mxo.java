package p000;

import android.content.DialogInterface;
import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxo */
public final /* synthetic */ class mxo implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final PhotosBackupPreference f34897a;

    /* renamed from: b */
    private final String f34898b;

    public mxo(PhotosBackupPreference photosBackupPreference, String str) {
        this.f34897a = photosBackupPreference;
        this.f34898b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new soa(9, new mxr(this.f34897a, this.f34898b)).start();
    }
}
