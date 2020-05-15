package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: gwp */
final /* synthetic */ class gwp implements gwu {

    /* renamed from: a */
    private final hvt f19128a;

    public gwp(hvt hvt) {
        this.f19128a = hvt;
    }

    /* renamed from: a */
    public final void mo12286a(Status status, Object obj) {
        hvt hvt = this.f19128a;
        Parcel bj = hvt.mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, (BeginSignInResult) obj);
        hvt.mo8530c(1, bj);
    }
}
