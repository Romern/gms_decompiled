package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: xof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xof extends dcj implements xoh {
    public xof(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    /* renamed from: a */
    public final void mo29965a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo29966a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(1, bj);
    }
}
