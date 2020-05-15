package p000;

/* renamed from: osf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class osf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bpdn f38311a;

    /* renamed from: b */
    final /* synthetic */ bpdo f38312b;

    /* renamed from: c */
    final /* synthetic */ String f38313c;

    /* renamed from: d */
    final /* synthetic */ osh f38314d;

    public osf(osh osh, bpdn bpdn, bpdo bpdo, String str) {
        this.f38314d = osh;
        this.f38311a = bpdn;
        this.f38312b = bpdo;
        this.f38313c = str;
    }

    public final void run() {
        this.f38314d.f38316a.mo17418b(this.f38311a, this.f38312b, this.f38313c);
    }
}
