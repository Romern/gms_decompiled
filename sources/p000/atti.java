package p000;

import android.content.Intent;

/* renamed from: atti */
final /* synthetic */ class atti implements aubq {

    /* renamed from: a */
    private final attj f90872a;

    public atti(attj attj) {
        this.f90872a = attj;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        attj attj = this.f90872a;
        if (aucb.mo50384b()) {
            atsy atsy = attj.f90898f.f108906c;
            if (!attj.f90876d) {
                Intent component = new Intent().setComponent(attj.f90874b);
                if (attj.f90898f.getPackageManager().queryIntentActivities(component, 0).isEmpty()) {
                    attj.mo50189c();
                    return;
                }
                attj.f90875c = true;
                attj.mo50181a(component, 1010);
            } else if (cgwn.m147269s()) {
                attj.mo50180a(31, atsy);
            } else {
                attj.mo50180a(11, atsy);
            }
        } else {
            bnsl bnsl = (bnsl) attj.f90873a.mo68387b();
            bnsl.mo68432a("attj", "a", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error while accepting Felica ToS");
            attj.mo50178a();
        }
    }
}
