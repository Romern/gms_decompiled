package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.p032g1.restore.photos.PhotosRestoreResultIntentOperation;

/* renamed from: mnz */
public final /* synthetic */ class mnz implements Runnable {

    /* renamed from: a */
    private final PhotosRestoreResultIntentOperation f34072a;

    public mnz(PhotosRestoreResultIntentOperation photosRestoreResultIntentOperation) {
        this.f34072a = photosRestoreResultIntentOperation;
    }

    public final void run() {
        PhotosRestoreResultIntentOperation photosRestoreResultIntentOperation = this.f34072a;
        Toast.makeText(photosRestoreResultIntentOperation, photosRestoreResultIntentOperation.getString(C0126R.string.g1_restore_failed), 1).show();
    }
}
