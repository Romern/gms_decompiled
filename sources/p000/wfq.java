package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

/* renamed from: wfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wfq extends dcj implements wfs {
    public wfq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
    }

    /* renamed from: a */
    public final void mo29071a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo29067a(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, forceSettingsCacheRefreshResult);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo29069a(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getActivityControlsSettingsResult);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo29070a(Status status, ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, readDeviceLevelSettingsResult);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo29068a(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, updateActivityControlsSettingsResult);
        mo8530c(2, bj);
    }
}
