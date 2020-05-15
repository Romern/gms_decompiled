package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;

/* renamed from: wfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface wfs extends IInterface {
    /* renamed from: a */
    void mo29071a(Status status);

    /* renamed from: a */
    void mo29067a(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult);

    /* renamed from: a */
    void mo29069a(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult);

    /* renamed from: a */
    void mo29070a(Status status, ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult);

    /* renamed from: a */
    void mo29068a(Status status, UpdateActivityControlsSettingsResult updateActivityControlsSettingsResult);
}
