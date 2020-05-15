package p000;

/* renamed from: agut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agut implements agvd {

    /* renamed from: a */
    Exception f66603a;

    /* renamed from: b */
    final /* synthetic */ agtw f66604b;

    public agut(agtw agtw) {
        this.f66604b = agtw;
    }

    /* renamed from: a */
    public final void mo36126a(Exception exc) {
        this.f66603a = exc;
        agrl.m54942a().mo35987a(32, exc.toString(), (String) null, bygd.API_TIMEOUT, System.currentTimeMillis(), agvh.m55172b());
    }

    public final void run() {
        this.f66604b.mo36095a(this.f66603a);
    }
}
