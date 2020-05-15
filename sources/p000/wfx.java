package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;

/* renamed from: wfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class wfx extends dck implements wfy {
    public wfx() {
        super("com.google.android.gms.facs.cache.internal.IFacsInternalSyncCallbacks");
    }

    /* renamed from: a */
    public void mo29075a(Status status, SyncActivityControlsSettingsInternalResult syncActivityControlsSettingsInternalResult) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo29074a(Status status, UpdateActivityControlsSettingsInternalResult updateActivityControlsSettingsInternalResult) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo29075a((Status) dcl.m8163a(parcel, Status.CREATOR), (SyncActivityControlsSettingsInternalResult) dcl.m8163a(parcel, SyncActivityControlsSettingsInternalResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo29074a((Status) dcl.m8163a(parcel, Status.CREATOR), (UpdateActivityControlsSettingsInternalResult) dcl.m8163a(parcel, UpdateActivityControlsSettingsInternalResult.CREATOR));
        }
        return true;
    }
}
