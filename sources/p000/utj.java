package p000;

import android.content.IntentSender;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
import com.google.android.gms.drive.internal.AddEventListenerRequest;
import com.google.android.gms.drive.internal.AddPermissionRequest;
import com.google.android.gms.drive.internal.AuthorizeAccessRequest;
import com.google.android.gms.drive.internal.CancelPendingActionsRequest;
import com.google.android.gms.drive.internal.ChangeResourceParentsRequest;
import com.google.android.gms.drive.internal.CheckResourceIdsExistRequest;
import com.google.android.gms.drive.internal.CloseContentsAndUpdateMetadataRequest;
import com.google.android.gms.drive.internal.CloseContentsRequest;
import com.google.android.gms.drive.internal.ControlProgressRequest;
import com.google.android.gms.drive.internal.CreateContentsRequest;
import com.google.android.gms.drive.internal.CreateFileIntentSenderRequest;
import com.google.android.gms.drive.internal.CreateFileRequest;
import com.google.android.gms.drive.internal.CreateFolderRequest;
import com.google.android.gms.drive.internal.DeleteResourceRequest;
import com.google.android.gms.drive.internal.DisconnectRequest;
import com.google.android.gms.drive.internal.DriveServiceResponse;
import com.google.android.gms.drive.internal.FetchThumbnailRequest;
import com.google.android.gms.drive.internal.GetChangesRequest;
import com.google.android.gms.drive.internal.GetDriveIdFromUniqueIdentifierRequest;
import com.google.android.gms.drive.internal.GetMetadataRequest;
import com.google.android.gms.drive.internal.GetPermissionsRequest;
import com.google.android.gms.drive.internal.ListParentsRequest;
import com.google.android.gms.drive.internal.LoadRealtimeRequest;
import com.google.android.gms.drive.internal.OpenContentsRequest;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.internal.RemoveEventListenerRequest;
import com.google.android.gms.drive.internal.RemovePermissionRequest;
import com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest;
import com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest;
import com.google.android.gms.drive.internal.SetResourceParentsRequest;
import com.google.android.gms.drive.internal.StreamContentsRequest;
import com.google.android.gms.drive.internal.TrashResourceRequest;
import com.google.android.gms.drive.internal.UnsubscribeResourceRequest;
import com.google.android.gms.drive.internal.UntrashResourceRequest;
import com.google.android.gms.drive.internal.UpdateMetadataRequest;
import com.google.android.gms.drive.internal.UpdatePermissionRequest;

/* renamed from: utj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class utj extends dcj implements utl {
    public utj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IDriveService");
    }

    /* renamed from: a */
    public final IntentSender mo27108a(CreateFileIntentSenderRequest createFileIntentSenderRequest) {
        throw null;
    }

    /* renamed from: a */
    public final IntentSender mo27109a(OpenFileIntentSenderRequest openFileIntentSenderRequest) {
        throw null;
    }

    /* renamed from: a */
    public final DriveServiceResponse mo27110a(OpenContentsRequest openContentsRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final DriveServiceResponse mo27111a(StreamContentsRequest streamContentsRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27112a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27113a(AddEventListenerRequest addEventListenerRequest, utr utr, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27114a(AddPermissionRequest addPermissionRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27116a(CancelPendingActionsRequest cancelPendingActionsRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27117a(ChangeResourceParentsRequest changeResourceParentsRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27118a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27119a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27120a(CloseContentsRequest closeContentsRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27121a(ControlProgressRequest controlProgressRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27122a(CreateContentsRequest createContentsRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27125a(DeleteResourceRequest deleteResourceRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27127a(FetchThumbnailRequest fetchThumbnailRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27128a(GetChangesRequest getChangesRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27129a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27131a(GetPermissionsRequest getPermissionsRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27133a(LoadRealtimeRequest loadRealtimeRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27136a(RemoveEventListenerRequest removeEventListenerRequest, utr utr, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27137a(RemovePermissionRequest removePermissionRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27138a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27140a(SetResourceParentsRequest setResourceParentsRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27141a(TrashResourceRequest trashResourceRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27142a(UnsubscribeResourceRequest unsubscribeResourceRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27143a(UntrashResourceRequest untrashResourceRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27144a(UpdateMetadataRequest updateMetadataRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27145a(UpdatePermissionRequest updatePermissionRequest, uto uto) {
        throw null;
    }

    /* renamed from: a */
    public final void mo27146a(uto uto) {
        throw null;
    }

    /* renamed from: b */
    public final void mo27149b(QueryRequest queryRequest, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, queryRequest);
        dcl.m8164a(bj, uto);
        mo8528b(19, bj);
    }

    /* renamed from: c */
    public final void mo27152c(uto uto) {
        throw null;
    }

    /* renamed from: d */
    public final void mo27153d(uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, uto);
        mo8528b(32, bj);
    }

    /* renamed from: e */
    public final void mo27154e(uto uto) {
        throw null;
    }

    /* renamed from: f */
    public final void mo27155f(uto uto) {
        throw null;
    }

    /* renamed from: g */
    public final void mo27156g(uto uto) {
        throw null;
    }

    /* renamed from: h */
    public final void mo27157h(uto uto) {
        throw null;
    }

    /* renamed from: b */
    public final void mo27150b(uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, uto);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo27115a(AuthorizeAccessRequest authorizeAccessRequest, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, authorizeAccessRequest);
        dcl.m8164a(bj, uto);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo27123a(CreateFileRequest createFileRequest, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, createFileRequest);
        dcl.m8164a(bj, uto);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo27124a(CreateFolderRequest createFolderRequest, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, createFolderRequest);
        dcl.m8164a(bj, uto);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo27126a(DisconnectRequest disconnectRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, disconnectRequest);
        mo8528b(16, bj);
    }

    /* renamed from: a */
    public final void mo27130a(GetMetadataRequest getMetadataRequest, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getMetadataRequest);
        dcl.m8164a(bj, uto);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo27132a(ListParentsRequest listParentsRequest, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, listParentsRequest);
        dcl.m8164a(bj, uto);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo27134a(QueryRequest queryRequest, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, queryRequest);
        dcl.m8164a(bj, uto);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo27135a(QueryRequest queryRequest, utr utr, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, queryRequest);
        dcl.m8164a(bj, utr);
        dcl.m8164a(bj, uto);
        mo8528b(51, bj);
    }

    /* renamed from: a */
    public final void mo27139a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setPinnedDownloadPreferencesRequest);
        dcl.m8164a(bj, uto);
        mo8528b(33, bj);
    }

    /* renamed from: a */
    public final void mo27147a(utr utr, uto uto) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, utr);
        dcl.m8164a(bj, uto);
        mo8528b(52, bj);
    }
}
