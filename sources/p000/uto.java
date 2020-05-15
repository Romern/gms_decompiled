package p000;

import android.os.IInterface;
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

/* renamed from: uto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface uto extends IInterface {
    /* renamed from: a */
    void mo27971a();

    /* renamed from: a */
    void mo27107a(Status status);

    /* renamed from: a */
    void mo27972a(ChangeSequenceNumber changeSequenceNumber);

    /* renamed from: a */
    void mo27973a(GetPermissionsResponse getPermissionsResponse);

    /* renamed from: a */
    void mo27974a(OnChangesResponse onChangesResponse);

    /* renamed from: a */
    void mo27975a(OnContentsResponse onContentsResponse);

    /* renamed from: a */
    void mo27948a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse);

    /* renamed from: a */
    void mo27976a(OnDownloadProgressResponse onDownloadProgressResponse);

    /* renamed from: a */
    void mo27945a(OnDriveIdResponse onDriveIdResponse);

    /* renamed from: a */
    void mo27977a(OnFetchThumbnailResponse onFetchThumbnailResponse);

    /* renamed from: a */
    void mo27947a(OnListEntriesResponse onListEntriesResponse);

    /* renamed from: a */
    void mo27952a(OnListParentsResponse onListParentsResponse);

    /* renamed from: a */
    void mo27978a(OnLoadRealtimeResponse onLoadRealtimeResponse, vju vju);

    /* renamed from: a */
    void mo27946a(OnMetadataResponse onMetadataResponse);

    /* renamed from: a */
    void mo27949a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse);

    /* renamed from: a */
    void mo27979a(OnResourceIdSetResponse onResourceIdSetResponse);

    /* renamed from: a */
    void mo27980a(OnStartStreamSession onStartStreamSession);

    /* renamed from: a */
    void mo27950a(OnSyncMoreResponse onSyncMoreResponse);

    /* renamed from: a */
    void mo27981a(StringListResponse stringListResponse);

    /* renamed from: a */
    void mo27982a(boolean z);
}
