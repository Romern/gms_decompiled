package p000;

/* renamed from: lwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lwl extends bzsu {

    /* renamed from: a */
    final /* synthetic */ lwm f33117a;

    public lwl(lwm lwm) {
        this.f33117a = lwm;
    }

    /* renamed from: a */
    public final void mo19706a() {
        lwm.f33118a.mo25412b("Transfer started", new Object[0]);
    }

    /* renamed from: a */
    public final void mo19707a(bzsq bzsq) {
        lwm.f33118a.mo25409a("Progress: uploaded %d bytes", Long.valueOf(bzsq.mo74571d()));
    }

    /* renamed from: a */
    public final void mo19708a(bzsq bzsq, bzsb bzsb) {
        lwm.f33118a.mo25412b("Response received with code %d", Integer.valueOf(bzsb.f171220a));
        this.f33117a.f33119b.mo69138b(bzsb);
    }

    /* renamed from: a */
    public final void mo19709a(bzsq bzsq, bzss bzss) {
        lwm.f33118a.mo25417e("Exception during transfer", bzss, new Object[0]);
        this.f33117a.f33119b.mo69136a((Throwable) bzss);
    }
}
