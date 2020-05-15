package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: ajch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajch extends dcj implements ajcj {
    public ajch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    /* renamed from: a */
    public final void mo38482a(GetPermissionStatusRequest getPermissionStatusRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo38484a(PublishRequest publishRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo38485a(RegisterStatusCallbackRequest registerStatusCallbackRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo38487a(UnpublishRequest unpublishRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo38483a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, handleClientLifecycleEventRequest);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo38486a(SubscribeRequest subscribeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, subscribeRequest);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo38488a(UnsubscribeRequest unsubscribeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, unsubscribeRequest);
        mo8530c(4, bj);
    }
}
