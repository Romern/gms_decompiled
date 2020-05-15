package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.FootprintsRecordingSetting;

/* renamed from: afnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afnb extends dcj implements IInterface {
    public afnb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback");
    }

    /* renamed from: a */
    public final void mo34970a(Status status, FootprintsRecordingSetting footprintsRecordingSetting) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, footprintsRecordingSetting);
        mo8530c(1, bj);
    }
}
