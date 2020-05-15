package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import java.util.List;

/* renamed from: arje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class arje extends dck implements arjf {

    /* renamed from: a */
    protected final rlf f87789a;

    /* renamed from: a */
    public void mo48597a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo48602b(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public void mo48603c(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo48604d(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo48605e(Status status) {
        throw new UnsupportedOperationException();
    }

    protected arje(rlf rlf) {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
        this.f87789a = rlf;
    }

    /* renamed from: a */
    public void mo48598a(Status status, AdvertisingInfo advertisingInfo) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo48599a(Status status, ManagedAccountSetupInfo managedAccountSetupInfo) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo48600a(Status status, String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo48601a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo48597a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 2:
                mo48602b((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 3:
                mo48603c((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 4:
                mo48600a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 5:
                mo48604d((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo48605e((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 7:
                mo48599a((Status) dcl.m8163a(parcel, Status.CREATOR), (ManagedAccountSetupInfo) dcl.m8163a(parcel, ManagedAccountSetupInfo.CREATOR));
                return true;
            case 8:
                mo48601a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(EsimActivationPayload.CREATOR));
                return true;
            case 9:
                mo48598a((Status) dcl.m8163a(parcel, Status.CREATOR), (AdvertisingInfo) dcl.m8163a(parcel, AdvertisingInfo.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
