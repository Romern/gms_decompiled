package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appusage.AppUsageIntervals;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: gax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gax extends dcj implements IInterface {
    public gax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appusage.internal.IAppUsageCallbacks");
    }

    /* renamed from: a */
    public final void mo11605a(Status status, AppUsageIntervals appUsageIntervals) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, appUsageIntervals);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo11606a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(2, bj);
    }
}
