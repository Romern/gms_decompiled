package p000;

/* renamed from: bfvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfvp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfvq f115432a;

    public bfvp(bfvq bfvq) {
        this.f115432a = bfvq;
    }

    public final void run() {
        bgnt bgnt = this.f115432a.f115433a;
        if (bgnt != null) {
            bgnt.mo61097E();
            this.f115432a.f115433a = null;
        }
        this.f115432a.mo62323e();
    }
}
