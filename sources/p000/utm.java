package p000;

import android.os.IBinder;
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

/* renamed from: utm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class utm extends dcj implements uto {
    public utm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo27971a() {
        mo8528b(7, mo8529bj());
    }

    /* renamed from: a */
    public final void mo27107a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo27972a(ChangeSequenceNumber changeSequenceNumber) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, changeSequenceNumber);
        mo8528b(17, bj);
    }

    /* renamed from: a */
    public final void mo27973a(GetPermissionsResponse getPermissionsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getPermissionsResponse);
        mo8528b(20, bj);
    }

    /* renamed from: a */
    public final void mo27974a(OnChangesResponse onChangesResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onChangesResponse);
        mo8528b(18, bj);
    }

    /* renamed from: a */
    public final void mo27975a(OnContentsResponse onContentsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onContentsResponse);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo27948a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onDeviceUsagePreferenceResponse);
        mo8528b(14, bj);
    }

    /* renamed from: a */
    public final void mo27976a(OnDownloadProgressResponse onDownloadProgressResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onDownloadProgressResponse);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo27945a(OnDriveIdResponse onDriveIdResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onDriveIdResponse);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo27977a(OnFetchThumbnailResponse onFetchThumbnailResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onFetchThumbnailResponse);
        mo8528b(16, bj);
    }

    /* renamed from: a */
    public final void mo27947a(OnListEntriesResponse onListEntriesResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onListEntriesResponse);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo27952a(OnListParentsResponse onListParentsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onListParentsResponse);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo27978a(OnLoadRealtimeResponse onLoadRealtimeResponse, vju vju) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onLoadRealtimeResponse);
        dcl.m8164a(bj, vju);
        mo8528b(11, bj);
    }

    /* renamed from: a */
    public final void mo27946a(OnMetadataResponse onMetadataResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onMetadataResponse);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo27949a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onPinnedDownloadPreferencesResponse);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo27979a(OnResourceIdSetResponse onResourceIdSetResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onResourceIdSetResponse);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo27980a(OnStartStreamSession onStartStreamSession) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onStartStreamSession);
        mo8528b(22, bj);
    }

    /* renamed from: a */
    public final void mo27950a(OnSyncMoreResponse onSyncMoreResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onSyncMoreResponse);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo27981a(StringListResponse stringListResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, stringListResponse);
        mo8528b(21, bj);
    }

    /* renamed from: a */
    public final void mo27982a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(15, bj);
    }
}
