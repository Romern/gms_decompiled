package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ryn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryn extends dcj implements ryp {
    public ryn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo25255a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(1, bj);
    }
}
