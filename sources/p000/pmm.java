package p000;

/* renamed from: pmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pmm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ pmn f39705a;

    /* renamed from: b */
    private final String f39706b;

    /* renamed from: c */
    private pml f39707c;

    public pmm(pmn pmn, String str) {
        this.f39705a = pmn;
        this.f39706b = str;
    }

    /* renamed from: a */
    public final void mo23419a() {
        synchronized (this.f39705a.f39717j) {
            pmn pmn = this.f39705a;
            int i = pmn.f39720m - 1;
            pmn.f39720m = i;
            if (i == 0 && !pmn.f39721n) {
                pmn pmn2 = this.f39705a;
                pmn2.mo23423a(pmn2.f39715h, pmn2.f39716i);
            }
        }
    }

    public final void run() {
        pmk pmk;
        boolean z;
        pnp a = this.f39705a.mo23421a(this.f39706b);
        if (a == null) {
            this.f39707c = new pml(this);
            synchronized (pmn.f39710e) {
                pmk = (pmk) pmn.f39710e.get(this.f39706b);
                z = true;
                if (pmk == null) {
                    pmn pmn = this.f39705a;
                    pmk = new pmk(pmn.f39714g, pmn.f39719l, pmn.f39718k, this.f39706b);
                    pmk.mo23416a(this.f39707c);
                    pmn.f39710e.put(this.f39706b, pmk);
                    pmk.mo23417b();
                    z = false;
                } else if (!this.f39705a.f39713d) {
                    pmk.mo23416a(this.f39707c);
                }
            }
            if (this.f39705a.f39713d && z) {
                pmk.mo23416a(this.f39707c);
                return;
            }
            return;
        }
        if (a.f39863b) {
            this.f39705a.f39715h.add(this.f39706b);
        }
        mo23419a();
    }
}
