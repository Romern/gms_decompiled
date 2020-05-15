package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: aoof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoof extends dcj implements aooh {
    public aoof(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    /* renamed from: a */
    public final void mo43122a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo43123a(Status status, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeLong(j);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo43124a(Status status, PseudonymousIdToken pseudonymousIdToken) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, pseudonymousIdToken);
        mo8530c(1, bj);
    }
}
