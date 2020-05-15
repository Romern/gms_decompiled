package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: utp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class utp extends dcj implements utr {
    public utp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IEventCallback");
    }

    /* renamed from: a */
    public final void mo27248a(OnEventResponse onEventResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onEventResponse);
        mo8528b(1, bj);
    }
}
