package p000;

/* renamed from: fkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fkz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ flb f16828a;

    public fkz(flb flb) {
        this.f16828a = flb;
    }

    public final void run() {
        flb flb = this.f16828a;
        flb.mo10954t();
        flb.mo10943h();
        flb.mo10949n().mo11050b();
        if (!flb.mo10992a("android.permission.ACCESS_NETWORK_STATE")) {
            flb.mo10942g("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            flb.mo10996v();
        }
        if (!flb.mo10992a("android.permission.INTERNET")) {
            flb.mo10942g("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            flb.mo10996v();
        }
        if (foe.m12065a(flb.mo10939f())) {
            flb.mo10933d("AnalyticsService registered in the app manifest and enabled");
        } else {
            flb.mo10943h();
            flb.mo10942g("Device AnalyticsService not registered! Hits will not be delivered reliably.");
        }
        if (!flb.f16842i) {
            flb.mo10943h();
        }
        flb.mo10994c();
    }
}
