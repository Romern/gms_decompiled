package p000;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: mlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mlp extends ahir {

    /* renamed from: a */
    final /* synthetic */ mlq f33955a;

    public mlp(mlq mlq) {
        this.f33955a = mlq;
    }

    /* renamed from: a */
    public final void mo20150a(String str, ahiq ahiq) {
        mlq.f33956a.mo25412b("onPayloadReceived(type=%d, id=%s)", Integer.valueOf(ahiq.f67252b), Long.valueOf(ahiq.f67251a));
        this.f33955a.f33958c.execute(new mln(this, ahiq));
    }

    /* renamed from: a */
    public final void mo20151a(String str, PayloadTransferUpdate payloadTransferUpdate) {
        mlq.f33956a.mo25412b("onPayloadTransferUpdate(status=%d, id=%d)", Integer.valueOf(payloadTransferUpdate.f80477b), Long.valueOf(payloadTransferUpdate.f80476a));
        this.f33955a.f33958c.execute(new mlo(this, payloadTransferUpdate));
    }
}
