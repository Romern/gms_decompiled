package p000;

/* renamed from: cbal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cbal extends cbaf {

    /* renamed from: b */
    private final bngx f176477b;

    public cbal(bngx bngx) {
        this.f176477b = bngx;
    }

    /* renamed from: a */
    public final void mo75213a() {
        bnre i = this.f176477b.listIterator();
        while (i.hasNext()) {
            cbaf cbaf = (cbaf) i.next();
            try {
                cbaf.mo75213a();
            } catch (RuntimeException e) {
                cbar.m127679a(e, cbaf, "requested");
            }
        }
    }

    /* renamed from: b */
    public final void mo75216b() {
        bnre i = this.f176477b.listIterator();
        while (i.hasNext()) {
            cbaf cbaf = (cbaf) i.next();
            try {
                cbaf.mo75216b();
            } catch (RuntimeException e) {
                cbar.m127679a(e, cbaf, "ready");
            }
        }
    }

    /* renamed from: c */
    public final void mo75217c() {
        bnre i = this.f176477b.listIterator();
        while (i.hasNext()) {
            cbaf cbaf = (cbaf) i.next();
            try {
                cbaf.mo75217c();
            } catch (RuntimeException e) {
                cbar.m127679a(e, cbaf, "methodStarting");
            }
        }
    }

    /* renamed from: d */
    public final void mo75218d() {
        bnre i = this.f176477b.mo67670d().listIterator();
        while (i.hasNext()) {
            cbaf cbaf = (cbaf) i.next();
            try {
                cbaf.mo75218d();
            } catch (RuntimeException e) {
                cbar.m127679a(e, cbaf, "methodFinished");
            }
        }
    }

    /* renamed from: a */
    public final void mo75214a(Object obj) {
        bnre i = this.f176477b.mo67670d().listIterator();
        while (i.hasNext()) {
            cbaf cbaf = (cbaf) i.next();
            try {
                cbaf.mo75214a(obj);
            } catch (RuntimeException e) {
                cbar.m127680a(e, cbaf, "succeeded", obj);
            }
        }
    }

    /* renamed from: a */
    public final void mo75215a(Throwable th) {
        bnre i = this.f176477b.mo67670d().listIterator();
        while (i.hasNext()) {
            cbaf cbaf = (cbaf) i.next();
            try {
                cbaf.mo75215a(th);
            } catch (RuntimeException e) {
                cbar.m127680a(e, cbaf, "failed", th);
            }
        }
    }
}
