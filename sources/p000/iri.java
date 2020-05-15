package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.HashResult;
import com.google.android.gms.common.api.Status;

/* renamed from: iri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iri extends dcj implements irk {
    public iri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IHmacResultCallback");
    }

    /* renamed from: a */
    public final void mo13297a(HashResult hashResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, hashResult);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13298a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
