package p000;

/* renamed from: drp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class drp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f13885a;

    /* renamed from: b */
    final /* synthetic */ long f13886b;

    /* renamed from: c */
    final /* synthetic */ dqx f13887c;

    /* renamed from: d */
    final /* synthetic */ drv f13888d;

    public drp(drv drv, Runnable runnable, long j, dqx dqx) {
        this.f13888d = drv;
        this.f13885a = runnable;
        this.f13886b = j;
        this.f13887c = dqx;
    }

    public final void run() {
        this.f13888d.f13907d.mo6255a(this.f13885a, this.f13886b, this.f13887c);
    }
}
