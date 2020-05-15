package p000;

/* renamed from: bqdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqdm implements Runnable {

    /* renamed from: a */
    final bqdt f140514a;

    /* renamed from: b */
    final bqgg f140515b;

    public bqdm(bqdt bqdt, bqgg bqgg) {
        this.f140514a = bqdt;
        this.f140515b = bqgg;
    }

    public final void run() {
        bqdt bqdt = this.f140514a;
        boolean z = bqdt.f140525j;
        if (bqdt.value == this) {
            if (bqdt.f140526k.mo69130a(this.f140514a, this, bqdt.m112647a(this.f140515b))) {
                bqdt.m112650a(this.f140514a);
            }
        }
    }
}
