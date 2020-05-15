package p000;

import android.os.IInterface;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: ajcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ajcj extends IInterface {
    /* renamed from: a */
    void mo38482a(GetPermissionStatusRequest getPermissionStatusRequest);

    /* renamed from: a */
    void mo38483a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest);

    /* renamed from: a */
    void mo38484a(PublishRequest publishRequest);

    /* renamed from: a */
    void mo38485a(RegisterStatusCallbackRequest registerStatusCallbackRequest);

    /* renamed from: a */
    void mo38486a(SubscribeRequest subscribeRequest);

    /* renamed from: a */
    void mo38487a(UnpublishRequest unpublishRequest);

    /* renamed from: a */
    void mo38488a(UnsubscribeRequest unsubscribeRequest);
}
