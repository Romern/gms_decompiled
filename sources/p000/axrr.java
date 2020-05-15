package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetConfigResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

/* renamed from: axrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class axrr extends dck implements axrs {
    public axrr() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    /* renamed from: a */
    public void mo53437a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo53461b(CloseChannelResponse closeChannelResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53438a(DataHolder dataHolder) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53439a(AddLocalCapabilityResponse addLocalCapabilityResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53440a(ChannelReceiveFileResponse channelReceiveFileResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53441a(ChannelSendFileResponse channelSendFileResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53442a(CloseChannelResponse closeChannelResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53443a(DeleteDataItemsResponse deleteDataItemsResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53444a(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53445a(GetCapabilityResponse getCapabilityResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53446a(GetChannelInputStreamResponse getChannelInputStreamResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53447a(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo53448a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53449a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53450a(GetCloudSyncSettingResponse getCloudSyncSettingResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53451a(GetConfigResponse getConfigResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53452a(GetConfigsResponse getConfigsResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53453a(GetConnectedNodesResponse getConnectedNodesResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53454a(GetDataItemResponse getDataItemResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53455a(GetFdForAssetResponse getFdForAssetResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53456a(GetLocalNodeResponse getLocalNodeResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo53457a(OpenChannelResponse openChannelResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53458a(PutDataResponse putDataResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53459a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53460a(SendMessageResponse sendMessageResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo53398a(StorageInfoResponse storageInfoResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                mo53451a((GetConfigResponse) dcl.m8163a(parcel, GetConfigResponse.CREATOR));
                break;
            case 3:
                mo53458a((PutDataResponse) dcl.m8163a(parcel, PutDataResponse.CREATOR));
                break;
            case 4:
                mo53454a((GetDataItemResponse) dcl.m8163a(parcel, GetDataItemResponse.CREATOR));
                break;
            case 5:
                mo53438a((DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
                break;
            case 6:
                mo53443a((DeleteDataItemsResponse) dcl.m8163a(parcel, DeleteDataItemsResponse.CREATOR));
                break;
            case 7:
                mo53460a((SendMessageResponse) dcl.m8163a(parcel, SendMessageResponse.CREATOR));
                break;
            case 8:
                mo53455a((GetFdForAssetResponse) dcl.m8163a(parcel, GetFdForAssetResponse.CREATOR));
                break;
            case 9:
                mo53456a((GetLocalNodeResponse) dcl.m8163a(parcel, GetLocalNodeResponse.CREATOR));
                break;
            case 10:
                mo53453a((GetConnectedNodesResponse) dcl.m8163a(parcel, GetConnectedNodesResponse.CREATOR));
                break;
            case 11:
                mo53437a((Status) dcl.m8163a(parcel, Status.CREATOR));
                break;
            case 12:
                mo53398a((StorageInfoResponse) dcl.m8163a(parcel, StorageInfoResponse.CREATOR));
                break;
            case 13:
                mo53452a((GetConfigsResponse) dcl.m8163a(parcel, GetConfigsResponse.CREATOR));
                break;
            case 14:
                mo53457a((OpenChannelResponse) dcl.m8163a(parcel, OpenChannelResponse.CREATOR));
                break;
            case 15:
                mo53442a((CloseChannelResponse) dcl.m8163a(parcel, CloseChannelResponse.CREATOR));
                break;
            case 16:
                mo53461b((CloseChannelResponse) dcl.m8163a(parcel, CloseChannelResponse.CREATOR));
                break;
            case 17:
                mo53446a((GetChannelInputStreamResponse) dcl.m8163a(parcel, GetChannelInputStreamResponse.CREATOR));
                break;
            case 18:
                mo53447a((GetChannelOutputStreamResponse) dcl.m8163a(parcel, GetChannelOutputStreamResponse.CREATOR));
                break;
            case 19:
                mo53440a((ChannelReceiveFileResponse) dcl.m8163a(parcel, ChannelReceiveFileResponse.CREATOR));
                break;
            case 20:
                mo53441a((ChannelSendFileResponse) dcl.m8163a(parcel, ChannelSendFileResponse.CREATOR));
                break;
            case 21:
            case 24:
            case 25:
            default:
                return false;
            case 22:
                mo53445a((GetCapabilityResponse) dcl.m8163a(parcel, GetCapabilityResponse.CREATOR));
                break;
            case 23:
                mo53444a((GetAllCapabilitiesResponse) dcl.m8163a(parcel, GetAllCapabilitiesResponse.CREATOR));
                break;
            case 26:
                mo53439a((AddLocalCapabilityResponse) dcl.m8163a(parcel, AddLocalCapabilityResponse.CREATOR));
                break;
            case 27:
                mo53459a((RemoveLocalCapabilityResponse) dcl.m8163a(parcel, RemoveLocalCapabilityResponse.CREATOR));
                break;
            case 28:
                mo53448a((GetCloudSyncOptInOutDoneResponse) dcl.m8163a(parcel, GetCloudSyncOptInOutDoneResponse.CREATOR));
                break;
            case 29:
                mo53450a((GetCloudSyncSettingResponse) dcl.m8163a(parcel, GetCloudSyncSettingResponse.CREATOR));
                break;
            case 30:
                mo53449a((GetCloudSyncOptInStatusResponse) dcl.m8163a(parcel, GetCloudSyncOptInStatusResponse.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
