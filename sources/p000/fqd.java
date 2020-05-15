package p000;

import android.text.format.Formatter;
import com.google.android.gms.app.settings.ManageSpaceChimeraActivity;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

/* renamed from: fqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fqd implements aubw {

    /* renamed from: a */
    final /* synthetic */ ManageSpaceChimeraActivity f17124a;

    public fqd(ManageSpaceChimeraActivity manageSpaceChimeraActivity) {
        this.f17124a = manageSpaceChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        long j;
        StorageInfoResponse storageInfoResponse = (StorageInfoResponse) obj;
        if (storageInfoResponse != null) {
            j = storageInfoResponse.f110967b;
        } else {
            j = 0;
        }
        ManageSpaceChimeraActivity manageSpaceChimeraActivity = this.f17124a;
        manageSpaceChimeraActivity.f9504c.setText(Formatter.formatFileSize(manageSpaceChimeraActivity, j));
    }
}
