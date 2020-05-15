package p000;

/* renamed from: asee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asee {

    /* renamed from: a */
    final /* synthetic */ aseg f88751a;

    public asee(aseg aseg) {
        this.f88751a = aseg;
    }

    /* renamed from: a */
    public final void mo49086a(boolean z) {
        if (!z) {
            this.f88751a.f88761f.countDown();
            long count = this.f88751a.f88761f.getCount();
            StringBuilder sb = new StringBuilder(86);
            sb.append("Remaining verification failures before we've exhausted all certs: ");
            sb.append(count);
            sb.toString();
            if (this.f88751a.f88761f.getCount() <= 0) {
                this.f88751a.f88760e.mo49088a(false);
                return;
            }
            return;
        }
        this.f88751a.f88760e.mo49088a(true);
    }
}
