package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import com.google.android.gms.drive.internal.OnMetadataResponse;

/* renamed from: urx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class urx extends utn {

    /* renamed from: a */
    private final rlf f48580a;

    /* renamed from: a */
    public final void mo27107a(Status status) {
        this.f48580a.mo9482a(new ury(status, null));
    }

    public urx(rlf rlf) {
        this.f48580a = rlf;
    }

    /* renamed from: a */
    public final void mo27945a(OnDriveIdResponse onDriveIdResponse) {
        this.f48580a.mo9482a(new ury(Status.f30107a, onDriveIdResponse.f30880a));
    }

    /* renamed from: a */
    public final void mo27946a(OnMetadataResponse onMetadataResponse) {
        this.f48580a.mo9482a(new ury(Status.f30107a, new urr(onMetadataResponse.f30893a).mo26854a()));
    }
}
