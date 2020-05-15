package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: alkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alkm extends dcj implements alko {
    public alkm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.payse.internal.IPaySeServiceCallbacks");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final void mo40469a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, false);
        mo8530c(2, bj);
    }
}
