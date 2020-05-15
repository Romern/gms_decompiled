package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;

/* renamed from: wfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wfw extends dcj implements wfy {
    public wfw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.facs.cache.internal.IFacsInternalSyncCallbacks");
    }

    /* renamed from: a */
    public final void mo29075a(Status status, SyncActivityControlsSettingsInternalResult syncActivityControlsSettingsInternalResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, syncActivityControlsSettingsInternalResult);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo29074a(Status status, UpdateActivityControlsSettingsInternalResult updateActivityControlsSettingsInternalResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, updateActivityControlsSettingsInternalResult);
        mo8530c(2, bj);
    }
}
