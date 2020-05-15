package p000;

/* renamed from: aubr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aucb f91369a;

    /* renamed from: b */
    final /* synthetic */ aubs f91370b;

    public aubr(aubs aubs, aucb aucb) {
        this.f91370b = aubs;
        this.f91369a = aucb;
    }

    public final void run() {
        synchronized (this.f91370b.f91371a) {
            aubt aubt = this.f91370b.f91372b;
            if (aubt != null) {
                aubt.mo10476a(this.f91369a.mo50387e());
            }
        }
    }
}
