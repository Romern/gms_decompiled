package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import java.util.List;

/* renamed from: arjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arjd extends dcj implements arjf {
    public arjd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
    }

    /* renamed from: a */
    public final void mo48597a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo48602b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: c */
    public final void mo48603c(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(3, bj);
    }

    /* renamed from: d */
    public final void mo48604d(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }

    /* renamed from: e */
    public final void mo48605e(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo48598a(Status status, AdvertisingInfo advertisingInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, advertisingInfo);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo48599a(Status status, ManagedAccountSetupInfo managedAccountSetupInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, managedAccountSetupInfo);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo48600a(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo48601a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(8, bj);
    }
}
