package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.HandleClientLifecycleEventRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: ajci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ajci extends dck implements ajcj {
    public ajci() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo38484a((PublishRequest) dcl.m8163a(parcel, PublishRequest.CREATOR));
        } else if (i == 2) {
            mo38487a((UnpublishRequest) dcl.m8163a(parcel, UnpublishRequest.CREATOR));
        } else if (i == 3) {
            mo38486a((SubscribeRequest) dcl.m8163a(parcel, SubscribeRequest.CREATOR));
        } else if (i == 4) {
            mo38488a((UnsubscribeRequest) dcl.m8163a(parcel, UnsubscribeRequest.CREATOR));
        } else if (i == 7) {
            mo38482a((GetPermissionStatusRequest) dcl.m8163a(parcel, GetPermissionStatusRequest.CREATOR));
        } else if (i == 8) {
            mo38485a((RegisterStatusCallbackRequest) dcl.m8163a(parcel, RegisterStatusCallbackRequest.CREATOR));
        } else if (i != 9) {
            return false;
        } else {
            mo38483a((HandleClientLifecycleEventRequest) dcl.m8163a(parcel, HandleClientLifecycleEventRequest.CREATOR));
        }
        return true;
    }
}
