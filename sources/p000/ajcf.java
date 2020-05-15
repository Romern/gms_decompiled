package p000;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ajcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajcf extends dck implements ajcg {

    /* renamed from: a */
    private final rod f70354a;

    /* renamed from: b */
    private boolean f70355b;

    public ajcf() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }

    /* renamed from: a */
    public final synchronized void mo38481a(Status status) {
        if (this.f70355b) {
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Received multiple statuses: ");
            sb.append(valueOf);
            Log.wtf("NearbyMessagesCallbackWrapper", sb.toString(), new Exception());
            return;
        }
        this.f70354a.mo24968a(new ajdy(status));
        this.f70355b = true;
    }

    public ajcf(rod rod) {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
        this.f70355b = false;
        this.f70354a = rod;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo38481a((Status) dcl.m8163a(parcel, Status.CREATOR));
        return true;
    }
}
