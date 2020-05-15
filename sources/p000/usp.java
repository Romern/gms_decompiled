package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnDriveIdResponse;

/* renamed from: usp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class usp extends utn {

    /* renamed from: a */
    private final rlf f48612a;

    /* renamed from: a */
    public final void mo27107a(Status status) {
        this.f48612a.mo9482a(new usq(status, null));
    }

    public usp(rlf rlf) {
        this.f48612a = rlf;
    }

    /* renamed from: a */
    public final void mo27945a(OnDriveIdResponse onDriveIdResponse) {
        this.f48612a.mo9482a(new usq(Status.f30107a, new usx(onDriveIdResponse.f30880a)));
    }
}
