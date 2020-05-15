package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: akom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akom extends dcj implements akoo {
    public akom(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.notifications.internal.IGunsCallbacks");
    }

    /* renamed from: a */
    public final void mo39612a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(1, bj);
    }
}
