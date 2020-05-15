package p000;

/* renamed from: atly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atly implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f90461a;

    /* renamed from: b */
    final /* synthetic */ atlz f90462b;

    public atly(atlz atlz, String str) {
        this.f90462b = atlz;
        this.f90461a = str;
    }

    public final void run() {
        this.f90462b.f90464b.mo24734b(this.f90461a, cgxl.f187974a.mo6606a().mo84682c());
        this.f90462b.mo50036b().postDelayed(this, cgxl.f187974a.mo6606a().mo84680a());
    }
}
