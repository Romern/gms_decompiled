package p000;

import com.google.android.gms.drive.p039ui.select.Selection;

/* renamed from: vnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vnb implements rkl {

    /* renamed from: a */
    final /* synthetic */ Selection f49571a;

    public vnb(Selection selection) {
        this.f49571a = selection;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        usv usv = (usv) rkk;
        if (usv.f48620a.mo17710c()) {
            this.f49571a.mo18335b(usv.f48621b);
            return;
        }
        Selection.f31198a.mo25374b("Selection", "Could not get metadata for %s (%s)", this.f49571a.f31200c, usv.f48620a.f30116j);
    }
}
