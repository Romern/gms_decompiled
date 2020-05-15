package p000;

/* renamed from: xht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xht extends bqdt {

    /* renamed from: a */
    bngx f52319a;

    public xht(bngx bngx) {
        this.f52319a = bngx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        bngx bngx = this.f52319a;
        this.f52319a = null;
        if (bngx != null && isCancelled()) {
            boolean e = mo69140e();
            bnre i = bngx.listIterator();
            while (i.hasNext()) {
                ((bqgg) i.next()).cancel(e);
            }
        }
    }
}
