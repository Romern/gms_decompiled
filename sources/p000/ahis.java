package p000;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

@Deprecated
/* renamed from: ahis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahis {

    /* renamed from: a */
    public final PayloadTransferUpdate f67256a;

    public ahis() {
        this.f67256a = new PayloadTransferUpdate();
    }

    /* renamed from: a */
    public final void mo36540a(int i) {
        this.f67256a.f80477b = i;
    }

    /* renamed from: a */
    public final void mo36541a(long j) {
        this.f67256a.f80479d = j;
    }

    /* renamed from: b */
    public final void mo36542b(long j) {
        this.f67256a.f80476a = j;
    }

    /* renamed from: c */
    public final void mo36543c(long j) {
        this.f67256a.f80478c = j;
    }

    public ahis(PayloadTransferUpdate payloadTransferUpdate) {
        PayloadTransferUpdate payloadTransferUpdate2 = new PayloadTransferUpdate();
        this.f67256a = payloadTransferUpdate2;
        payloadTransferUpdate2.f80476a = payloadTransferUpdate.f80476a;
        payloadTransferUpdate2.f80477b = payloadTransferUpdate.f80477b;
        payloadTransferUpdate2.f80478c = payloadTransferUpdate.f80478c;
        payloadTransferUpdate2.f80479d = payloadTransferUpdate.f80479d;
    }
}
