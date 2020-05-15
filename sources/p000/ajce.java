package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ajce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajce extends dcj implements ajcg {
    public ajce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }

    /* renamed from: a */
    public final void mo38481a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(1, bj);
    }
}
