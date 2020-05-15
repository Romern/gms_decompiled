package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: hyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hyp extends dcj implements hyr {
    public hyp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    /* renamed from: a */
    public final void mo12816a(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(1, bj);
    }
}
