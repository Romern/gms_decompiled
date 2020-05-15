package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnListEntriesResponse;

/* renamed from: usb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1597usb extends utn {

    /* renamed from: a */
    private final rlf f48590a;

    /* renamed from: a */
    public final void mo27107a(Status status) {
        this.f48590a.mo9482a(new usa(status, null, false));
    }

    public C1597usb(rlf rlf) {
        this.f48590a = rlf;
    }

    /* renamed from: a */
    public final void mo27947a(OnListEntriesResponse onListEntriesResponse) {
        this.f48590a.mo9482a(new usa(Status.f30107a, new txb(onListEntriesResponse.f30889b), onListEntriesResponse.f30890c));
    }
}
