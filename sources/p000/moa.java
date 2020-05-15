package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.p032g1.restore.photos.StartPhotosRestoreIntentOperation;

/* renamed from: moa */
public final /* synthetic */ class moa implements Runnable {

    /* renamed from: a */
    private final StartPhotosRestoreIntentOperation f34073a;

    public moa(StartPhotosRestoreIntentOperation startPhotosRestoreIntentOperation) {
        this.f34073a = startPhotosRestoreIntentOperation;
    }

    public final void run() {
        StartPhotosRestoreIntentOperation startPhotosRestoreIntentOperation = this.f34073a;
        Toast.makeText(startPhotosRestoreIntentOperation, startPhotosRestoreIntentOperation.getString(C0126R.string.g1_restore_failed), 1).show();
    }
}
