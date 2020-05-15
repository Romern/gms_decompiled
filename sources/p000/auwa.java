package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: auwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auwa implements rkl {

    /* renamed from: a */
    final /* synthetic */ auwc f92630a;

    public auwa(auwc auwc) {
        this.f92630a = auwc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        if (((Status) rkk).mo17710c()) {
            auwc.f92631a.mo50711a("successfully removed the activity updates.", new Object[0]).mo50708c();
        } else {
            auwc.f92631a.mo50711a("Failed to remove the activity updates.", new Object[0]).mo50708c();
        }
        this.f92630a.f92644n.mo24803g();
    }
}
