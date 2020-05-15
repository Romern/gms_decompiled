package p000;

import android.os.IInterface;
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

/* renamed from: axrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface axrs extends IInterface {
    /* renamed from: a */
    void mo53437a(Status status);

    /* renamed from: a */
    void mo53438a(DataHolder dataHolder);

    /* renamed from: a */
    void mo53439a(AddLocalCapabilityResponse addLocalCapabilityResponse);

    /* renamed from: a */
    void mo53440a(ChannelReceiveFileResponse channelReceiveFileResponse);

    /* renamed from: a */
    void mo53441a(ChannelSendFileResponse channelSendFileResponse);

    /* renamed from: a */
    void mo53442a(CloseChannelResponse closeChannelResponse);

    /* renamed from: a */
    void mo53443a(DeleteDataItemsResponse deleteDataItemsResponse);

    /* renamed from: a */
    void mo53444a(GetAllCapabilitiesResponse getAllCapabilitiesResponse);

    /* renamed from: a */
    void mo53445a(GetCapabilityResponse getCapabilityResponse);

    /* renamed from: a */
    void mo53446a(GetChannelInputStreamResponse getChannelInputStreamResponse);

    /* renamed from: a */
    void mo53447a(GetChannelOutputStreamResponse getChannelOutputStreamResponse);

    /* renamed from: a */
    void mo53448a(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse);

    /* renamed from: a */
    void mo53449a(GetCloudSyncOptInStatusResponse getCloudSyncOptInStatusResponse);

    /* renamed from: a */
    void mo53450a(GetCloudSyncSettingResponse getCloudSyncSettingResponse);

    /* renamed from: a */
    void mo53451a(GetConfigResponse getConfigResponse);

    /* renamed from: a */
    void mo53452a(GetConfigsResponse getConfigsResponse);

    /* renamed from: a */
    void mo53453a(GetConnectedNodesResponse getConnectedNodesResponse);

    /* renamed from: a */
    void mo53454a(GetDataItemResponse getDataItemResponse);

    /* renamed from: a */
    void mo53455a(GetFdForAssetResponse getFdForAssetResponse);

    /* renamed from: a */
    void mo53456a(GetLocalNodeResponse getLocalNodeResponse);

    /* renamed from: a */
    void mo53457a(OpenChannelResponse openChannelResponse);

    /* renamed from: a */
    void mo53458a(PutDataResponse putDataResponse);

    /* renamed from: a */
    void mo53459a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse);

    /* renamed from: a */
    void mo53460a(SendMessageResponse sendMessageResponse);

    /* renamed from: a */
    void mo53398a(StorageInfoResponse storageInfoResponse);

    /* renamed from: b */
    void mo53461b(CloseChannelResponse closeChannelResponse);
}
