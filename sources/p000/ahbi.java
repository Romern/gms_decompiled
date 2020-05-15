package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* renamed from: ahbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahbi extends dcj implements ahbk {
    public ahbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    /* renamed from: a */
    public final void mo36274a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: b */
    public final void mo36276b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo36275a(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, openFileDescriptorResponse);
        mo8530c(1, bj);
    }
}
