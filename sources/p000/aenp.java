package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: aenp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aenp extends dcj implements aenr {
    public aenp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IPlacesCallbacks");
    }

    /* renamed from: a */
    public final void mo34321a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(4, bj);
    }

    /* renamed from: b */
    public final void mo34323b(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8530c(2, bj);
    }

    /* renamed from: c */
    public final void mo34324c(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8530c(3, bj);
    }

    /* renamed from: d */
    public final void mo34325d(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo34322a(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8530c(1, bj);
    }
}
