package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

/* renamed from: wfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class wfr extends dck implements wfs {
    public wfr() {
        super("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
    }

    /* renamed from: a */
    public void mo29071a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo29067a(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo29069a(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo29070a(Status status, ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo29068a(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo29067a((Status) dcl.m8163a(parcel, Status.CREATOR), (ForceSettingsCacheRefreshResult) dcl.m8163a(parcel, ForceSettingsCacheRefreshResult.CREATOR));
        } else if (i == 2) {
            mo29068a((Status) dcl.m8163a(parcel, Status.CREATOR), (UpdateActivityControlsSettingsResult) dcl.m8163a(parcel, UpdateActivityControlsSettingsResult.CREATOR));
        } else if (i == 3) {
            mo29069a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetActivityControlsSettingsResult) dcl.m8163a(parcel, GetActivityControlsSettingsResult.CREATOR));
        } else if (i == 4) {
            mo29071a((Status) dcl.m8163a(parcel, Status.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            mo29070a((Status) dcl.m8163a(parcel, Status.CREATOR), (ReadDeviceLevelSettingsResult) dcl.m8163a(parcel, ReadDeviceLevelSettingsResult.CREATOR));
        }
        return true;
    }
}
