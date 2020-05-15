package p000;

/* renamed from: aovb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aovb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f83657a;

    /* renamed from: b */
    final /* synthetic */ aovd f83658b;

    public aovb(aovd aovd, String str) {
        this.f83658b = aovd;
        this.f83657a = str;
    }

    public final void run() {
        this.f83658b.f83666e.remove(this.f83657a);
    }
}
