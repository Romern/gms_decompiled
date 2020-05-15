package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.common.api.Status;

/* renamed from: isa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class isa extends dcj implements isc {
    public isa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IRetrievePublicKeyCallback");
    }

    /* renamed from: a */
    public final void mo13310a(CryptauthPublicKey cryptauthPublicKey) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, cryptauthPublicKey);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13311a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
