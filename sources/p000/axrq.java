package p000;

import android.os.IBinder;
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

/* renamed from: axrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axrq extends dcj implements axrs {
    public axrq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    /* renamed from: a */
    public final void mo53437a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(11, bj);
    }

    /* renamed from: b */
    public final void mo53461b(CloseChannelResponse closeChannelResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, closeChannelResponse);
        mo8528b(16, bj);
    }

    /* renamed from: a */
    public final void mo53438a(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo53439a(AddLocalCapabilityResponse addLocalCapabilityResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, addLocalCapabilityResponse);
        mo8528b(26, bj);
    }

    /* renamed from: a */
    public final void mo53440a(ChannelReceiveFileResponse channelReceiveFileResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, channelReceiveFileResponse);
        mo8528b(19, bj);
    }

    /* renamed from: a */
    public final void mo53441a(ChannelSendFileResponse channelSendFileResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, channelSendFileResponse);
        mo8528b(20, bj);
    }

    /* renamed from: a */
    public final void mo53442a(CloseChannelResponse closeChannelResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, closeChannelResponse);
        mo8528b(15, bj);
    }

    /* renamed from: a */
    public final void mo53443a(DeleteDataItemsResponse deleteDataItemsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, deleteDataItemsResponse);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo53444a(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getAllCapabilitiesResponse);
        mo8528b(23, bj);
    }

    /* renamed from: a */
    public final void mo53445a(GetCapabilityResponse getCapabilityResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getCapabilityResponse);
        mo8528b(22, bj);
    }

    /* renamed from: a */
    public final void mo53446a(GetChannelInputStreamResponse getChannelInputStreamResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getChannelInputStreamResponse);
        mo8528b(17, bj);
    }

    /* renamed from: a */
    public final void mo53447a(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getChannelOutputStreamResponse);
        mo8528b(18, bj);
    }

    /* renamed from: a */
    public final void mo53448a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getCloudSyncOptInOutDoneResponse);
        mo8528b(28, bj);
    }

    /* renamed from: a */
    public final void mo53449a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getCloudSyncOptInStatusResponse);
        mo8528b(30, bj);
    }

    /* renamed from: a */
    public final void mo53450a(GetCloudSyncSettingResponse getCloudSyncSettingResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getCloudSyncSettingResponse);
        mo8528b(29, bj);
    }

    /* renamed from: a */
    public final void mo53451a(GetConfigResponse getConfigResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getConfigResponse);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo53452a(GetConfigsResponse getConfigsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getConfigsResponse);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo53453a(GetConnectedNodesResponse getConnectedNodesResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getConnectedNodesResponse);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo53454a(GetDataItemResponse getDataItemResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getDataItemResponse);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo53455a(GetFdForAssetResponse getFdForAssetResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getFdForAssetResponse);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo53456a(GetLocalNodeResponse getLocalNodeResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getLocalNodeResponse);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo53457a(OpenChannelResponse openChannelResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, openChannelResponse);
        mo8528b(14, bj);
    }

    /* renamed from: a */
    public final void mo53458a(PutDataResponse putDataResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, putDataResponse);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo53459a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, removeLocalCapabilityResponse);
        mo8528b(27, bj);
    }

    /* renamed from: a */
    public final void mo53460a(SendMessageResponse sendMessageResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sendMessageResponse);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo53398a(StorageInfoResponse storageInfoResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, storageInfoResponse);
        mo8528b(12, bj);
    }
}
