package p000;

import android.content.IntentSender;
import android.os.IInterface;
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

/* renamed from: utl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface utl extends IInterface {
    /* renamed from: a */
    IntentSender mo27108a(CreateFileIntentSenderRequest createFileIntentSenderRequest);

    /* renamed from: a */
    IntentSender mo27109a(OpenFileIntentSenderRequest openFileIntentSenderRequest);

    /* renamed from: a */
    DriveServiceResponse mo27110a(OpenContentsRequest openContentsRequest, uto uto);

    /* renamed from: a */
    DriveServiceResponse mo27111a(StreamContentsRequest streamContentsRequest, uto uto);

    /* renamed from: a */
    void mo27112a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, uto uto);

    /* renamed from: a */
    void mo27113a(AddEventListenerRequest addEventListenerRequest, utr utr, uto uto);

    /* renamed from: a */
    void mo27114a(AddPermissionRequest addPermissionRequest, uto uto);

    /* renamed from: a */
    void mo27115a(AuthorizeAccessRequest authorizeAccessRequest, uto uto);

    /* renamed from: a */
    void mo27116a(CancelPendingActionsRequest cancelPendingActionsRequest, uto uto);

    /* renamed from: a */
    void mo27117a(ChangeResourceParentsRequest changeResourceParentsRequest, uto uto);

    /* renamed from: a */
    void mo27118a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, uto uto);

    /* renamed from: a */
    void mo27119a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, uto uto);

    /* renamed from: a */
    void mo27120a(CloseContentsRequest closeContentsRequest, uto uto);

    /* renamed from: a */
    void mo27121a(ControlProgressRequest controlProgressRequest, uto uto);

    /* renamed from: a */
    void mo27122a(CreateContentsRequest createContentsRequest, uto uto);

    /* renamed from: a */
    void mo27123a(CreateFileRequest createFileRequest, uto uto);

    /* renamed from: a */
    void mo27124a(CreateFolderRequest createFolderRequest, uto uto);

    /* renamed from: a */
    void mo27125a(DeleteResourceRequest deleteResourceRequest, uto uto);

    /* renamed from: a */
    void mo27126a(DisconnectRequest disconnectRequest);

    /* renamed from: a */
    void mo27127a(FetchThumbnailRequest fetchThumbnailRequest, uto uto);

    /* renamed from: a */
    void mo27128a(GetChangesRequest getChangesRequest, uto uto);

    /* renamed from: a */
    void mo27129a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, uto uto);

    /* renamed from: a */
    void mo27130a(GetMetadataRequest getMetadataRequest, uto uto);

    /* renamed from: a */
    void mo27131a(GetPermissionsRequest getPermissionsRequest, uto uto);

    /* renamed from: a */
    void mo27132a(ListParentsRequest listParentsRequest, uto uto);

    /* renamed from: a */
    void mo27133a(LoadRealtimeRequest loadRealtimeRequest, uto uto);

    /* renamed from: a */
    void mo27134a(QueryRequest queryRequest, uto uto);

    /* renamed from: a */
    void mo27135a(QueryRequest queryRequest, utr utr, uto uto);

    /* renamed from: a */
    void mo27136a(RemoveEventListenerRequest removeEventListenerRequest, utr utr, uto uto);

    /* renamed from: a */
    void mo27137a(RemovePermissionRequest removePermissionRequest, uto uto);

    /* renamed from: a */
    void mo27138a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, uto uto);

    /* renamed from: a */
    void mo27139a(SetPinnedDownloadPreferencesRequest setPinnedDownloadPreferencesRequest, uto uto);

    /* renamed from: a */
    void mo27140a(SetResourceParentsRequest setResourceParentsRequest, uto uto);

    /* renamed from: a */
    void mo27141a(TrashResourceRequest trashResourceRequest, uto uto);

    /* renamed from: a */
    void mo27142a(UnsubscribeResourceRequest unsubscribeResourceRequest, uto uto);

    /* renamed from: a */
    void mo27143a(UntrashResourceRequest untrashResourceRequest, uto uto);

    /* renamed from: a */
    void mo27144a(UpdateMetadataRequest updateMetadataRequest, uto uto);

    /* renamed from: a */
    void mo27145a(UpdatePermissionRequest updatePermissionRequest, uto uto);

    /* renamed from: a */
    void mo27146a(uto uto);

    /* renamed from: a */
    void mo27147a(utr utr, uto uto);

    /* renamed from: b */
    void mo27149b(QueryRequest queryRequest, uto uto);

    /* renamed from: b */
    void mo27150b(uto uto);

    /* renamed from: c */
    void mo27152c(uto uto);

    /* renamed from: d */
    void mo27153d(uto uto);

    /* renamed from: e */
    void mo27154e(uto uto);

    /* renamed from: f */
    void mo27155f(uto uto);

    /* renamed from: g */
    void mo27156g(uto uto);

    /* renamed from: h */
    void mo27157h(uto uto);
}
