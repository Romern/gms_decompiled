package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: hii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hii extends dcj implements IInterface {
    public hii(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* renamed from: a */
    public final void mo12486a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo12487a(Status status, Credential credential) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, credential);
        mo8528b(1, bj);
    }
}
