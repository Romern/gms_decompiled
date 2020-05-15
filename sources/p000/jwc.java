package p000;

import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: jwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jwc implements aubg {

    /* renamed from: a */
    final /* synthetic */ PreAddAccountChimeraActivity f23392a;

    public jwc(PreAddAccountChimeraActivity preAddAccountChimeraActivity) {
        this.f23392a = preAddAccountChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7031a(aucb aucb) {
        if (((auck) aucb).f91396d) {
            PreAddAccountChimeraActivity.f11420a.mo25416d("Task is cancelled", new Object[0]);
            return aucu.m76776a();
        } else if (aucb.mo50384b()) {
            if (!ccaf.f178620a.mo6606a().mo75656a()) {
                sre.m36087g(this.f23392a);
                return aucu.m76778a((Object) null);
            } else if (PreAddAccountChimeraActivity.f11423d == null) {
                PreAddAccountChimeraActivity.f11420a.mo25416d("PhenotypeClient is null", new Object[0]);
                return aucu.m76776a();
            } else {
                PreAddAccountChimeraActivity.f11420a.mo25412b("Doing Phenotype commit", new Object[0]);
                return PreAddAccountChimeraActivity.f11423d.mo25233a(((Configurations) aucb.mo50386d()).f82074a);
            }
        } else if (aucb.mo50387e() != null) {
            return aucu.m76777a(aucb.mo50387e());
        } else {
            PreAddAccountChimeraActivity.f11420a.mo25416d("Task was not successful, but exception is null", new Object[0]);
            return aucu.m76776a();
        }
    }
}
