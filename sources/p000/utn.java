package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.internal.GetPermissionsResponse;
import com.google.android.gms.drive.internal.OnChangesResponse;
import com.google.android.gms.drive.internal.OnContentsResponse;
import com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse;
import com.google.android.gms.drive.internal.OnDownloadProgressResponse;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import com.google.android.gms.drive.internal.OnFetchThumbnailResponse;
import com.google.android.gms.drive.internal.OnListEntriesResponse;
import com.google.android.gms.drive.internal.OnListParentsResponse;
import com.google.android.gms.drive.internal.OnLoadRealtimeResponse;
import com.google.android.gms.drive.internal.OnMetadataResponse;
import com.google.android.gms.drive.internal.OnPinnedDownloadPreferencesResponse;
import com.google.android.gms.drive.internal.OnResourceIdSetResponse;
import com.google.android.gms.drive.internal.OnStartStreamSession;
import com.google.android.gms.drive.internal.OnSyncMoreResponse;
import com.google.android.gms.drive.internal.StringListResponse;

/* renamed from: utn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class utn extends dck implements uto {
    public utn() {
        super("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
    }

    /* renamed from: a */
    public void mo27971a() {
    }

    /* renamed from: a */
    public void mo27107a(Status status) {
    }

    /* renamed from: a */
    public final void mo27972a(ChangeSequenceNumber changeSequenceNumber) {
    }

    /* renamed from: a */
    public final void mo27973a(GetPermissionsResponse getPermissionsResponse) {
    }

    /* renamed from: a */
    public final void mo27974a(OnChangesResponse onChangesResponse) {
    }

    /* renamed from: a */
    public final void mo27975a(OnContentsResponse onContentsResponse) {
    }

    /* renamed from: a */
    public void mo27948a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
    }

    /* renamed from: a */
    public final void mo27976a(OnDownloadProgressResponse onDownloadProgressResponse) {
    }

    /* renamed from: a */
    public void mo27945a(OnDriveIdResponse onDriveIdResponse) {
    }

    /* renamed from: a */
    public final void mo27977a(OnFetchThumbnailResponse onFetchThumbnailResponse) {
    }

    /* renamed from: a */
    public void mo27947a(OnListEntriesResponse onListEntriesResponse) {
    }

    /* renamed from: a */
    public void mo27952a(OnListParentsResponse onListParentsResponse) {
    }

    /* renamed from: a */
    public final void mo27978a(OnLoadRealtimeResponse onLoadRealtimeResponse, vju vju) {
    }

    /* renamed from: a */
    public void mo27946a(OnMetadataResponse onMetadataResponse) {
    }

    /* renamed from: a */
    public void mo27949a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse) {
    }

    /* renamed from: a */
    public final void mo27979a(OnResourceIdSetResponse onResourceIdSetResponse) {
    }

    /* renamed from: a */
    public final void mo27980a(OnStartStreamSession onStartStreamSession) {
    }

    /* renamed from: a */
    public void mo27950a(OnSyncMoreResponse onSyncMoreResponse) {
    }

    /* renamed from: a */
    public final void mo27981a(StringListResponse stringListResponse) {
    }

    /* renamed from: a */
    public final void mo27982a(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                OnDownloadProgressResponse onDownloadProgressResponse = (OnDownloadProgressResponse) dcl.m8163a(parcel, OnDownloadProgressResponse.CREATOR);
                break;
            case 2:
                mo27947a((OnListEntriesResponse) dcl.m8163a(parcel, OnListEntriesResponse.CREATOR));
                break;
            case 3:
                mo27945a((OnDriveIdResponse) dcl.m8163a(parcel, OnDriveIdResponse.CREATOR));
                break;
            case 4:
                mo27946a((OnMetadataResponse) dcl.m8163a(parcel, OnMetadataResponse.CREATOR));
                break;
            case 5:
                OnContentsResponse onContentsResponse = (OnContentsResponse) dcl.m8163a(parcel, OnContentsResponse.CREATOR);
                break;
            case 6:
                mo27107a((Status) dcl.m8163a(parcel, Status.CREATOR));
                break;
            case 7:
                mo27971a();
                break;
            case 8:
                mo27952a((OnListParentsResponse) dcl.m8163a(parcel, OnListParentsResponse.CREATOR));
                break;
            case 9:
                mo27950a((OnSyncMoreResponse) dcl.m8163a(parcel, OnSyncMoreResponse.CREATOR));
                break;
            case 10:
            case 19:
            default:
                return false;
            case 11:
                OnLoadRealtimeResponse onLoadRealtimeResponse = (OnLoadRealtimeResponse) dcl.m8163a(parcel, OnLoadRealtimeResponse.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (!(queryLocalInterface instanceof vju)) {
                        new vjs(readStrongBinder);
                        break;
                    } else {
                        vju vju = (vju) queryLocalInterface;
                        break;
                    }
                }
                break;
            case 12:
                OnResourceIdSetResponse onResourceIdSetResponse = (OnResourceIdSetResponse) dcl.m8163a(parcel, OnResourceIdSetResponse.CREATOR);
                break;
            case 13:
                mo27949a((OnPinnedDownloadPreferencesResponse) dcl.m8163a(parcel, OnPinnedDownloadPreferencesResponse.CREATOR));
                break;
            case 14:
                mo27948a((OnDeviceUsagePreferenceResponse) dcl.m8163a(parcel, OnDeviceUsagePreferenceResponse.CREATOR));
                break;
            case 15:
                dcl.m8167a(parcel);
                break;
            case 16:
                OnFetchThumbnailResponse onFetchThumbnailResponse = (OnFetchThumbnailResponse) dcl.m8163a(parcel, OnFetchThumbnailResponse.CREATOR);
                break;
            case 17:
                ChangeSequenceNumber changeSequenceNumber = (ChangeSequenceNumber) dcl.m8163a(parcel, ChangeSequenceNumber.CREATOR);
                break;
            case 18:
                OnChangesResponse onChangesResponse = (OnChangesResponse) dcl.m8163a(parcel, OnChangesResponse.CREATOR);
                break;
            case 20:
                GetPermissionsResponse getPermissionsResponse = (GetPermissionsResponse) dcl.m8163a(parcel, GetPermissionsResponse.CREATOR);
                break;
            case 21:
                StringListResponse stringListResponse = (StringListResponse) dcl.m8163a(parcel, StringListResponse.CREATOR);
                break;
            case 22:
                OnStartStreamSession onStartStreamSession = (OnStartStreamSession) dcl.m8163a(parcel, OnStartStreamSession.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
