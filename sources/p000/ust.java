package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnListParentsResponse;

/* renamed from: ust */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ust extends utn {

    /* renamed from: a */
    private final rlf f48618a;

    /* renamed from: a */
    public final void mo27107a(Status status) {
        this.f48618a.mo9482a(new usa(status, null, false));
    }

    public ust(rlf rlf) {
        this.f48618a = rlf;
    }

    /* renamed from: a */
    public final void mo27952a(OnListParentsResponse onListParentsResponse) {
        this.f48618a.mo9482a(new usa(Status.f30107a, new txb(onListParentsResponse.f30891b), false));
    }
}
