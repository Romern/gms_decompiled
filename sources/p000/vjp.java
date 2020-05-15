package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

/* renamed from: vjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vjp extends dcj implements IInterface {
    public vjp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.IEventCallback");
    }

    /* renamed from: a */
    public final void mo28502a(ParcelableEventList parcelableEventList) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, parcelableEventList);
        mo8528b(1, bj);
    }
}
