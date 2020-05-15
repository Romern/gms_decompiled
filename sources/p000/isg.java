package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import com.google.android.gms.common.api.Status;

/* renamed from: isg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class isg extends dcj implements isi {
    public isg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.ISignedResultCallback");
    }

    /* renamed from: a */
    public final void mo13176a(SignedBlob signedBlob) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, signedBlob);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13177a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
