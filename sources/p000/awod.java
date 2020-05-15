package p000;

/* renamed from: awod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awod implements Runnable {

    /* renamed from: a */
    final /* synthetic */ awog f94703a;

    public awod(awog awog) {
        this.f94703a = awog;
    }

    public final void run() {
        int childCount = this.f94703a.f94714i.getChildCount();
        for (int i = 0; i < childCount; i++) {
            awog awog = this.f94703a;
            awia.m79974a(awog.f123962aG, awog.f94714i.getChildAt(i));
        }
        if (this.f94703a.f94713h.getVisibility() == 0) {
            bkcd.m105304a(this.f94703a.f94713h, 0);
        }
        if (this.f94703a.f94716k.getVisibility() == 0) {
            bkcd.m105304a(this.f94703a.f94716k, 0);
        }
        this.f94703a.f95357A.setVisibility(0);
    }
}
