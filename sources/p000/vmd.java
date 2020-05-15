package p000;

/* renamed from: vmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vmd implements rkl {

    /* renamed from: a */
    final /* synthetic */ vme f49488a;

    public vmd(vme vme) {
        this.f49488a = vme;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        usm usm = (usm) rkk;
        if (usm.f48599a.mo17710c()) {
            vme.f49489a.mo25371b("Sync more success, requerying");
            this.f49488a.m40841a(false, true);
            return;
        }
        vme.f49489a.mo25374b("FileListAdapter", "Could not sync more (%s)", usm.f48599a.f30116j);
        vme vme = this.f49488a;
        vme.f49494g = false;
        vme.mo160O(vme.f49492e.mo28682a());
    }
}
