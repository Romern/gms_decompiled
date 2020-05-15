package p000;

/* renamed from: arbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arbf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f87270a;

    /* renamed from: b */
    final /* synthetic */ arbg f87271b;

    public arbf(arbg arbg, int i) {
        this.f87271b = arbg;
        this.f87270a = i;
    }

    public final void run() {
        sek sek = arbj.f87275a;
        String valueOf = String.valueOf(ahcu.m55496a(this.f87270a));
        sek.mo25418e(valueOf.length() == 0 ? new String("Nearby.Bootstrap DataListener error: ") : "Nearby.Bootstrap DataListener error: ".concat(valueOf), new Object[0]);
        armu armu = this.f87271b.f87272a.f87279e;
        if (armu != null) {
            armu.mo48348a(10557);
        }
    }
}
