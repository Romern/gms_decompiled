package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: aptg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptg extends aprg implements aaai {
    /* renamed from: a */
    public final void mo47545a(aprf aprf) {
        Status status = Status.f30107a;
        Parcel bj = aprf.mo8529bj();
        dcl.m8165a(bj, status);
        aprf.mo8530c(2, bj);
    }

    /* renamed from: b */
    public final void mo47546b(aprf aprf) {
        Status status = new Status(10000);
        Parcel bj = aprf.mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, (Parcelable) null);
        aprf.mo8530c(1, bj);
    }
}
