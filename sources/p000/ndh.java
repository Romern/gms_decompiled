package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService;

/* renamed from: ndh */
public final /* synthetic */ class ndh implements Runnable {

    /* renamed from: a */
    private final MmsRestoreChimeraService f35335a;

    public ndh(MmsRestoreChimeraService mmsRestoreChimeraService) {
        this.f35335a = mmsRestoreChimeraService;
    }

    public final void run() {
        MmsRestoreChimeraService mmsRestoreChimeraService = this.f35335a;
        Toast.makeText(mmsRestoreChimeraService, mmsRestoreChimeraService.getString(C0126R.string.g1_restore_failed), 1).show();
    }
}
