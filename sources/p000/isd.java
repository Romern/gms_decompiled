package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.common.api.Status;

/* renamed from: isd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class isd extends dcj implements isf {
    public isd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.ISignCryptResultCallback");
    }

    /* renamed from: a */
    public final void mo13312a(SignCryptedBlob signCryptedBlob) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, signCryptedBlob);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13313a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
