package p000;

/* renamed from: bvca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvca implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bvch f155575a;

    /* renamed from: b */
    private final bvcg f155576b;

    public bvca(bvch bvch, bvcg bvcg) {
        this.f155575a = bvch;
        this.f155576b = bvcg;
    }

    public final void run() {
        this.f155575a.f155592e.add(this.f155576b);
        bvch bvch = this.f155575a;
        bvch.f155589b.post(bvch.f155594g);
        this.f155575a.f155591d.mo67310c(this.f155576b, this);
    }
}
