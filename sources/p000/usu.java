package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnMetadataResponse;

/* renamed from: usu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class usu extends utn {

    /* renamed from: a */
    private final rlf f48619a;

    /* renamed from: a */
    public final void mo27107a(Status status) {
        this.f48619a.mo9482a(new usv(status, null));
    }

    public usu(rlf rlf) {
        this.f48619a = rlf;
    }

    /* renamed from: a */
    public final void mo27946a(OnMetadataResponse onMetadataResponse) {
        this.f48619a.mo9482a(new usv(Status.f30107a, new urr(onMetadataResponse.f30893a)));
    }
}
