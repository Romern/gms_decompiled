package p000;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: arnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arnl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f87970a;

    /* renamed from: b */
    final /* synthetic */ PayloadTransferUpdate f87971b;

    /* renamed from: c */
    final /* synthetic */ arnm f87972c;

    public arnl(arnm arnm, String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.f87972c = arnm;
        this.f87970a = str;
        this.f87971b = payloadTransferUpdate;
    }

    public final void run() {
        this.f87972c.f87974b.mo20151a(this.f87970a, this.f87971b);
    }
}
