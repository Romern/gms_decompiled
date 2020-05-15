package com.google.android.gms.backup.p032g1.restore.photos;

import android.content.Intent;
import android.os.Looper;
import com.google.android.chimera.IntentOperation;
import com.google.android.libraries.photos.restore.api.StatusResult;

/* renamed from: com.google.android.gms.backup.g1.restore.photos.PhotosRestoreResultIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PhotosRestoreResultIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final bngx f29054a = bngx.m109360a(bebf.RESTORE_COMPLETE_FAILED, bebf.RESTORE_COMPLETE_CANCELLED, bebf.RESTORE_ERROR_DENIED_PERMISSION, bebf.RESTORE_ERROR_RETRY, bebf.RESTORE_ERROR_UNKNOWN);

    /* renamed from: b */
    private static final bngx f29055b = bngx.m109356a(bebf.RESTORE_COMPLETE_SUCCESS);

    public final void onHandleIntent(Intent intent) {
        StatusResult statusResult;
        bebf bebf = null;
        if (!(intent == null || (statusResult = (StatusResult) intent.getParcelableExtra("com.google.android.libraries.photos.restore.EXTRA_STATUS_RESULT")) == null)) {
            bebf = statusResult.f111412a;
        }
        if (f29054a.contains(bebf)) {
            new adzt(Looper.getMainLooper()).post(new mnz(this));
        } else if (f29055b.contains(bebf)) {
            lvt.f33072a.mo19680f(this, true);
        }
    }
}
