package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnSyncMoreResponse;

/* renamed from: usl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class usl extends utn {

    /* renamed from: a */
    private final rlf f48598a;

    /* renamed from: a */
    public final void mo27107a(Status status) {
        this.f48598a.mo9482a(new usm(status));
    }

    public usl(rlf rlf) {
        this.f48598a = rlf;
    }

    /* renamed from: a */
    public final void mo27950a(OnSyncMoreResponse onSyncMoreResponse) {
        this.f48598a.mo9482a(new usm(Status.f30107a));
    }
}
