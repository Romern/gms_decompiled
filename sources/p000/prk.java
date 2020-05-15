package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: prk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class prk extends dcj implements prm {
    public prk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.firstparty.internal.ICastRemoteControlNotificationEnabledStatusCallbacks");
    }

    /* renamed from: a */
    public final void mo23579a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo23580a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8530c(1, bj);
    }
}
