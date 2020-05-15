package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;

/* renamed from: ftj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ftj extends dcj implements ftl {
    public ftj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    /* renamed from: a */
    public final void mo11185a(GetRecentContextCall$Response getRecentContextCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getRecentContextCall$Response);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo11304a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo11305a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, parcelFileDescriptor);
        mo8530c(2, bj);
    }
}
