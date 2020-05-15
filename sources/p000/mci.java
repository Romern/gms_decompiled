package p000;

/* renamed from: mci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mci implements bqfp {

    /* renamed from: a */
    final /* synthetic */ mcj f33414a;

    public mci(mcj mcj) {
        this.f33414a = mcj;
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        if (!this.f33414a.mo69138b(obj)) {
            this.f33414a.f33415a.mo25418e("Attempted to successfully set result of RetryingListenableFuture but it had already been set.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        int i;
        synchronized (this.f33414a) {
            mcj mcj = this.f33414a;
            i = mcj.f33417c;
            mcj.f33417c = i + 1;
        }
        if (this.f33414a.isCancelled()) {
            this.f33414a.f33415a.mo25412b("RetryingListenableFuture was cancelled after %d/%d retries, not retrying again.", Integer.valueOf(i), Integer.valueOf(this.f33414a.f33416b));
            return;
        }
        mcj mcj2 = this.f33414a;
        if (i < mcj2.f33416b) {
            mal mal = mcj2.f33418d;
            if (mal != null) {
                mao mao = mal.f33345a;
                int i2 = mal.f33346b;
                mao.f33349a.mo25415d("Retrying after error trying to switch transport to %s (%d/%d retries)", th, mao.m24769a(i2), Integer.valueOf(i), Integer.valueOf(mao.f33354e));
            }
            this.f33414a.mo19849b();
        } else if (!mcj2.mo69136a(th)) {
            this.f33414a.f33415a.mo25418e("Attempted to set error for RetryingListenableFuture, but had already been set.", new Object[0]);
        }
    }
}
