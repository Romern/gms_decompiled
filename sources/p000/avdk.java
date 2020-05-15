package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;

/* renamed from: avdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class avdk extends dck implements avdl {
    public avdk() {
        super("com.google.android.gms.udc.internal.IUdcCallbacks");
    }

    /* renamed from: a */
    public void mo51154a(Status status) {
        throw new UnsupportedOperationException("Unsupported onLocalSettingsWritten callback");
    }

    /* renamed from: b */
    public final void mo51162b(Status status, byte[] bArr) {
        throw new UnsupportedOperationException("Unsupported onOverviewConfigFetched callback");
    }

    /* renamed from: c */
    public void mo51163c(Status status, byte[] bArr) {
        throw new UnsupportedOperationException("Unsupported onConsentConfigFetched callback");
    }

    /* renamed from: d */
    public void mo51164d(Status status, byte[] bArr) {
        throw new UnsupportedOperationException("Unsupported onConsentWritten callback");
    }

    /* renamed from: a */
    public final void mo51155a(Status status, PendingIntent pendingIntent) {
        throw new UnsupportedOperationException("Unsupported onPendingIntentFetched callback");
    }

    /* renamed from: a */
    public void mo51156a(Status status, DeviceDataUploadOptInFlags deviceDataUploadOptInFlags) {
        throw new UnsupportedOperationException("Unsupported onDeviceDataUploadOptInStatusFetched callback");
    }

    /* renamed from: a */
    public void mo51157a(Status status, DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable) {
        throw new UnsupportedOperationException("Unsupported onDeviceDataUploadOptedInAccountsFetched callback");
    }

    /* renamed from: a */
    public final void mo51158a(Status status, SettingDisplayInfo settingDisplayInfo, PendingIntent pendingIntent) {
        throw new UnsupportedOperationException("Unsupported onSettingDisplayInfoFetched callback");
    }

    /* renamed from: a */
    public void mo51159a(Status status, UdcCacheResponse udcCacheResponse) {
        throw new UnsupportedOperationException("Unsupported onCacheResponseFetched callback");
    }

    /* renamed from: a */
    public final void mo51160a(Status status, List list) {
        throw new UnsupportedOperationException("Unsupported onConsentStatusReceived callback");
    }

    /* renamed from: a */
    public final void mo51161a(Status status, byte[] bArr) {
        throw new UnsupportedOperationException("Unsupported onSettingsFetched callback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo51161a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createByteArray());
                return true;
            case 2:
                mo51162b((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createByteArray());
                return true;
            case 3:
                mo51163c((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createByteArray());
                return true;
            case 4:
                mo51164d((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createByteArray());
                return true;
            case 5:
                mo51160a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(SettingState.CREATOR));
                return true;
            case 6:
                mo51155a((Status) dcl.m8163a(parcel, Status.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                return true;
            case 7:
                mo51158a((Status) dcl.m8163a(parcel, Status.CREATOR), (SettingDisplayInfo) dcl.m8163a(parcel, SettingDisplayInfo.CREATOR), (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                return true;
            case 8:
                mo51159a((Status) dcl.m8163a(parcel, Status.CREATOR), (UdcCacheResponse) dcl.m8163a(parcel, UdcCacheResponse.CREATOR));
                return true;
            case 9:
                mo51154a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 10:
                mo51156a((Status) dcl.m8163a(parcel, Status.CREATOR), (DeviceDataUploadOptInFlags) dcl.m8163a(parcel, DeviceDataUploadOptInFlags.CREATOR));
                return true;
            case 11:
                mo51157a((Status) dcl.m8163a(parcel, Status.CREATOR), (DeviceDataUploadOptedInAccountsParcelable) dcl.m8163a(parcel, DeviceDataUploadOptedInAccountsParcelable.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
